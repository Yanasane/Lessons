package ru.amaravin.Utils;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {

    static Scanner in = new Scanner(System.in);



    //Метод для вввода слов с консоли

   public static ArrayList<String> fillArrayWithWords(ArrayList<String> words){

        String s = "";
        while (in.hasNext()) {
            s = in.next();
            if (s.equals("Quit")){break;}
            words.add(s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase());
        }
        return words;
    }

    //Метод для вывода слов на консоль

    public static void printArray(ArrayList<String> words){

        int size = words.size();
        for (int x = 0; x < size; x++) {
            System.out.println(words.get(x));
        }
    }

}
