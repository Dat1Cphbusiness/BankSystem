import java.util.List;
import java.util.Scanner;

public class TextUI {

    private static Scanner scan = new Scanner(System.in);

    public static void displayList(List<String> list, String msg){
        System.out.println(msg);
        http:
        for (String option : list) {
            System.out.println(option);
        }
    }
    public static String promptText(String msg){
        System.out.println(msg);
        String input = scan.nextLine();
        return input;
    }
    public static int promptNumeric(String msg){
        String input = promptText(msg);         //Give brugere et sted at placere sit svar og vente pÃ¥ svaret
        int number = Integer.parseInt(input);       //Konvertere svaret til et tal
        return number;
    }
    public static int promptChoice(List<String> optionslist, String msg){//["Gin&Tonic", "Beer","Vine" ]
        displayMsg(msg);
        displayList(optionslist, "");
        int input = promptNumeric("");//1
      //  return optionslist.get(input-1);
        return input;

    }

  public static void displayMsg(String msg){

      System.out.println(msg);
  }

}