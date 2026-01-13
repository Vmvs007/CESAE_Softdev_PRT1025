package Models;

public class Sale {
    private String category;
    private String productName;
    private double quantity;
    private double price;

    public Sale(String category, String productName, double quantity, double price) {
        this.category = category;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public String getProductName() {
        return productName;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
