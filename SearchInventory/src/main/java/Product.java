public class Product {

    //Declare variables
    private int id;
    private String name;
    private float price;

    //region Getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
    //endregion


    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }



}
