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
        Scanner scan = new Scanner(System.in);
        String createCustomer = "yes";
        while (createCustomer.equalsIgnoreCase("yes")){

            System.out.println("Type name of customer:");
            String name = scan.nextLine();

            System.out.println("Type start amount:");
            float startAmount = scan.nextFloat();

            //Flush (Scanner bug)
            scan.nextLine();

            Customer c = new Customer(name, startAmount);
            this.addCustomer(c);

            System.out.println("Do you wish to create another customer?");
            createCustomer = scan.nextLine();

        }
    }
}
