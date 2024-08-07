/** This example demonstrates the foundations of building an object-oriented system in Java.
 *  It uses the domain of a bank
 *
 *  Interactivity branch
 *    The user can now do multiple things:
 *    - add new customers
 *    - see a list of customer
 *    - choose a customer
 *    - update a customer's balance
 *    - end the session
 *
 *
 *  THINGS TO CONSIDER
 *
 *    A user session will now generate new valuable data,
 *    but when the session ends, this data is gone
 *    How can we persist the state of the program so that next time
 *    we start the program we can continue where we left off?
 *
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