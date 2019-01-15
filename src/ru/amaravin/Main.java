package ru.amaravin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static ru.amaravin.Utils.Utils.fillArrayWithWords;
import static ru.amaravin.Utils.Utils.printArray;


public class Main {


    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        List<String> words1 = new LinkedList<>();

        fillArrayWithWords(words);
        printArray(words);
        fillArrayWithWords(words1);
        printArray(words1);




    }
}
