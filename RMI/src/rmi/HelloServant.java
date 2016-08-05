package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by jcanogal on 04/06/2016.
 */
public class HelloServant extends UnicastRemoteObject implements Hello {

    public HelloServant() throws RemoteException {
        super();
    }
    @Override
    public String hello(String msg) throws RemoteException {
        return "Hello client ! " + msg;
    }
}
