
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author holls9719
 */
public class try2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ////makeing a new scanner
        Scanner input = new Scanner(System.in);

        //telling the player to enter a word
        System.out.println("Player 1 enter a word for player 2 to guess.");

        //new word
        String word = input.nextLine();
        String word2 = word;

        // convert word to dashes
        for (int i = 0; i < word.length(); i++) {
            char character = word2.charAt(i);
            word2 = word2.replace(character, '-');
        }
        
        //setting the number of incorrect guesses to 6
        int incorrect == 6;
        //printing a bunch of spaces to clear screen and hide the word
        for (int i = 0; i < 80; i = i + 1) {
            System.out.println("");
        }
        //print the word with the blanks
        System.out.println(word2);

        //asks player 2 to input a guess
        System.out.println("Please guess a letter.");
        //input for the letter
        String guess = input.nextLine();
        //turning the inputed letter to lowercase
        guess = guess.toLowerCase();
        //putting the letter into a character form-instead of string
        char guess1 = guess.charAt(0);

        //convert the correct letter to astrixs and save that to word2
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            //if they guess wrong take 1 guess away and tell the player
            if (guess1 != character){
                incorrect = incorrect -1;
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + "guesses left.");
            }
            if (guess1 == character) {
                word2 = word.replace(character, '*');
                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '*') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('*', character);
            }
        }
        //print the word
        System.out.println(word2);
        //if the word still has blanks, let the person guess again
        if (word2.contains('-')) {
        }
    }
}
