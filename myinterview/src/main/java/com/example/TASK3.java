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
        // Predefined sample data (replace with your actual data)
        String[] sampleData = { "Maçã", "Banana", "Laranja", "Whey", "Uva", "Tangerina", "Refrigerante" };

        // Create an ArrayList to store the data
        ArrayList<String> stringList = new ArrayList();
        for (String item : sampleData) {
            stringList.add(item);
        }

        // Use an Iterator and a set to track visited elements (improvised distinct
        // check)
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

        // Print the list
        System.out.println("Lista:");
        for (String item : stringList) {
            System.out.println(item);
        }

        // Print the number of distinct items
        System.out.println("\nNumero de itens: " + distinctCount);
    }
}