package Task2;

public class Invoice {

    private String deviceModel;
    private String productDescription;
    private int quantity;
    private double price;

    public Invoice(String deviceModel, String productDescription, int quantity, double price) {
        this.deviceModel = deviceModel;
        this.productDescription = productDescription;
        setQuantity(quantity);
        setPrice(price);
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        } else {
            this.price = 0.0;
        }
    }

    public double getAmount() {
        return quantity * price;
    }

    public static void main(String[] args) {

        Invoice myInvoice = new Invoice("Model S", "Tesla", 5, 19);
        double amount = myInvoice.getAmount();
        System.out.println("Amount due: $" + amount);
    }

}
