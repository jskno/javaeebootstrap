package myownannotation;

import java.lang.reflect.Proxy;

/**
 * Created by jcanogal on 04/06/2016.
 */
public class Decorator {

    public static Object decorate(Object toDecorate) {
        final Class<?> clazz = toDecorate.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new LoggingAspect(toDecorate));
    }
}
