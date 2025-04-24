import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class SearchInventoryMap {

    public static void main(String[] args) {

        String filePath = "SearchInventoryMap/src/main/resources/inventory.csv";

        HashMap<String, Product> inventory = loadInventory(filePath);

    }

    private static HashMap<String, Product> loadInventory(String filePath){

        HashMap<String, Product> inventory = new HashMap<String, Product>();

        try{
            FileReader reader = new FileReader(filePath);
            BufferedReader bufReader = new BufferedReader(reader);

            String input;
            while((input = bufReader.readLine()) != null) {
                String[] lineData = input.split("\\|");

                System.out.println(lineData[0]);

                int productId = Integer.parseInt(lineData[0]);
                String productName = lineData[1];
                double productPrice = Double.parseDouble(lineData[2]);

                Product newProduct = new Product(productId, productName, productPrice);

                inventory.put(productName, newProduct);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(inventory.get("Hammer"));
        return inventory;

    }


}
