/** This example demonstrates the foundations of building an object-oriented system in Java.
 *  It uses the domain of a bank
 *
 *  Main branch
 *    Customer and Bank classes
 *    - access modifiers
 *    - this keyword
 *    - constructors
 *    - getters and setters
 *    - toString
 *    Main class
 *    - instantiation
 *    - calling instance methods
 *    - displaying state
 *
 *
 *  THINGS TO CONSIDER
 *
 *    The user can now add customers to the bank.
 *    But only if the list of customer objects is empty
 *    what if we want the user to add customers ad-hoc?
 *    what about other actions, like adding money to a customer's account?
 *    How could this be achieved?
 *
 */


class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Sparekassen");

        if(bank.getCustomers().isEmpty()){
            bank.runCreateCustomersDialog();
        }


        System.out.print(bank);


    }
}