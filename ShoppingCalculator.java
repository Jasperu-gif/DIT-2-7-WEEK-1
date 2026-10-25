public class ShoppingCalculator {
    public static void main(String[] args) {
        
        int quantity = 3;
        double unitPrice = 34.99;
        String storeName = "Meat Me in Amsterdam";
       
        double totalCost = quantity * unitPrice;

        System.out.println("--- Purchase Summary ---");
        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity:   " + quantity);
        System.out.println("Unit Price: $" + unitPrice);
        System.out.println("Total Cost: $" + totalCost);

        /* 
         * Requirement Explanation:
         * totalCost should not be declared as an int because unitPrice is a double (decimal). 
         * Multiplying an int by a double results in a double. If we tried to store it in an int, 
         * Java would throw a compilation error.
         */
    }
}
