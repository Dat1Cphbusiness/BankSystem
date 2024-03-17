import utils.UI;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static UI ui = new UI();
    static String path = "data/customers.csv";

    public static void main(String[] args) {
       Bank bank = new Bank("Lollandsbanken");



        bank.userDialog();
    }


    public static void saveData(ArrayList<Customer> customers) {


        try {
            FileWriter writer = new FileWriter(path);
            writer.write("Name, Balance\n"); //Giv csv filen en header
            for (Customer c: customers) {
               writer.write(c+"\n"); //"Tess, 40000";
            }
            writer.close();
        }catch (IOException e){

        }
    }
}