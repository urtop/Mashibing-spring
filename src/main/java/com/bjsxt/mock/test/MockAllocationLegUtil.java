package com.bjsxt.mock.test;



import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class MockAllocationLegUtil {
    public static List<AllocationLegSnapshot> getMockedAllocationLegSnapshot() {
        AllocationLegSnapshot mock = mock(AllocationLegSnapshot.class);

        given(mock.getBaseCurrency()).willReturn("GBP");
        given(mock.getPct()).willReturn(new BigDecimal(50.0));
        given(mock.getLegId()).willReturn("0538c27a-8943-4c6c-a931-e071995d5024");

        CounterPartyInfo counterPartyInfo_mock = mock(CounterPartyInfo.class);

        given(mock.getCounterParty()).willReturn(counterPartyInfo_mock);
        given(counterPartyInfo_mock.getCounterPartyIdentifier()).willReturn("MIDLJOB");
        given(counterPartyInfo_mock.getCounterPartyPOGroup()).willReturn("LOH");
        given(counterPartyInfo_mock.getCounterPartyPOUnit()).willReturn("PO7");


        given(mock.getCounterParty()).willReturn(counterPartyInfo_mock);
        given(mock.getBuySell()).willReturn("S");
        given(mock.getTradingAmount()).willReturn(new BigDecimal(5000.0));
        given(mock.getCounterCurrency()).willReturn("USD");
        given(mock.getCounterAmount()).willReturn(new BigDecimal(6170.0));

        List<AllocationLegSnapshot> result_list = new ArrayList<>();
        result_list.add(mock);
        return result_list;
    }

    public static List<AllocationLegSnapshot> getMockedAllocationLegSnapshot_emptyCounterPartyIdentifier() {
        AllocationLegSnapshot mock = mock(AllocationLegSnapshot.class);

        CounterPartyInfo counterPartyInfo_mock = mock(CounterPartyInfo.class);
        given(mock.getCounterParty()).willReturn(counterPartyInfo_mock);
        given(counterPartyInfo_mock.getCounterPartyIdentifier()).willReturn("");
        given(counterPartyInfo_mock.getCounterPartyPOGroup()).willReturn("LOH");
        given(counterPartyInfo_mock.getCounterPartyPOUnit()).willReturn("PO7");
        List<AllocationLegSnapshot> result_list = new ArrayList<>();
        result_list.add(mock);
        return result_list;
    }

    public static List<AllocationLegSnapshot> getMockedAllocationLegSnapshot_emptyCounterPartyPOGroup() {
        AllocationLegSnapshot mock = mock(AllocationLegSnapshot.class);

        CounterPartyInfo counterPartyInfo_mock = mock(CounterPartyInfo.class);
        given(mock.getCounterParty()).willReturn(counterPartyInfo_mock);
        given(counterPartyInfo_mock.getCounterPartyPOGroup()).willReturn("");
        given(counterPartyInfo_mock.getCounterPartyIdentifier()).willReturn("MIDLJOB");
        given(counterPartyInfo_mock.getCounterPartyPOUnit()).willReturn("PO7");
        List<AllocationLegSnapshot> result_list = new ArrayList<>();
        result_list.add(mock);
        return result_list;
    }


    public static List<AllocationLegSnapshot> getMockedAllocationLegSnapshot_emptyCounterPartyPOUnit() {
        AllocationLegSnapshot mock = mock(AllocationLegSnapshot.class);

        CounterPartyInfo counterPartyInfo_mock = mock(CounterPartyInfo.class);
        given(mock.getCounterParty()).willReturn(counterPartyInfo_mock);
        given(counterPartyInfo_mock.getCounterPartyPOUnit()).willReturn("");
        given(counterPartyInfo_mock.getCounterPartyIdentifier()).willReturn("MIDLJOB");
        given(counterPartyInfo_mock.getCounterPartyPOGroup()).willReturn("LOH");
        List<AllocationLegSnapshot> result_list = new ArrayList<>();
        result_list.add(mock);
        return result_list;
    }


    public static List<AllocationLegSnapshot> getMockedAllocationLegSnapshotWithAllCcyInfo() {
        AllocationLegSnapshot mock = mock(AllocationLegSnapshot.class);

        given(mock.getBaseCurrency()).willReturn("GBP");
        given(mock.getCounterCurrency()).willReturn("USD");
        List<AllocationLegSnapshot> result_list = new ArrayList<>();
        result_list.add(mock);
        return result_list;
    }


    public static List<AllocationLegSnapshot> getMockedAllocationLegSnapshotWithNoBaseCurrency() {
        AllocationLegSnapshot mock = mock(AllocationLegSnapshot.class);

        given(mock.getBaseCurrency()).willReturn("");
        given(mock.getCounterCurrency()).willReturn("USD");
        List<AllocationLegSnapshot> result_list = new ArrayList<>();
        result_list.add(mock);
        return result_list;
    }

    public static List<AllocationLegSnapshot> getMockedAllocationLegSnapshotWithNoCounterCurrency() {
        AllocationLegSnapshot mock = mock(AllocationLegSnapshot.class);

        given(mock.getBaseCurrency()).willReturn("GBP");
        given(mock.getCounterCurrency()).willReturn("");
        List<AllocationLegSnapshot> result_list = new ArrayList<>();
        result_list.add(mock);
        return result_list;
    }

    public static List<AllocationLegSnapshot> getMockedAllocationLegSnapshotWithWrongPair() {
        AllocationLegSnapshot mock = mock(AllocationLegSnapshot.class);

        given(mock.getBaseCurrency()).willReturn("GBP");
        given(mock.getCounterCurrency()).willReturn("CNY");
        List<AllocationLegSnapshot> result_list = new ArrayList<>();
        result_list.add(mock);
        return result_list;
    }

    public static List<AllocationLegSnapshot> getMockedAllocationLegSnapshotWithNullAmount() {
        AllocationLegSnapshot mock = mock(AllocationLegSnapshot.class);

        given(mock.getBaseCurrency()).willReturn("GBP");
        given(mock.getPct()).willReturn(new BigDecimal(50.0));
        given(mock.getLegId()).willReturn("0538c27a-8943-4c6c-a931-e071995d5024");

        CounterPartyInfo counterPartyInfo_mock = mock(CounterPartyInfo.class);

        given(mock.getCounterParty()).willReturn(counterPartyInfo_mock);
        given(counterPartyInfo_mock.getCounterPartyIdentifier()).willReturn("MIDLJOB");
        given(counterPartyInfo_mock.getCounterPartyPOGroup()).willReturn("LOH");
        given(counterPartyInfo_mock.getCounterPartyPOUnit()).willReturn("PO7");


        given(mock.getCounterParty()).willReturn(counterPartyInfo_mock);
        given(mock.getBuySell()).willReturn("S");
        given(mock.getTradingAmount()).willReturn(null);
        given(mock.getCounterCurrency()).willReturn("USD");
        given(mock.getCounterAmount()).willReturn(new BigDecimal(6170.0));

        List<AllocationLegSnapshot> result_list = new ArrayList<>();
        result_list.add(mock);
        return result_list;
    }


    public static List<AllocationLegSnapshot> getMockedAllocationLegSnapshotWithNullContuerAmount() {
        AllocationLegSnapshot mock = mock(AllocationLegSnapshot.class);

        given(mock.getBaseCurrency()).willReturn("GBP");
        given(mock.getPct()).willReturn(new BigDecimal(50.0));
        given(mock.getLegId()).willReturn("0538c27a-8943-4c6c-a931-e071995d5024");

        CounterPartyInfo counterPartyInfo_mock = mock(CounterPartyInfo.class);

        given(mock.getCounterParty()).willReturn(counterPartyInfo_mock);
        given(counterPartyInfo_mock.getCounterPartyIdentifier()).willReturn("MIDLJOB");
        given(counterPartyInfo_mock.getCounterPartyPOGroup()).willReturn("LOH");
        given(counterPartyInfo_mock.getCounterPartyPOUnit()).willReturn("PO7");


        given(mock.getCounterParty()).willReturn(counterPartyInfo_mock);
        given(mock.getBuySell()).willReturn("S");
        given(mock.getTradingAmount()).willReturn(new BigDecimal(5000.0));
        given(mock.getCounterCurrency()).willReturn("USD");
        given(mock.getCounterAmount()).willReturn(null);

        List<AllocationLegSnapshot> result_list = new ArrayList<>();
        result_list.add(mock);
        return result_list;
    }


    public static List<AllocationLegSnapshot> getMockedAllocationLegSnapshotWithNullBaseCcy() {
        AllocationLegSnapshot mock = mock(AllocationLegSnapshot.class);

        given(mock.getBaseCurrency()).willReturn(null);
        given(mock.getPct()).willReturn(new BigDecimal(50.0));
        given(mock.getLegId()).willReturn("0538c27a-8943-4c6c-a931-e071995d5024");

        CounterPartyInfo counterPartyInfo_mock = mock(CounterPartyInfo.class);

        given(mock.getCounterParty()).willReturn(counterPartyInfo_mock);
        given(counterPartyInfo_mock.getCounterPartyIdentifier()).willReturn("MIDLJOB");
        given(counterPartyInfo_mock.getCounterPartyPOGroup()).willReturn("LOH");
        given(counterPartyInfo_mock.getCounterPartyPOUnit()).willReturn("PO7");


        given(mock.getCounterParty()).willReturn(counterPartyInfo_mock);
        given(mock.getBuySell()).willReturn("S");
        given(mock.getTradingAmount()).willReturn(new BigDecimal(5000.0));
        given(mock.getCounterCurrency()).willReturn("USD");
        given(mock.getCounterAmount()).willReturn(new BigDecimal(6170.0));

        List<AllocationLegSnapshot> result_list = new ArrayList<>();
        result_list.add(mock);
        return result_list;
    }



    public static List<AllocationLegSnapshot> getMockedAllocationLegSnapshotWithNullCounterCcy() {
        AllocationLegSnapshot mock = mock(AllocationLegSnapshot.class);

        given(mock.getBaseCurrency()).willReturn("GBP");
        given(mock.getPct()).willReturn(new BigDecimal(50.0));
        given(mock.getLegId()).willReturn("0538c27a-8943-4c6c-a931-e071995d5024");

        CounterPartyInfo counterPartyInfo_mock = mock(CounterPartyInfo.class);

        given(mock.getCounterParty()).willReturn(counterPartyInfo_mock);
        given(counterPartyInfo_mock.getCounterPartyIdentifier()).willReturn("MIDLJOB");
        given(counterPartyInfo_mock.getCounterPartyPOGroup()).willReturn("LOH");
        given(counterPartyInfo_mock.getCounterPartyPOUnit()).willReturn("PO7");


        given(mock.getCounterParty()).willReturn(counterPartyInfo_mock);
        given(mock.getBuySell()).willReturn("S");
        given(mock.getTradingAmount()).willReturn(new BigDecimal(5000.0));
        given(mock.getCounterCurrency()).willReturn(null);
        given(mock.getCounterAmount()).willReturn(new BigDecimal(6170.0));

        List<AllocationLegSnapshot> result_list = new ArrayList<>();
        result_list.add(mock);
        return result_list;
    }

    public static List<AllocationLegSnapshot> getMockedAllocationLegSnapshotWithNullBuySellFlag() {
        AllocationLegSnapshot mock = mock(AllocationLegSnapshot.class);

        given(mock.getBaseCurrency()).willReturn("GBP");
        given(mock.getPct()).willReturn(new BigDecimal(50.0));
        given(mock.getLegId()).willReturn("0538c27a-8943-4c6c-a931-e071995d5024");

        CounterPartyInfo counterPartyInfo_mock = mock(CounterPartyInfo.class);

        given(mock.getCounterParty()).willReturn(counterPartyInfo_mock);
        given(counterPartyInfo_mock.getCounterPartyIdentifier()).willReturn("MIDLJOB");
        given(counterPartyInfo_mock.getCounterPartyPOGroup()).willReturn("LOH");
        given(counterPartyInfo_mock.getCounterPartyPOUnit()).willReturn("PO7");


        given(mock.getCounterParty()).willReturn(counterPartyInfo_mock);
        given(mock.getBuySell()).willReturn(null);
        given(mock.getTradingAmount()).willReturn(new BigDecimal(5000.0));
        given(mock.getCounterCurrency()).willReturn("USD");
        given(mock.getCounterAmount()).willReturn(new BigDecimal(6170.0));

        List<AllocationLegSnapshot> result_list = new ArrayList<>();
        result_list.add(mock);
        return result_list;
    }

}
