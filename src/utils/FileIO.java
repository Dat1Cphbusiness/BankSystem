package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class FileIO {

    public void readPlayerData(String path){

        File file = new File(path);
        try {
            Scanner scan = new Scanner(file);
            scan.nextLine();//skip header

            while(scan.hasNextLine()){
                String s = scan.nextLine(); // "tess, 40000"
                String[] line= s.split(",");
                String name = line[0];
                int balance = Integer.parseInt(line[1].trim());
                //OUT: bank.createCustomer(name,balance);
               //IN: game.registerPlayer();

            }

        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
    }
    public static void saveData(ArrayList<String> customers, String path) {
        try {
            FileWriter writer = new FileWriter(path);
            writer.write("Name, Balance\n"); //Giv csv filen en header
            for (String c: customers) {
                writer.write(c+"\n"); //"Tess, 40000";
            }
            writer.close();
        }catch (IOException e){

        }
    }
}
