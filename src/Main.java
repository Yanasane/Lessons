import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        ArrayList<String> slova = new ArrayList<>();



        while (in.next()!="Quit") {
           String s = in.next();
            slova.add(s);

        }


        int size  = slova.size();
        for (int x = 0; x < size; x++){
            System.out.println(slova.get(x));
        }








    }
}
