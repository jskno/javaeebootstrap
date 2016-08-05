package di;

/**
 * Created by jcanogal on 03/06/2016.
 */
public class Client {

    public static void main(String[] args) {

        // 3. Now we have one factory which is completely type independent but the question is why we need such a
        //    factory at all. This is the beginning of DI. We could move the factory out to somewhere, in the case
        //    of javaee  to the app server
        Configuration configuration2 = (Configuration) ObjectFactory.getInstance().create();

    }
}
