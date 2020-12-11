import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class FruitsServer {

    public static void main(String[] args) {
        System.out.println("FruitsServer is starting...");

        try {
            // create a RMI registry on localhost at port 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            System.out.println("RMI registry is running on port 1099");

            // create an instance of the service object
            FruitsRemote fruitsRemote = new FruitsRemote();

            System.out.println("Binding FruitsService...");

            // bind it in the RMI registry
            registry.rebind(FruitsService.SERVICE_NAME, fruitsRemote);

            System.out.println("FruitsService is ready...");

            System.out.println("Wait for 10 seconds for any incoming client call before terminating the RMI registry...");

            // sleep 10 seconds
            // Thread.sleep(10000);

            // unbind the service object
            // registry.unbind(FruitsService.SERVICE_NAME);

            // remove the service object from the registry
            // UnicastRemoteObject.unexportObject(fruitsRemote, true);

            // System.out.println("Shutting down the RMI registry...");

            // shut down the registry
            // UnicastRemoteObject.unexportObject(registry, true);

            // System.out.println("FruitsService has stopped.");
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}
