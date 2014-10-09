import java.rmi.*;
import java.rmi.server.*;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	public String sayHello() {
		return "Server says Hi";
	}

	public MyRemoteImpl() throws RemoteException {
	}

	public static void main(String[] args) {
		try {
			MyRemote service = new MyRemoteImpl();
			Naming.bind("remoteHello", service);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
