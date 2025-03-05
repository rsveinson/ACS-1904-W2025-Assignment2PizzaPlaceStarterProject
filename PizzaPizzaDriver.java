import java.util.Scanner;
import java.util.ArrayList;

/** 
 * ACS-1904 w2023 Assignment 2: Pizza Pizza
 * @Supplied driver code
 * make sure your class heirarchy works with
 * this supplied code.
*/

public class PizzaPizzaDriver{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        /* creating pizzas using the two concrete classes
         * the commented println statements can be used
         * for testing as you develop your classes.
         * be sure to comment them out again if you do use them
         */
        BuildYourOwnPizza pizza = new BuildYourOwnPizza(Size.LARGE, 3);
        //System.out.println(pizza);
        
        SpecialtyPizza spPizza = new SpecialtyPizza(SpecialtyType.ROMA);
        //System.out.println();
        //System.out.println(spPizza);
        
        /* creating orders using the two concrete classes
         * the commented println statements can be used
         * for testing as you develop your classes.
         * be sure to comment them out again if you do use them
         */
        PickupOrder puOrder = new PickupOrder("204-555-5555", "Clark Kent");
        puOrder.addPizza(pizza);
        puOrder.addPizza(spPizza);
        
        //System.out.println(puOrder.calculateOrderPrice());
        //System.out.println(puOrder);
        
        // ** delivery order **
        BuildYourOwnPizza byop1 = new BuildYourOwnPizza(Size.SMALL, 2);
        BuildYourOwnPizza byop2 = new BuildYourOwnPizza(Size.MEDIUM, 1);
        
        SpecialtyPizza sp1 = new SpecialtyPizza(SpecialtyType.ALFREDO);
        SpecialtyPizza sp2 = new SpecialtyPizza(SpecialtyType.SUPREME);
        
        DeliveryOrder delivery = new DeliveryOrder("204-555-5555", "222 Tudor Terrace");
        delivery.addPizza(byop1);
        delivery.addPizza(byop2);
        delivery.addPizza(sp1);
        delivery.addPizza(sp2);
        
        //System.out.println(delivery);
        
        
        /* add orders to the order queue
         * the orders will be added and removed as
         * they are received and fullfilled
         * for this simplified simulation we will 
         * only add two orders and the print the queue
         */
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(puOrder);
        orders.add(delivery);
        
        for(Order o : orders){
            System.out.println(o);
        }// end for
        
        System.out.println("end of program");
    }//end main
}// end class

