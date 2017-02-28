package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;


/**
 * Prints a count for each character in a string
 */
public class CountCharacters {

    public static void main(String[] args){

        String toCount = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        char[] charactersInString = toCount.toCharArray();
        HashMap<Character, Integer> counted = new HashMap<Character, Integer>();
        for(char letter : charactersInString){
            if (counted.containsKey(letter)) {
                counted.put(letter, counted.get(letter) +1);
            }
            else{
                counted.put(letter, 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : counted.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
