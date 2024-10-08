import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private String name;
    private List<Customer> customers;
    private List<String> listOfActions;
    private Customer selectedCustomer;

    public Bank(String name) {
        this.name = name;
        customers = new ArrayList<>();
        this.createCustomersFromData("data/customers.csv");

        listOfActions = new ArrayList<>();
        listOfActions.add("1) Create  Customer");
        listOfActions.add("2) Select Customer");
        listOfActions.add("3) Deposit amount");
        listOfActions.add("4) Quit");
    }
    public void createCustomersFromData(String path){
        List<String> data=FileIO.readData(path);
        if(!data.isEmpty()){
            for (String s:data) {
                String[] values= s.split(",");
                String name = values[0];
                float balance = Float.parseFloat(values[1].trim());
                this.createCustomer(name,balance);
        }
    }

    }

    public void runDialog() {
        int action = 0;
        while(action != listOfActions.size()){// the quit action must be the last action
            action = TextUI.promptChoice(listOfActions,"Choose an action from the list:");
            switch (action){
                case 1: //Create customers
                        runCreateCustomersDialog();
                        break;
                case 2: //Select customer
                        int id = TextUI.promptChoice(getCustomersAsStrings(), "Select a customer:");
                        selectedCustomer = this.getCustomerById(id);
                        TextUI.displayMsg("You have selected "+selectedCustomer);
                        break;
                case 3: //Deposit amount
                        float amount = TextUI.promptNumeric("Type amount:");
                        selectedCustomer.addToBalance(amount);
                        break;
            }
        }

    }

    private Customer getCustomerById(int id) {
        return customers.get(id-1);
    }

    /**
     *
     * @return the list of customer objects as a list of String objects
     */
    private List<String> getCustomersAsStrings() {
        List<String> list = new ArrayList<>();
        for (Customer c:customers
             ) {
            list.add(c.toString());

        }
        return list;
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


    public void runCreateCustomersDialog() {

        String continueDialog = "Y";
        while (continueDialog.equalsIgnoreCase("Y")){


            String name =  TextUI.promptText("Type name of customer:");

            float startAmount = (float) TextUI.promptNumeric("Type start amount:");

            Customer c = new Customer(name, startAmount);
            this.addCustomer(c);

            continueDialog = TextUI.promptText("Do you wish to create another customer?Y/N");
        }
    }


    public void createCustomer(String name, float startAmount) {
        Customer c = new Customer(name, startAmount);
        this.addCustomer(c);
    }

    public void endSession() {
        FileIO.saveData(this.getCustomersAsStrings(),"data/customers.csv", "Name, Balance");
    }
}
