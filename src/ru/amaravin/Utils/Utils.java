package ru.amaravin.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class Utils {

    Scanner in = new Scanner(System.in);

    ArrayList<String> slova = new ArrayList<>();

    //Метод для вввода слов с консоли
   public ArrayList<String> vvodSlov (){

        String s = "";

        while (in.hasNext()) {
            s = in.next();
            if (s.equals("Quit")){break;}
            slova.add(s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase());

        }
        return slova;
    }

    //Метод для вывода слов на консоль

    public void vivodSlov(){
        int size = slova.size();
        for (int x = 0; x < size; x++) {
            System.out.println(slova.get(x));
        }

    }

}