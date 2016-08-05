package test;

import di.Configuration;
import di.ConfigurationFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jcanogal on 03/06/2016.
 */
public class ConfigurationFactoryTest {

    private ConfigurationFactory cf;

    public ConfigurationFactoryTest() {}

    @Before
    public void initialize() {
        this.cf = ConfigurationFactory.getInstance();
    }

    @Test
    public void productCreation() {
        Configuration product = cf.create();
        assertNotNull(product);
    }

}
