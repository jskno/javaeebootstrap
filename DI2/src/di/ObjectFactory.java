package di;

/**
 * Created by jcanogal on 03/06/2016.
 */
public class ObjectFactory {

    private static final ObjectFactory INSTANCE = new ObjectFactory();

    private Object product;

    private ObjectFactory() {
        try {
            this.product = Class.forName("di.SystemPropertyConfiguration").newInstance();
        } catch(ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            throw new IllegalStateException("Product not found", ex);
        }
    }

    public static final ObjectFactory getInstance() {
        return INSTANCE;
    }

    public Object create() {
        return this.product;
    }


}
