import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {

    public static void main(String[] args) {

        ArrayList<Product> inventory = getInventory();

        Scanner myScanner = new Scanner(System.in);

        System.out.println("We carry the following inventory: ");

        //For loop that prints out every product's attributes
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f", p.getId(), p.getName(), p.getPrice());
        }
    }

    private static ArrayList<Product> getInventory(){
        FileReader reader;

        try{
            reader = new FileReader("SearchInventory/src/main/resources/inventory.csv");
            String input;
            BufferedReader bufReader = new BufferedReader(reader);

            while((input = bufReader.readLine()) != null) {
                String[] lineData = input.split("\\|");

                int productId = Integer.parseInt(lineData[0]);
                String productName = lineData[1];
                double productPrice = Double.parseDouble(lineData[2]);


                ArrayList<Product> inventory = new ArrayList<Product>();
                for (int i = 0; i < lineData.length; i++) {
                    Product newProduct = new Product(productId, productName, productPrice);
                    inventory.add(newProduct);

                }

                return inventory;
            }




        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }

        ArrayList<Product> inventory = new ArrayList<Product>();

        return inventory;
    }

//    public static ArrayList<Product> getInventory() {
//
//        //Create an array list that contains the Product object
//        ArrayList<Product> inventory = new ArrayList<Product>();
//
//        //Create new products to put into inventory
//        Product beans = new Product(1, "Busch's Baked Beans", 7.99);
//        Product soup = new Product(2, "Campbell's Chicken and Noodle Soup", 3.98);
//        Product pretzels = new Product(3, "Snyder's of Hanover Pretzel Sticks", 4.29);
//        Product milk = new Product(4, "Stonyfield Farm Whole Milk 1/2 gal", 5.29);
//        Product sourCream = new Product(5, "Daisy Sour Cream", 3.47);
//
//        //Put the items we created into inventory array list
//        inventory.add(beans);
//        inventory.add(soup);
//        inventory.add(pretzels);
//        inventory.add(milk);
//        inventory.add(sourCream);
//
//        return inventory;
//    }

}
