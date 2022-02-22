import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
    public static void main(String[] args) {
        
      CafeUtil cafeUtil = new CafeUtil();
        
          /* ============ Casos de prueba de la App ============= */
      
          System.out.println("\n----- Prueba Meta café -----");
          System.out.printf("Compras necesarias para la semana 10: %s \n\n", cafeUtil.getStreakGoal(10));
      
          System.out.println("----- Prueba Total Orden -----");
          double[] lineItems = {3.5, 1.5, 4.0, 4.5};
          System.out.printf("Total orden: %s \n\n", cafeUtil.getOrderTotal(lineItems));
          
          System.out.println("----- Prueba Mostrar Menú-----");
          ArrayList<String> menu = new ArrayList<String>();
          menu.add("café de goteo");
          menu.add("capuchino");
          menu.add("latte");
          menu.add("moka");
          cafeUtil.displayMenu(menu);
      
          System.out.println("\n----- Prueba agregar cliente-----");
          ArrayList<String> customers = new ArrayList<String>();
          for (int i = 0; i < 4; i++) {
              cafeUtil.addCustomer(customers);
              System.out.println("\n");
          }
      }
}