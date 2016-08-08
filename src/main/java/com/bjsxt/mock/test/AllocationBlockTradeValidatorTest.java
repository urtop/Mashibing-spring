package com.bjsxt.mock.test;


import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

/**
 * Created by  Mark L Tao on 2016/8/8 15:33.
 */
public class AllocationBlockTradeValidatorTest {

    @Test
    public void systemInfoValidatoTestWithNoError() throws Exception {
        AllocationSnapshot snapshot = mock(AllocationSnapshot.class);
        SystemInfo systemInfo = MockAllocationSnapshotUtil.getSystemInfoFromSnapShot();
        MetaData metaData = MockAllocationSnapshotUtil.getMetaDataFromSnapShot();
        given(snapshot.getSystemInfo()).willReturn(systemInfo);
        given(snapshot.getMetaData()).willReturn(metaData);
        try {
            AllocationBlockTradeValidator allocationBlockTradeValidator = new AllocationBlockTradeValidator();
            allocationBlockTradeValidator.systemInfoValidator(snapshot);
        }catch (IllegalArgumentException e){
            assertTrue(e.getMessage().isEmpty());
        }
    }

    @Test
    public void systemInfoValidatorTestWithEmptySourceSystem() throws Exception {
        AllocationSnapshot snapshot = mock(AllocationSnapshot.class);
        SystemInfo systemInfo = MockAllocationSnapshotUtil.getSystemInfoFromSnapShotWithEmptySourceSystem();
        MetaData metaData = MockAllocationSnapshotUtil.getMetaDataFromSnapShotWithEmptySourceSystem();
        given(snapshot.getSystemInfo()).willReturn(systemInfo);
        given(snapshot.getMetaData()).willReturn(metaData);
        try {
            AllocationBlockTradeValidator allocationBlockTradeValidator = new AllocationBlockTradeValidator();
            allocationBlockTradeValidator.systemInfoValidator(snapshot);
        }catch (IllegalArgumentException e){
            assertTrue(e.getMessage().equals("Source system must be specified"));
        }
    }


    @Test
    public void systemInfoValidatorTestWithEmptyBookingChannel() throws Exception {
        AllocationSnapshot snapshot = mock(AllocationSnapshot.class);
        SystemInfo systemInfo = MockAllocationSnapshotUtil.getSystemInfoFromSnapShotWithEmptyBookingChannel();
        MetaData metaData = MockAllocationSnapshotUtil.getMetaDataFromSnapShotWithEmptyBookingChannel();
        given(snapshot.getSystemInfo()).willReturn(systemInfo);
        given(snapshot.getMetaData()).willReturn(metaData);
        try {
            AllocationBlockTradeValidator allocationBlockTradeValidator = new AllocationBlockTradeValidator();
            allocationBlockTradeValidator.systemInfoValidator(snapshot);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            assertTrue(e.getMessage().equals("External system name must be specified"));
        }
    }

    @Test
    public void tradeUtiValidatorTestWithNoError() throws Exception {
        AllocationSnapshot snapshot = mock(AllocationSnapshot.class);
        List<BlockTradeSnapshot> blockTradeSnapshot = MockAllocationBlockTradeUtil.mockBlockTradeWithTradeUti();
        given(snapshot.getBlocks()).willReturn(blockTradeSnapshot);
        try{
            AllocationBlockTradeValidator allocationBlockTradeValidator = new AllocationBlockTradeValidator();
            allocationBlockTradeValidator.tradeUTIValidator(snapshot);
        }catch (IllegalArgumentException e){
            assertTrue(e.getMessage().isEmpty());
        }
    }

    @Test
    public void tradeUtiValidatorTestWithEmptyUti() throws Exception {
        AllocationSnapshot snapshot = mock(AllocationSnapshot.class);
        List<BlockTradeSnapshot> blockTradeSnapshot = MockAllocationBlockTradeUtil.mockBlockTradeWithEmptyTradeUti();
        given(snapshot.getBlocks()).willReturn(blockTradeSnapshot);
        try{
            AllocationBlockTradeValidator allocationBlockTradeValidator = new AllocationBlockTradeValidator();
            allocationBlockTradeValidator.tradeUTIValidator(snapshot);
        }catch (IllegalArgumentException e){
            assertTrue(e.getMessage().equals("Original Trade UTI must be specified"));
        }
    }


    @Test
    public void regulatoryKeyValidatorTestWithNoError() throws Exception {
        AllocationSnapshot snapshot = mock(AllocationSnapshot.class);
        List<BlockTradeSnapshot> blockTradeSnapshots = MockAllocationBlockTradeUtil.mockBlockTradeWithRegulatoryKey();
        given(snapshot.getBlocks()).willReturn(blockTradeSnapshots);
        try{
            AllocationBlockTradeValidator allocationBlockTradeValidator = new AllocationBlockTradeValidator();
            allocationBlockTradeValidator.regulatoryKeyValidator(snapshot);
        }catch (IllegalArgumentException e){
            assertTrue(e.getMessage().isEmpty());
        }
    }


    @Test
    public void regulatoryKeyValidatorTestWithEmptyRegulatoryKey() throws Exception {
        AllocationSnapshot snapshot = mock(AllocationSnapshot.class);
        List<BlockTradeSnapshot> blockTradeSnapshots = MockAllocationBlockTradeUtil.mockBlockTradeWithEmptyRegulatoryKey();
        given(snapshot.getBlocks()).willReturn(blockTradeSnapshots);
        try{
            AllocationBlockTradeValidator allocationBlockTradeValidator = new AllocationBlockTradeValidator();
            allocationBlockTradeValidator.regulatoryKeyValidator(snapshot);
        }catch (IllegalArgumentException e){
            assertTrue(e.getMessage().equals("Regulatory key  not provided"));
        }
    }

}