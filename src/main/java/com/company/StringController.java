package com.company;

public class StringController {
    //V-8
    public static Integer getNumberOfWordsThatStartWithLetter(String data, char letter){
        int counter = 0;
        String[] dividedWords = (data.split("\\s+"));
        for(String word : dividedWords){
            if(word.contains(Character.toString(letter)) && word.length() > 1){
                counter++;
            }
        }
        return counter;
    }

    public static Boolean ifAnyWordStartsWithLetter(String data, char letter){
        String[] dividedWords = (data.split("\\s+"));
        for(String word : dividedWords){
            if(word.startsWith(Character.toString(letter)) && word.length() > 1){
                return true;
            }
        }
        return false;
    }
}
