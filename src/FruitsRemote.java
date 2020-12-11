import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;

public class FruitsRemote extends UnicastRemoteObject implements FruitsService {

    ArrayList<Fruits> fruits = new ArrayList<>();

    protected FruitsRemote() throws RemoteException {
        super();
    }

    @Override
    public void initFruits() {
        String _fruits[] = new String[]{"Mango", "Apple", "Avocado"};
        int _prices[] = new int[]{40,35,25};

        for (int i = 0; i < _fruits.length; i++) {
            fruits.add(new Fruits(_fruits[i], _prices[i]));
        }
    }

    @Override
    public ArrayList<Fruits> getFruits() throws RemoteException {
        return fruits;
    }

    @Override
    public void addFruit(Fruits fruit) throws RemoteException {
        fruits.add( fruit );
    }

    @Override
    public int getFruitsTotal(Fruits fruit) throws RemoteException {
        return (fruit.getPrice() * fruit.getQuantity());
    }

    @Override
    public int getCartTotal(ArrayList<Fruits> fruits) throws RemoteException {
        int cartTotal = 0;

        for( int i = 0; i < fruits.size(); ++i ) {
            if( fruits.get(i).getQuantity() > 0 ) {
                cartTotal = fruits.get(i).getQuantity() * fruits.get(i).getPrice();
            }
        }

        return cartTotal;
    }
}
