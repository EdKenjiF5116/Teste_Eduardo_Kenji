package com.example;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a list and add an aleatory number of Strings. In the end, print out how
 * many distinct itens exists on the list.
 *
 */
public class TASK3 {

    public static void main(String[] args) {
        String[] sampleData = { "Maçã", "Banana", "Laranja", "Whey", "Uva", "Tangerina", "Refrigerante" };

        // Create an ArrayList to store the data
        ArrayList<String> stringList = new ArrayList();
        for (String item : sampleData) {
            stringList.add(item);
        }

        int distinctCount = 0;
        ArrayList<String> visitedList = new ArrayList();
        Iterator<String> iterator = stringList.iterator();

        while (iterator.hasNext()) {
            String item = iterator.next();
            if (!visitedList.contains(item)) {
                visitedList.add(item);
                distinctCount++;
            }
        }

        System.out.println("Lista:");
        for (String item : stringList) {
            System.out.println(item);
        }

        System.out.println("\nNumero de itens: " + distinctCount);
    }
}