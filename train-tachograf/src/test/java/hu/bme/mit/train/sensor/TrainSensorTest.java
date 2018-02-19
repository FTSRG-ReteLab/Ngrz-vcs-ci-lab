package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TrainSensorTest {

    int tri;
    private int SpeedLimit;

    @Before
    public void before() {
        tri = 1;
        SpeedLimit = 5;
    }

    @Test
    public void ThisIsAnExampleTestStub() {
        Assert.assertEquals(6, tri+SpeedLimit);
    }
}
