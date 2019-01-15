import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        ArrayList<String> slova = new ArrayList<>();

        String s = "";

        while (in.hasNext()) {
            s = in.next();
            if (s.equals("Quit")){break;}
            slova.add(s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase());

        }


        int size  = slova.size();
        for (int x = 0; x < size; x++){
            System.out.println(slova.get(x));
        }








    }
}
