package hu.bme.mit.train.sensor;


import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainUser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TrainSensorTest {

    int tri;
    private int SpeedLimit;
    private TrainSensorImpl sensor;
    private TrainUser user;
    private TrainController controller;

    @Before
    public void before() {
        tri = 1;


        controller = mock(TrainController.class);
        user= mock(TrainUser.class);
        sensor = new TrainSensorImpl(controller, user);

        controller.setSpeedLimit(20);


    }

    @Test
    public void ThisIsAnExampleTestStub() {
        Assert.assertEquals(6, tri+5);
    }

    @Test
    public void OverrideSpeedLimit_AbsMarginOver_OK(){


               sensor.overrideSpeedLimit(501);
               verify(user, times(1)).setAlarmFlag(true);
       // Assert.assertEquals(true, user.getAlarmState());
    }

    @Test
    public void OverrideSpeedLimit_AbsMarginNegative_OK(){

        sensor.overrideSpeedLimit(-23);
        verify(user, times(2)).setAlarmFlag(true);
       // Assert.assertEquals(true, user.getAlarmState());
    }
    @Test
    public void OverrideSpeedLimit_RelativeMarginOutBoundary_OK(){

        sensor.overrideSpeedLimit(5);
        Assert.assertEquals(false, user.getAlarmState());
    }

    @Test
    public void OverrideSpeedLimit_RelativeMarginInsideBoundary_OK(){

        sensor.overrideSpeedLimit(10);
        Assert.assertEquals(false, user.getAlarmState());
    }
/*
    public void OverrideSpeedLimit_MockTest_OK(){
        when(controller.getRefer

    }*/



}
