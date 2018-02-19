package hu.bme.mit.train.sensor;

import com.google.common.collect.Table;
import hu.bme.mit.train.tachograf.Tachograf;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by meres on 2/19/18.
 */
public class TrainTachografTest {

    Tachograf tacho;

    @Before
    public void before() {
        tacho = new Tachograf();
    }

    @Test
    public void TachoTestStub() {
        Assert.assertEquals(null, tacho.TachografValues);
    }

}
