package com.bjsxt.mock;


import org.apache.commons.lang.Validate;

/**
 * Created by  Mark L Tao on 2016/8/4 15:18.
 */
public class AllocationLegValidator {

    public void counterpartyValidator(AllocationSnapshot snapshot) {
        for (AllocationLegSnapshot allocationLegSnapshot : snapshot.getAllocationLegs()) {
            Validate.notEmpty(allocationLegSnapshot.getCounterParty().getCounterPartyPOGroup(), "POGroup must be specified");
            Validate.notEmpty(allocationLegSnapshot.getCounterParty().getCounterPartyPOUnit(), "POUnit must be specified");
            Validate.notEmpty(allocationLegSnapshot.getCounterParty().getCounterPartyIdentifier(), "Counterparty must be specified");
        }
    }

    public void ccyValidator(AllocationSnapshot snapshot) {
        String ccyPair = getBlockTradeCcyPair(snapshot);
        for (AllocationLegSnapshot allocationLegSnapshot : snapshot.getAllocationLegs()) {
            String BaseCurrency = allocationLegSnapshot.getBaseCurrency();
            ccyLoop(BaseCurrency);
            String CounterCurrency = allocationLegSnapshot.getCounterCurrency();
            ccyLoop(CounterCurrency);
            validateCcyMatch(ccyPair, BaseCurrency, CounterCurrency);
        }
    }

    private String getBlockTradeCcyPair(AllocationSnapshot snapshot) {
        BlockTradeSnapshot blockTradeSnapshot = snapshot.getBlocks().get(0);

        String ccyPair = blockTradeSnapshot.getQuoteConvention();
        Validate.notEmpty(ccyPair, "Illegal to create pair instance from null pair string");
        if (ccyPair.length() != 6) {
            throw new IllegalArgumentException("Pair string must be in CCYCCY format: " + ccyPair);
        }
        return ccyPair;
    }

    private void ccyLoop(String ccyCodeStr) {
        Validate.notNull(ccyCodeStr, "Illegal to create currency instance from null string");
        if (ccyCodeStr.length() != 3) {
            throw new IllegalArgumentException("Currency code string must be in 3 characters");
        }
    }

    private void validateCcyMatch(String blockCcyPair, String fromCcy, String toCcy) {
        String majorCcy = blockCcyPair.substring(0, 3);
        String minorCcy = blockCcyPair.substring(3);
        if (majorCcy != null && minorCcy != null) {
            boolean currencyPairMatch = majorCcy.equals(fromCcy) && minorCcy.equals(toCcy);
            if (!currencyPairMatch) {
                currencyPairMatch = minorCcy.equals(fromCcy) && majorCcy.equals(toCcy);
            }
            if (!currencyPairMatch) {
                throw new IllegalArgumentException("Wrong Leg Currency pair " + fromCcy + toCcy);
            }
        }
    }

    public void productInfoValidator(AllocationSnapshot snapshot) {
        BlockTradeSnapshot blockTradeSnapshot = snapshot.getBlocks().get(0);
        Validate.notNull(blockTradeSnapshot.getProduct(), "Product Code must be specified");
        Validate.notNull(blockTradeSnapshot.getValueDate(), "Value date must be specified");
        for (AllocationLegSnapshot allocationLegSnapshot : snapshot.getAllocationLegs()) {
            Validate.notNull(allocationLegSnapshot.getBaseCurrency(), "Major currency must be specified");
            Validate.notNull(allocationLegSnapshot.getCounterCurrency(), "Minor currency must be specified");
            Validate.notNull(allocationLegSnapshot.getTradingAmount(), "Major amount must be specified");
            Validate.notNull(allocationLegSnapshot.getCounterAmount(), "Minor amount must be specified");
            Validate.notNull(allocationLegSnapshot.getBuySell(), "Buy or sell Flag must be specified");
        }
    }

    public void swapPointValidator(AllocationSnapshot snapshot) {
        String ccyPair = getBlockTradeCcyPair(snapshot);
        String majorCcy = ccyPair.substring(0, 3);
        Validate.notNull(ccyPair, "Currency pair must be specified");
        Validate.notNull(majorCcy, "Base currency must be specified");
        BlockTradeSnapshot blockTradeSnapshot = snapshot.getBlocks().get(0);
        String product = blockTradeSnapshot.getProduct();
        if(Products.FWD.equals(product)){
            Validate.notNull(blockTradeSnapshot.getTraderForwardPts(), "Wholesale swap point must be specified");
            Validate.notNull(blockTradeSnapshot.getForwardPts(), "Contract swap point must be specified");
        }
        Validate.notNull(blockTradeSnapshot.getSpotRate(), "Contract spot rate must must be specified");
        Validate.notNull(blockTradeSnapshot.getTraderSpotRate(), "Wholesale spot rate must be specified");

    }

}

