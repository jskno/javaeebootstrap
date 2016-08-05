package di;

/**
 * Created by jcanogal on 03/06/2016.
 */
public class ConfigurationFactory {

    private final static ConfigurationFactory INSTANCE = new ConfigurationFactory();

    private Configuration product;

//    private ConfigurationFactory() {
//        this.product = new SystemPropertyConfiguration();
//    }

    // Using reflection
    // But still we´d have to recompile the factory because the name of the class is hardcoded here.
    private ConfigurationFactory() throws IllegalStateException {
        try {
            this.product = (Configuration) Class.forName("di.SystemPropertyConfiguration").newInstance();
        } catch(ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            throw new IllegalStateException("Product not found", ex);
        }
    }

    public static final ConfigurationFactory getInstance() {
        return INSTANCE;
    }

    public Configuration create() {
        return this.product;
    }

}
