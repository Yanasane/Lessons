package ru.amaravin.Utils;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Utils {

    static Scanner in = new Scanner(System.in);



    //Метод для вввода слов с консоли ArrayList

   public static List<String> fillArrayWithWords(List<String> words  ){

        String s = "";
        while (in.hasNext()) {
            s = in.next();
            if (s.equals("Quit")){break;}
            words.add(s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase());
        }
        return words;
    }

    //Метод для ввода слов с ноксоли LinkedList

  //  public static LinkedList<String> fillArrayWithWordsL

    //Метод для вывода слов на консоль

    public static void printArray(List<String> words){

        int size = words.size();
        for (int x = 0; x < size; x++) {
            System.out.println(words.get(x));
        }
    }

}
