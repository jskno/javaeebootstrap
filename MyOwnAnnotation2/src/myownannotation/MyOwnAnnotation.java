package myownannotation;

import java.lang.reflect.Field;

/**
 * Created by jcanogal on 04/06/2016.
 */
public class MyOwnAnnotation {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        final Class<?> clazz = Class.forName("myownannotation.Facade");
        final Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields) {
            MyInject myInject = field.getAnnotation(MyInject.class);
            if(myInject != null) {
                System.out.printf("The field %s is annotated with %s", field, myInject);
                System.out.println();
                Object facade = clazz.newInstance();
                Class<?> serviceType = field.getType();
                String simpleName = serviceType.getSimpleName();
                String className = simpleName + "Impl";
                String packageName = serviceType.getPackage().getName();
                String fullName = packageName + "." + className;
                Object service = Class.forName(fullName).newInstance();
                field.setAccessible(true);
                field.set(facade, Decorator.decorate(service));

                Facade typedFacade = (Facade) facade;
                typedFacade.invokeService();
                System.out.println("");
                System.out.println("Facade: " + facade);
            }

        }
    }
}
