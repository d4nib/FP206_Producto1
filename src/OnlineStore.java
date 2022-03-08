import java.util.ArrayList;

import OScontroller.CustomerController;
import OScontroller.OrderController;
import OScontroller.ProductController;

public class OnlineStore {
    private ArrayList<OSmodel.Order> orders;
    private ArrayList<OSmodel.Customer> customers;
    private ArrayList<OSmodel.Product> products;
    private OrderController orderController;
    private CustomerController customerController;
    private ProductController productController;

    

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
