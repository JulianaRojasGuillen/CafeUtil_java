import java.util.ArrayList;

public class CafeUtil {
    
    public int getStreakGoal( int numWeeks){
        int suma = 0;
        for (int i=0 ; i < numWeeks + 1 ; i++){
            suma += i;
        }
        return suma;
    }

    public double getOrderTotal(double[] prices){
        double suma = 0;
        for (int i=0 ; i < prices.length ; i++){
            suma += prices[i];
        }
        return suma;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for (int i=0 ; i<menuItems.size() ; i++){
            System.out.println ( i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println ("Por favor, ingresa tu nombre:");
        String userName = System.console().readLine();
        System.out.printf ("¡Hola, %s!", userName);
        int numPersonas = customers.size();
        System.out.printf (" Hay %i personas delante de ti" , numPersonas);
        customers.add(userName);
        System.out.println (customers);
    }
}