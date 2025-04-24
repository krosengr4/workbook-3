public class StoreProduct {
    //Declare variables
    private int id;
    private String name;
    private double price;

    //Constructor for a product
    public StoreProduct(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //region Getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    //endregion
}
