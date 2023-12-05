package ie.atu;

public class Customer extends Person{
    private String custNo;
    private  boolean mailingList;
    public Customer(){

    }

    public Customer(String name, String address, String phone, String custNo, boolean mailingList){
        super(name, address, phone);
        this.custNo = custNo;
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custNo='" + custNo + '\'' +
                ", mailingList=" + mailingList +
                '}';
    }
}