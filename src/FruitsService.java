import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface FruitsService extends Remote {

    static final String SERVICE_NAME = "FruitsService";

    public void initFruits() throws RemoteException;

    public ArrayList<Fruits> getFruits() throws RemoteException;

    public void addFruit(Fruits fruit) throws RemoteException;

    public int getFruitsTotal(Fruits fruit) throws RemoteException;

    public int getCartTotal(ArrayList<Fruits> fruits) throws RemoteException;
}
