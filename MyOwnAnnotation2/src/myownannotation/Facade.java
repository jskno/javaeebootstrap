package myownannotation;

/**
 * Created by jcanogal on 04/06/2016.
 */
public class Facade {

    @MyInject(MyInject.DayTime.MORNING)
    private Service service;

    private String somethingElse;

    public void invokeService() {
        service.serve();
    }

    @Override
    public String toString() {
        return "Facade{" +
                "service=" + service +
                ", somethingElse='" + somethingElse + '\'' +
                '}';
    }
}
