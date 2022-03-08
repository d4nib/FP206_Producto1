package OSmodel;

import java.time.LocalDateTime;

public class Order {
    private String orderID;
    private Product product; // Esto no está como en el diagrama. He añadido los productos en sí para respetar las relaciones
    private Customer customer;
    private int product_qty;
    private double subtotal;
    private double shipingFee;
    private LocalDateTime creationDT;
    private int handling;




    // CONSTRUCTOR
    public Order(String orderID, Product product, Customer customer, int product_qty, double subtotal, double shipingFee,
            LocalDateTime creationDT, int handling) {
        this.orderID = orderID;
        this.product = product;
        this.customer = customer;
        this.product_qty = product_qty;
        this.subtotal = subtotal;
        this.shipingFee = shipingFee;
        this.creationDT = creationDT;
        this.handling = handling;
    }

    // CHECKERS - Comprueban las políticas de negocio y calculan resultados

    public boolean isCancellable(){
        
        /*if (LocalTime.now() > this.creationDT + handling * 60){

        }*/

        return false;

    }

    public boolean clientExists(){

       return false; 
    }

    public double calculateShipping(){
        double ret;
        ret = this.shipingFee;
        return ret;
    }

    public double calculateOrderTotal(){
        double orderTotal;

        orderTotal = product_qty * this.product.getPrice() ;

        return orderTotal;

    }



    // GETTERS & SETTERS

    public String getorderID() {
        return orderID;
    }




    public void setorderID(String orderID) {
        this.orderID = orderID;
    }




    public Product getProduct() {
        return product;
    }




    public void setProduct(Product product) {
        this.product = product;
    }




    public Customer getCustomer() {
        return customer;
    }




    public void setCustomer(Customer customer) {
        this.customer = customer;
    }




    public int getProduct_qty() {
        return product_qty;
    }




    public void setProduct_qty(int product_qty) {
        this.product_qty = product_qty;
    }




    public double getSubtotal() {
        return subtotal;
    }




    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }




    public double getShipingFee() {
        return shipingFee;
    }




    public void setShipingFee(double shipingFee) {
        this.shipingFee = shipingFee;
    }




    public LocalDateTime getCreationDT() {
        return creationDT;
    }




    public void setCreationDT(LocalDateTime creationDT) {
        this.creationDT = creationDT;
    }




    public int getHandling() {
        return handling;
    }




    public void setHandling(int handling) {
        this.handling = handling;
    }



    @Override
    public String toString() {
        return "Order [creationDT=" + creationDT + ", customer=" + customer + ", handling=" + handling + ", product="
                + product + ", product_qty=" + product_qty + ", shipingFee=" + shipingFee + ", orderID=" + orderID
                + ", subtotal=" + subtotal + "]";
    }



    
    

    


    
}
