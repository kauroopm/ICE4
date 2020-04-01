/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice4;

import java.lang.reflect.Array;

/**
 *
 * @author kauro
 */
public class ICE4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("" + first());
        System.out.println("" + second());
        System.out.println("" + third());
    }

    public static int first() {
        String string = "the colored port should be black or white or brown";
        String[] words = string.split(" ");
        String word = "or";
        int occurrences = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                occurrences++;
            }
        }
        return (occurrences);
    }

    public static int second() {
        String name = "Just for Testing";
        int greatestVal = 0;
        for (int i = 0; i < name.length(); i++) {
            int curVal = (int) name.charAt(i);
            if (curVal > greatestVal) {
                greatestVal = curVal;
            }
        }
        char asChar = (char) greatestVal;
        System.out.println("The character with the highest ASCII (encoding) number was " + asChar + " (with ASCII (encoding) " + greatestVal + ")");
        return(asChar);  
    }

    public static boolean third() {
        String str = "Banana";
        return (str.contains("a"));
    }
}
