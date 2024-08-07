/** This example demonstrates the foundations of building an object-oriented system in Java.
 *  It uses the domain of a bank
 *
 *  Refactor_main_FileIO branch
 *      We have cleaned up the main method by
 *      moving all file reading and writing code
 *      to a utility class called FileIO
 *
 *  Main
 *   - call to an endSession method in Bank
 *  Bank
 *   - conditioned call from constructor to get the data read
 *   - endSession method with a call to FileIO's saveData method
 *
 */


class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Sparekassen");

        bank.runDialog();

        bank.endSession();

        System.out.print(bank);


    }

}