package com.proxy.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NotOwnerInvocationHandler implements InvocationHandler {

    private PersonBean personBean;

    public NotOwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("get")) {
            return method.invoke(personBean, args);
        } else if (method.getName().contains("hot")) {
            return method.invoke(personBean, args);
        } else if (method.getName().startsWith("set")){
            throw new IllegalAccessException();
        }
        return null;
    }
}
