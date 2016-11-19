
package rmi_test;

import java.rmi.Remote;
import java.rmi.RemoteException;


interface RMI extends Remote
{
     public String getData(String text) throws RemoteException;
}
