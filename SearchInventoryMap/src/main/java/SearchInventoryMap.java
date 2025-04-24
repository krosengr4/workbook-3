import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class SearchInventoryMap {

    public static void main(String[] args) {
        //Add file path for inventory csv
        String filePath = "SearchInventoryMap/src/main/resources/inventory.csv";

        //have inventory HashMap call loadInventory method
        HashMap<String, StoreProduct> inventory = loadInventory(filePath);

        //Get user input
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a product you would like to search: ");
        String userInput = myScanner.nextLine();

        //Match the user input to the product name. Print product if it is in inventory HashMap
        StoreProduct matchProduct = inventory.get(userInput);
        if (matchProduct == null) {
            System.out.println("We don't have that product in stock");
        } else {
            System.out.println("Here is what we have in stock:\n" + matchProduct.getName() + " $" + matchProduct.getPrice());
        }
    }

    //Method to read inventory.csv and add to inventory HashMap
    private static HashMap<String, StoreProduct> loadInventory(String filePath) {

        //Create new HashMap for inventory
        HashMap<String, StoreProduct> inventory = new HashMap<String, StoreProduct>();

        try {
            //Open FileReader and BufferedFileReader
            FileReader reader = new FileReader(filePath);
            BufferedReader bufReader = new BufferedReader(reader);

            String input;

            //While loop to read file and create new product for each line
            while ((input = bufReader.readLine()) != null) {
                //Split file based at "|"
                String[] lineData = input.split("\\|");

                //Take the different parts of file, put them in variables
                int productId = Integer.parseInt(lineData[0]);
                String productName = lineData[1];
                double productPrice = Double.parseDouble(lineData[2]);

                //Create new product and put new product in inventory HashMap
                StoreProduct newProduct = new StoreProduct(productId, productName, productPrice);
                inventory.put(newProduct.getName(), newProduct);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //Return inventory HashMap
        return inventory;
    }
}
