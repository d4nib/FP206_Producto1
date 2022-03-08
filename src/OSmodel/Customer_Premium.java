package OSmodel;

public class Customer_Premium extends Customer {
    private double customerFee;
    private int customerDiscount;

    
    public Customer_Premium(String firstname, String lastname, String email, String address, String idCardNumbber,
            double customerFee, int customerDiscount) {
        super(firstname, lastname, email, address, idCardNumbber);
        this.customerFee = customerFee;
        this.customerDiscount = customerDiscount;
    }


    

    
}
