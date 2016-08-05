package di;

/**
 * Created by jcanogal on 03/06/2016.
 */
public class Client {

    public static void main(String[] args) {

        // 1. In this case every time we change the implementation we had to recompile the client
        Configuration configuration1 = new SystemPropertyConfiguration();

        // 2. In this case every time we change the implementation we have to recompile the factory
        // However we still have to recompile the factory because it has a String indicated the class harcoded,
        // so we create the ObjectFactory
        Configuration configuration2 = ConfigurationFactory.getInstance().create();
    }
}
