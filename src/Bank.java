import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        customers = new ArrayList<>();
    }
    public void addCustomer(Customer c){
        this.customers.add(c);
    }
    public String toString(){
        String s = "";
        for (Customer c:customers) {
            s+=c+"\n";
        }
        return s;
    }

}
