package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
//        FileParser.generateCSVFile("test without", "without_b");
//        String data = FileParser.readCSVFile("without_b.txt");
//        System.out.println(StringController.getNumberOfWordsThatStartWithLetter(data, 'b'));
//
//        FileParser.generateCSVFile("test with b sequence: best, bear, ban", "with_b_words");
//        String dataWithBWords = FileParser.readCSVFile("with_b_words.txt");
//        System.out.println(StringController.getNumberOfWordsThatStartWithLetter(dataWithBWords, 'b'));

        FileParser.generateCSVFile("test without words that starts with a", "without_a");
        String data = FileParser.readCSVFile("without_a.txt");
        System.out.println(StringController.ifAnyWordStartsWithLetter(data, 'a'));

        FileParser.generateCSVFile("test with any word that starts with a", "with_a");
        String dataWithA = FileParser.readCSVFile("with_a.txt");
        System.out.println(StringController.ifAnyWordStartsWithLetter(dataWithA, 'a'));

    }
}
