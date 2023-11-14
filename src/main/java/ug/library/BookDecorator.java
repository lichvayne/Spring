package ug.library;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class BookDecorator implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("We have the following book:");
        Object retObject = invocation.proceed();
        System.out.println("In Library.");
        return retObject;
    }
}
