import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
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


    public List getCustomers() {
            return customers;
    }

    public void runCreateCustomersDialog() {
        TextUI ui = new TextUI();
        String continueDialog = "Y";
        while (continueDialog.equalsIgnoreCase("Y")){


            String name = ui.promptText("Type name of customer:");


            int startAmount = ui.promptNumeric("Type start amount:");




            Customer c = new Customer(name, startAmount);
            this.addCustomer(c);


            continueDialog = ui.promptText("Do you wish to create another customer?Y/N");


        }
    }
}
