package com.proxy.reflect;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        PersonBean joe = new PersonBeanImpl("test1", "gender1", "interests1");
        PersonBean ownerProxy = (PersonBean) Proxy.newProxyInstance(joe.getClass().getClassLoader(),
                joe.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    if (method.getName().startsWith("get")) {
                        return method.invoke(joe, args);
                    } else if (method.getName().contains("hot")) {
                        throw new IllegalAccessException();
                    } else if (method.getName().startsWith("set")) {
                        return method.invoke(joe, args);
                    }
                    return null;
                });
        System.out.println("ownerProxy.getName() = " + ownerProxy.getName());
        String gender = ownerProxy.setGender("genNew");
        System.out.println("gender = " + gender);

        PersonBean tom = new PersonBeanImpl("test2", "gender2", "interests2");
        PersonBean tomProxy = getNotOwnerProxy(tom);
        try {
            tomProxy.setGender("exception");
        } catch (Exception e) {
            System.out.println("proxy take exception");
        }
    }

    private PersonBean getNotOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new NotOwnerInvocationHandler(personBean));
    }
}