/** This example demonstrates the foundations of building an object-oriented system in Java.
 *  It uses the domain of a bank
 *
 *  Refactor_main_FileIO branch demonstrates the following subjects and techniques
 *
 *
 *  Main
 *   - refactoring by removal of business logic code
 *  FileIO
 *
 *  Bank
 *   - conditioned call from constructor to get the data read
 *   - endSession method with a call to FileIO's saveData method
 *
 * Things to consider
 *  We can use this code as boilerplate for any project that uses user dialog and datapersistence.
 *  For example, we soon need to create a turnbased game, where the player's score must be saved after each session.
 *  We could start here and start by refactoring the Customer class into a Player class, and the Bank class into a Game class.
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