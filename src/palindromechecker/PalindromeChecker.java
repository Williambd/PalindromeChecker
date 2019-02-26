/*
 * Palindrome Checker
 * Created by Liam D
 * on 2019-02-22
 * to check how many palindromes are in a given sentence.
 *
 */

package palindromechecker;

import java.util.Scanner;

/**
 *
 * @author lidea9928
 */
public class PalindromeChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //sets up scanner
        System.out.println("Enter a Phrase, And I will tell u how many Palindromes there are"); //prompt
        
        String[] words = in.nextLine().split(" "); //gets an array of words in sentence
        
        int num = 0; //number of palindromes
        
        //for each word in the sentence
        for (int i=0; i<words.length; i++){
            //checks if word is equal to itself in reverse, and if so adds 1 to the number of palindromes.
            if(new StringBuffer(words[i]).reverse().toString().equals(words[i]))num++;           
        }
        
        //outputs the number of palindromes
        System.out.println("there are "+num+" palindromes");
        
        in.close(); //closes the scanner
    }
    
}
