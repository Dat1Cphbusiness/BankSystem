import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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


       /* Main.ui.displayMsg("Velkommen til "+this.name);
        int action = 0;

        while(action != listOfActions.size()){// the quit action is the last action
            action = Main.ui.promptChoice(listOfActions, "Vælg en af følgende:");

            switch(action){
                case 1:
                    //Opret kunde

                    this.createCustomer(null, 0);
                    break;
                case 2:
                    // Vis kunder
                    displayCustomers();
                    break;
                case 3:
                    //Indsæt/Hæv penge
                    int amount = Main.ui.promptNumeric("Skriv beløb");
                    currentCustomer.deposit(amount);
                    break;
            }
            Main.saveData(this.customers);
        }*/

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
