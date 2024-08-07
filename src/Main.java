/** This example demonstrates the foundations of building an object-oriented system in Java.
 *  It uses the domain of a bank
 *
 *  adHoc_object_creation branch
 *     Bank class
 *    - getter for customers list, needed to check if we want the user to create customers
 *    - a method for users to create customers
 *
 *    Main class
 *    - instantiation now only of Bank class
 *    - call to Bank object's method for creating customers
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