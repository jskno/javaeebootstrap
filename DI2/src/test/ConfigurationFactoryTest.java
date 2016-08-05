package test;

import di.Configuration;
import di.ObjectFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by jcanogal on 03/06/2016.
 */
public class ConfigurationFactoryTest {

    private ObjectFactory cf;

    public ConfigurationFactoryTest() {}

    @Before
    public void initialize() {
        this.cf = ObjectFactory.getInstance();
    }

    @Test
    public void productCreation() {
        Configuration product = (Configuration) cf.create();
        assertNotNull(product);
    }

}
