package myownannotation;

/**
 * Created by jcanogal on 04/06/2016.
 */
public class ServiceImpl implements Service {

    @Override
    public void serve() {
        System.out.println("Served from Impl !!");
    }
}
