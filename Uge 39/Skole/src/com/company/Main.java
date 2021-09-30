package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    private static String[] text;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
        System.out.println(text.length);

        printWordsStartingWith("Ø");

        printWordsOfLength(3);

        longestWord();
        System.out.println();
        printFirstHalfOfEachWord();
        System.out.println();
        printMostFrequentLetter();
        System.out.println();
        printLeastFrequentLetter();

        //test dine metoder ved at kalde dem her:


    }

    private static void printWordsOfLength(int l) {
        boolean wordisvalid = true;

        for (String s : text) {
            if (s.length() == l) {
                if (s.contains(",") || s.contains(".")) {
                    wordisvalid = false;
                }

                if (wordisvalid) {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern) {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase())) {
                System.out.println(s);
            }
        }
    }

    private static void longestWord() {
        int lastLongestWord = 0;
        String veryLongWord = "";
        for (String s : text) {
            int wordLength = s.length();

            if (wordLength > lastLongestWord) {
                lastLongestWord = wordLength;
                veryLongWord = s;
            }
        }
        System.out.println("This is the longest word " + veryLongWord);
    }

    private static void printFirstHalfOfEachWord() {
        for (String s : text) {
            System.out.println(s.substring(0, s.length() / 2));
        }
    }

    private static void printMostFrequentLetter() {
        int[] charCounter = new int[Character.MAX_VALUE + 1];
        char mostAppeared = ' ';
        int counter = 0;
        for (String s : text) {
            for (int i = 0; i < s.length(); i++) {
                char character = s.toUpperCase().charAt(i);
                charCounter[character]++;
            }
        }
        for (int i = 0; i < 10; i++) {
            int lastNumber = 0;
            int position = 0;
            for (int j = 0; j < charCounter.length; j++) {
                int newNumber = charCounter[j];
                if (newNumber > lastNumber) {
                    lastNumber = newNumber;
                    position = j;
                }
            }
            System.out.println(i+1 + ". most appeared letter is: " + (char) position + " and it appered " + charCounter[position] + " times.");
            charCounter[position] = 0;
        }
    }

    private static void printLeastFrequentLetter() {
        int[] charCounter = new int[Character.MAX_VALUE + 1];
        char mostAppeared = ' ';
        int counter = 0;
        for (String s : text) {
            for (int i = 0; i < s.length(); i++) {
                char character = s.toUpperCase().charAt(i);
                charCounter[character]++;
            }
        }
        for (int i = 0; i < 10; i++) {
            int lastNumber = Integer.MAX_VALUE;
            int position = 0;
            for (int j = 65; j < 122; j++) {
                int newNumber = charCounter[j];
                if (newNumber < lastNumber && newNumber!=0) {
                    lastNumber = newNumber;
                    position = j;
                }
                if(j==90) j+=6;
            }
            System.out.println(i+1 + ". least appeared letter is: " + (char) position + " and it appered " + charCounter[position] + " times.");
            charCounter[position] = 0;
        }
    }
}