package OSmodel;

public abstract class Customer {
    protected String firstname;
    protected String lastname;
    protected String email;
    protected String address;
    protected String idCardNumbber;
    // protected CustomerType type;


    // CONSTRUCTOR
    public Customer(String firstname, String lastname, String email, String address, String idCardNumbber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.idCardNumbber = idCardNumbber;
    }


    // CUSTOMER TYPE CHECK

    public boolean isRegular(){
        // if this.type == "Regular" return true else return false
        return true;
    }

    // SETTERS & GETTERS
    public String getFirstname() {
        return firstname;
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public String getLastname() {
        return lastname;
    }


    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getIdCardNumbber() {
        return idCardNumbber;
    }


    public void setIdCardNumbber(String idCardNumbber) {
        this.idCardNumbber = idCardNumbber;
    }


    

    
    


    


    
}
