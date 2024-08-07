import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** This example demonstrates the foundations of building an object-oriented system in Java.
 *  It uses the domain of a bank
 *
 *  Persistence branch
 *    The customer data is now being persisted, meaning that when a session ends,
 *   the state (name and balance) of all the customer objects gets written to a file
 *   It also means that when the session starts, the code will look for data
 *   and recreate customer objects based on that data.
 *
 *
 *
 *  THINGS TO CONSIDER
 *  The main method is no longer as clean as befor.
 *  With all the code concerned with persistance, it has become difficult to read.
 *  Consider how we can refactor by moving this code to a utility class for data persistence - like the one we have for interacting with the user, TextUI
 *
 */


class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Sparekassen");
        String path ="customers.csv";
        File file = new File(path);
        try {
            Scanner scan = new Scanner(file);
            scan.nextLine();//skip header

            while(scan.hasNextLine()){
                String line = scan.nextLine(); // "tess, 40000"
                String[] values= line.split(",");
                String name = values[0];
                int balance = Integer.parseInt(values[1].trim());
                bank.createCustomer(name,balance);

            }

        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }

        bank.runDialog();



        System.out.print(bank);


    }
}