package com.string1;

public class LastLength {
    public static void main(String[] args) {
        String sentence = "Wollt ihr in haut und haaren untergehen";
        String last_word = sentence.substring(sentence.lastIndexOf(' ')+1);
        System.out.println("Last word is '"+ last_word+"' and its length is "+last_word.length());
    }
}
