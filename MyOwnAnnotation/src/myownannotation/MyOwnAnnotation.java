package myownannotation;

import java.lang.reflect.Field;

/**
 * Created by jcanogal on 27/05/2016.
 */
public class MyOwnAnnotation {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        final Class<?> clazz = Class.forName("myownannotation.Facade");
        final Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            MyInject myInject = field.getAnnotation(MyInject.class);
            if(myInject != null) {
                System.out.printf("Field %s is annotated with %s", field, myInject);
                Object facade = clazz.newInstance();
                Class<?> serviceType = field.getType();
                Object service = serviceType.newInstance();
                field.setAccessible(true);
                field.set(facade, service);
                System.out.println("");
                System.out.println("Facade: " + facade);
            } else {
                System.out.printf("Field %s is not annotated", field);
            }
        }

    }
}
