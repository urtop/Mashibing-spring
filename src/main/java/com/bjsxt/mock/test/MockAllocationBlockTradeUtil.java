package com.bjsxt.mock.test;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class MockAllocationBlockTradeUtil {

    public static List<BlockTradeSnapshot> mockBlockTradeCcy() {
        BlockTradeSnapshot blockTrade = mock(BlockTradeSnapshot.class);
        given(blockTrade.getQuoteConvention()).willReturn("GBPUSD");
        List<BlockTradeSnapshot> resultList = new ArrayList<>();
        resultList.add(blockTrade);
        return resultList;
    }

    public static List<BlockTradeSnapshot> mockBlockTradeCcyWithEmptyCcyPair() {
        BlockTradeSnapshot blockTrade = mock(BlockTradeSnapshot.class);
        given(blockTrade.getQuoteConvention()).willReturn("");
        List<BlockTradeSnapshot> resultList = new ArrayList<>();
        resultList.add(blockTrade);
        return resultList;
    }

    public static List<BlockTradeSnapshot> mockBlockTradeWithProductInfo() {
        BlockTradeSnapshot blockTradeSnapshot = mock(BlockTradeSnapshot.class);
        given(blockTradeSnapshot.getProduct()).willReturn("SPT");
        given(blockTradeSnapshot.getValueDate()).willReturn("2016-04-22");
        List<BlockTradeSnapshot> resultList = new ArrayList<>();
        resultList.add(blockTradeSnapshot);
        return resultList;
    }

    public static List<BlockTradeSnapshot> mockBlockTradeWithNullProductInfo() {
        BlockTradeSnapshot blockTradeSnapshot = mock(BlockTradeSnapshot.class);
        given(blockTradeSnapshot.getProduct()).willReturn(null);
        given(blockTradeSnapshot.getValueDate()).willReturn("2016-04-22");
        List<BlockTradeSnapshot> resultList = new ArrayList<>();
        resultList.add(blockTradeSnapshot);
        return resultList;
    }


    public static List<BlockTradeSnapshot> mockBlockTradeWithNullValueDate() {
        BlockTradeSnapshot blockTradeSnapshot = mock(BlockTradeSnapshot.class);
        given(blockTradeSnapshot.getProduct()).willReturn("SPT");
        given(blockTradeSnapshot.getValueDate()).willReturn(null);
        List<BlockTradeSnapshot> resultList = new ArrayList<>();
        resultList.add(blockTradeSnapshot);
        return resultList;
    }

    public static List<BlockTradeSnapshot> mockBlockTradeWithFullSwapPointInfoForSp() {
        BlockTradeSnapshot blockTradeSnapshot = mock(BlockTradeSnapshot.class);
        given(blockTradeSnapshot.getProduct()).willReturn("SPT");
        given(blockTradeSnapshot.getQuoteConvention()).willReturn("GBPUSD");
        given(blockTradeSnapshot.getSpotRate()).willReturn(new BigDecimal(1.4227));
        given(blockTradeSnapshot.getTraderSpotRate()).willReturn(new BigDecimal(1.4371));
        List<BlockTradeSnapshot> resultList = new ArrayList<>();
        resultList.add(blockTradeSnapshot);
        return resultList;
    }

    public static List<BlockTradeSnapshot> mockBlockTradeWithNullSpotRateSwapPointInfoForSp() {
        BlockTradeSnapshot blockTradeSnapshot = mock(BlockTradeSnapshot.class);
        given(blockTradeSnapshot.getProduct()).willReturn("SPT");
        given(blockTradeSnapshot.getQuoteConvention()).willReturn("GBPUSD");
        given(blockTradeSnapshot.getSpotRate()).willReturn(null);
        given(blockTradeSnapshot.getTraderSpotRate()).willReturn(new BigDecimal(1.4371));
        List<BlockTradeSnapshot> resultList = new ArrayList<>();
        resultList.add(blockTradeSnapshot);
        return resultList;
    }


    public static List<BlockTradeSnapshot> mockBlockTradeWithNullTradeSpotRateSwapPointInfoForSp() {
        BlockTradeSnapshot blockTradeSnapshot = mock(BlockTradeSnapshot.class);
        given(blockTradeSnapshot.getProduct()).willReturn("SPT");
        given(blockTradeSnapshot.getQuoteConvention()).willReturn("GBPUSD");
        given(blockTradeSnapshot.getSpotRate()).willReturn(new BigDecimal(1.4227));
        given(blockTradeSnapshot.getTraderSpotRate()).willReturn(null);
        List<BlockTradeSnapshot> resultList = new ArrayList<>();
        resultList.add(blockTradeSnapshot);
        return resultList;


    }


    public static List<BlockTradeSnapshot> mockBlockTradeWithFullSwapPointInfoForFwd() {
        BlockTradeSnapshot blockTradeSnapshot = mock(BlockTradeSnapshot.class);
        given(blockTradeSnapshot.getProduct()).willReturn("FWD");
        given(blockTradeSnapshot.getQuoteConvention()).willReturn("GBPUSD");
        given(blockTradeSnapshot.getSpotRate()).willReturn(new BigDecimal(1.4227));
        given(blockTradeSnapshot.getTraderSpotRate()).willReturn(new BigDecimal(1.4371));
        given(blockTradeSnapshot.getTraderForwardPts()).willReturn(new BigDecimal(1.1));
        given(blockTradeSnapshot.getForwardPts()).willReturn(new BigDecimal(0.3));

        List<BlockTradeSnapshot> resultList = new ArrayList<>();
        resultList.add(blockTradeSnapshot);
        return resultList;
    }


    public static List<BlockTradeSnapshot> mockBlockTradeWithNullTradeForwardPtsForFwd() {
        BlockTradeSnapshot blockTradeSnapshot = mock(BlockTradeSnapshot.class);
        given(blockTradeSnapshot.getProduct()).willReturn("FWD");
        given(blockTradeSnapshot.getQuoteConvention()).willReturn("GBPUSD");
        given(blockTradeSnapshot.getSpotRate()).willReturn(new BigDecimal(1.4227));
        given(blockTradeSnapshot.getTraderSpotRate()).willReturn(new BigDecimal(1.4371));
        given(blockTradeSnapshot.getTraderForwardPts()).willReturn(null);
        given(blockTradeSnapshot.getForwardPts()).willReturn(new BigDecimal(0.3));

        List<BlockTradeSnapshot> resultList = new ArrayList<>();
        resultList.add(blockTradeSnapshot);
        return resultList;
    }

    public static List<BlockTradeSnapshot> mockBlockTradeWithNullForwardPtsForFwd() {
        BlockTradeSnapshot blockTradeSnapshot = mock(BlockTradeSnapshot.class);
        given(blockTradeSnapshot.getProduct()).willReturn("FWD");
        given(blockTradeSnapshot.getQuoteConvention()).willReturn("GBPUSD");
        given(blockTradeSnapshot.getSpotRate()).willReturn(new BigDecimal(1.4227));
        given(blockTradeSnapshot.getTraderSpotRate()).willReturn(new BigDecimal(1.4371));
        given(blockTradeSnapshot.getTraderForwardPts()).willReturn(new BigDecimal(1.1));
        given(blockTradeSnapshot.getForwardPts()).willReturn(null);

        List<BlockTradeSnapshot> resultList = new ArrayList<>();
        resultList.add(blockTradeSnapshot);
        return resultList;
    }

    public static List<BlockTradeSnapshot> mockBlockTradeWithTradeUti(){
        BlockTradeSnapshot blockTradeSnapshot = mock(BlockTradeSnapshot.class);
        given(blockTradeSnapshot.getTradeId()).willReturn("0025G60002158202");
        List<BlockTradeSnapshot> resultList = new ArrayList<>();
        resultList.add(blockTradeSnapshot);
        return resultList;
    }


    public static List<BlockTradeSnapshot> mockBlockTradeWithEmptyTradeUti(){
        BlockTradeSnapshot blockTradeSnapshot = mock(BlockTradeSnapshot.class);
        given(blockTradeSnapshot.getTradeId()).willReturn("");
        List<BlockTradeSnapshot> resultList = new ArrayList<>();
        resultList.add(blockTradeSnapshot);
        return resultList;
    }


    public static List<BlockTradeSnapshot> mockBlockTradeWithRegulatoryKey(){
        BlockTradeSnapshot blockTradeSnapshot = mock(BlockTradeSnapshot.class);
        given(blockTradeSnapshot.getRegulatoryKey()).willReturn("1030209445EFX20160513HK2R011Z6TURKNCW");
        List<BlockTradeSnapshot> resultList = new ArrayList<>();
        resultList.add(blockTradeSnapshot);
        return resultList;
    }


    public static List<BlockTradeSnapshot> mockBlockTradeWithEmptyRegulatoryKey(){
        BlockTradeSnapshot blockTradeSnapshot = mock(BlockTradeSnapshot.class);
        given(blockTradeSnapshot.getRegulatoryKey()).willReturn("");
        List<BlockTradeSnapshot> resultList = new ArrayList<>();
        resultList.add(blockTradeSnapshot);
        return resultList;
    }

}
