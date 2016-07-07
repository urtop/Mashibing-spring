package com.bjsxt.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by  Mark L Tao on 2016/7/6 16:10.
 */
public class LogInterceptor implements InvocationHandler {
    private Object target;

    public void beforeMethod(Method m) {
        System.out.println(m.getName() + "  Start!...");
    }

    public void afterMethod() {
        System.out.println("....End!");
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeMethod(method);
        method.invoke(target, args);
        return null;
    }


}
