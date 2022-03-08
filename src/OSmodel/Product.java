package OSmodel;



import org.w3c.dom.Text;

public class Product {
    private String productSku;
    private String productName;
    private Text description;
    private double price;
    private double shippingFee;
    private int handling;



    // CONSTRUCTOR
    public Product(String productSku, String productName, Text description, double price, double shippingFee,
            int handling) {
        this.productSku = productSku;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.shippingFee = shippingFee;
        this.handling = handling;
    }


   







       // GETTERS & SETTERS
    public String getProductSku() {
        return productSku;
    }



    public void setProductSku(String productSku) {
        this.productSku = productSku;
    }



    public String getProductName() {
        return productName;
    }



    public void setProductName(String productName) {
        this.productName = productName;
    }



    public Text getDescription() {
        return description;
    }



    public void setDescription(Text description) {
        this.description = description;
    }



    public double getPrice() {
        return price;
    }



    public void setPrice(double price) {
        this.price = price;
    }



    public double getShippingFee() {
        return shippingFee;
    }



    public void setShippingFee(double shippingFee) {
        this.shippingFee = shippingFee;
    }



    public int getHandling() {
        return handling;
    }



    public void setHandling(int handling) {
        this.handling = handling;
    }


 

    


    
    
}
