package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by jcanogal on 04/06/2016.
 */
public interface Hello extends Remote {

    public String hello(String msg) throws RemoteException;
}
