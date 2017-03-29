
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author holls9719
 */
public class HangManGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //makeing a new scanner
        Scanner input = new Scanner(System.in);

        //telling the player to enter a word
        System.out.println("Player 1 enter a word for player 2 to guess.");
        String word = input.nextLine();

        //printing a bunch of spaces to clear screen and hide the word
        for (int i = 0; i < 80; i = i + 1) {
            System.out.println("");
        }

        //turning the word to all lowercase
        word = word.toLowerCase();

        //determine how long the word is
        int Length = word.length();

        //saveing the word with blanks
        String word2 = word;

        //convert word to dashes
        for (int i = 0; i < Length; i++) {
            char temp = word.charAt(i);
            word2 = word2.replace(temp, '-');

        }


        //print a blank line
        System.out.println("");

        //set the number of inncorect guesses player 2 gets to 6
        int guess = 6;
        while (guess > 0) {
            //correct guesses variable defineing
            int correct = 0;

            //prints the word so far
            System.out.println("The word is " + word2);
            //tells player 2 how many guesses they have left
            System.out.println("Player 2 has " + guess + " guesses left.");
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String letter = input.nextLine();
            //turning the inputed letter to lowercase
            letter = letter.toLowerCase();
            //putting the letter into a character form-instead of string
            char letter1 = letter.charAt(0);

            //determines if the letter is part of the word
            //run this loop equal to the number of characters in the inputed word
            for (int i = 0; i < Length; i++) {
                //looks at each character
                char character = word.charAt(i);
                //if the inputed letter is a match
                if (character == letter1) {
                    //replace the correct letter with an astrix
                    word2 = word2.replace(word.charAt(i), '*');
                    //replace the rest of the word with dashes
                }



            }
        }
    }
}