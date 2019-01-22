package com.proxy.remove;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MtRemoteClient {

    public static void main(String[] args) {
        new MtRemoteClient().go();
    }

    private void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = service.sayHello();
            System.out.println("s = " + s);
        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            e.printStackTrace();
        }
    }

}
