/*Name: 
 * Date: 
 * Instructor: 
 * Project: Lab4a
 * 
 */
package Lab4a;

public class DessertShop {
    public static void main(String[] args) {
        Order runOrder = new Order();
        DessertItem addCandy = new Candy("Candy Corn", 1.5, .25);
        DessertItem addCandy1 = new Candy("Gummy Bears", .25, .35);
        DessertItem addCookie = new Cookie("Chocolate Chip", 6, 3.99);
        DessertItem addIceCream = new IceCream("Pistachio", 2, .79);
        DessertItem addSundae = new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29);
        DessertItem addCookie1 = new Cookie("Oatmeal Raisin", 2, 3.45);
        runOrder.Add(addCandy);
        runOrder.Add(addCandy1);
        runOrder.Add(addCookie);
        runOrder.Add(addIceCream);
        runOrder.Add(addSundae);
        runOrder.Add(addCookie1);
        for (int i = 0; i < runOrder.getOrderList().size(); i++) {
            String output1 = String.format("%-25s$%-8.2f[Tax: $%.2f]\n", runOrder.getOrderList().get(i).getName(),
                    runOrder.getOrderList().get(i).calculateCost(), runOrder.getOrderList().get(i).calculateTax());
            System.out.println(output1);
        } // end of print out for loop
        double totals = runOrder.orderCost() + runOrder.orderTax();
        System.out.println("----------------------------------------------" + "\n");
        String output2 = String.format("%-25s$%-8.2f[Tax: $%.2f]\n", "Order Subtotals: ", runOrder.orderCost(),
                runOrder.orderTax());
        System.out.println(output2);
        String output3 = String.format("%-25s$%-8.2f\n\n", "Order Total: ", totals);
        System.out.print(output3);
        System.out.println("Total number of items in order: " + runOrder.itemCount());
    }
}
