import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {

    public static void main(String[] args) {
        //Create file path for inventory csv
        String filePath = "SearchInventory/src/main/resources/inventory.csv";

        ArrayList<Product> inventory = getInventory(filePath);

        Scanner myScanner = new Scanner(System.in);

        System.out.println("We carry the following inventory: ");

        //For loop that prints out every product's attributes
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.println("id: " + p.getId() + " Name: " + p.getName() + " Price: " + p.getPrice());
        }
    }

    private static ArrayList<Product> getInventory(String filePath){
        // Create array list for inventory
        ArrayList<Product> inventory = new ArrayList<Product>();

        try{
            FileReader reader = new FileReader(filePath);
            BufferedReader bufReader = new BufferedReader(reader);
            String input;

            while((input = bufReader.readLine()) != null) {
                String[] lineData = input.split("\\|");

                int productId = Integer.parseInt(lineData[0]);
                String productName = lineData[1];
                double productPrice = Double.parseDouble(lineData[2]);

                Product newProduct = new Product(productId, productName, productPrice);
                inventory.add(newProduct);
            }

        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }
        return inventory;
    }
}
