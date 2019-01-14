import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        ArrayList<String> slova = new ArrayList<>();

        String s = "null";

        for (int x = 0; s != "Quit"; x++){
            s = in.next();
            slova.add(s);
            if (slova.contains("Quit")) {
                slova.remove("Quit");
                break;
            }
        }
        int size  = slova.size();
        for (int x = 0; x < size; x++){
            System.out.println(slova.get(x));
        }


        //          System.out.println(slova);







    }
}
