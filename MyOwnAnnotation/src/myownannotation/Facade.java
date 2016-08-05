package myownannotation;

/**
 * Created by jcanogal on 27/05/2016.
 */
public class Facade {

    @MyInject(MyInject.DayTime.MORNING)
    private Service service;

    String somethingElse;

    @Override
    public String toString() {
        return "Facade{" +
                "service=" + service +
                ", somethingElse='" + somethingElse + '\'' +
                '}';
    }
}
