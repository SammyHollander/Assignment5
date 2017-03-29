
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author holls9719
 */
public class testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //makeing a new scanner
        Scanner input = new Scanner(System.in);

        //new word
        String word = input.nextLine();
        String word2 = word;
        // convert word to dashes
        for (int i = 0; i < word.length(); i++) {
            char character = word2.charAt(i);
            word2 = word2.replace(character, '-');
        }
        //tells me how many spaces/what word is- just a test
        System.out.println(word2);
        System.out.println(word);

        //input the guessed letter
        String guess = input.nextLine();
        //saves guessed letter as a character
        char guess1 = guess.charAt(0);

        //change guessed value to astrixes
        //then rest of word to dashes
        //then astrixies to the letter
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            if (guess1 == character) {
                word2 = word.replace(character, '*');
                System.out.println(word2);

            }
            if(word2.charAt(i) == 'a' || word2.charAt(i) == 'b' && word2.charAt(i) != (guess1)){
                word2 = word.replace(word2.charAt(i), '-');
                System.out.println(word2);
                // String firsthalf = word2.substring(0, i);
                //  for(int x = 0; x<i; x++){
                //    firsthalf = word.replace(word.charAt(x), '-');
                //   }

            }

        }



    }
}
