package org.launchcode.java.studios;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * Prints a count for each character in a string
 */
public class CountCharacters {

    public static void main(String[] args) throws Exception {
       // Default String
//        String toCount = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";

        // Optional Command Line
//        String toCount = args[0];

        // Optional read from file
        String toCount = new Scanner(new File("C:\\Users\\J\\code\\Java\\java-exercises\\src\\org\\launchcode\\java\\studios\\Lorem.txt")).useDelimiter("\\Z").next();

        char[] charactersInString = toCount.toCharArray();
        HashMap<Character, Integer> counted = new HashMap<>();
        for(char letter : charactersInString){
            // Optional find only alpha
            if(Character.isAlphabetic(letter)){
                // Optional convert to lowercase
                letter = Character.toLowerCase(letter);
                if (counted.containsKey(letter)) {
                    counted.put(letter, counted.get(letter) +1);
                }
                else{
                    counted.put(letter, 1);
                }
            }
        }
        for(Map.Entry<Character, Integer> entry : counted.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
