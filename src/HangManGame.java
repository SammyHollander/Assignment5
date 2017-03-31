
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

        //define all the guess variables as temporarily 'a' 
        char guess1i = 'a';
        char guess2i = 'a';
        char guess3i = 'a';
        char guess4i = 'a';
        char guess5i = 'a';
        char guess6i = 'a';
        char guess7i = 'a';
        char guess8i = 'a';
        char guess9i = 'a';
        char guess10i = 'a';
        char guess11i = 'a';
        char guess12i = 'a';
        char guess13i = 'a';
        char guess14i = 'a';
        char guess15i = 'a';
        char guess16i = 'a';
        char guess17i = 'a';
        char guess18i = 'a';
        char guess19i = 'a';
        char guess20i = 'a';
        char guess21i = 'a';
        char guess22i = 'a';
        char guess23i = 'a';
        char guess24i = 'a';
        char guess25i = 'a';
        char guess26i = 'a';


        //telling the player to enter a word
        System.out.println("Player 1 enter a word for player 2 to guess.");

        //new word
        String word = input.nextLine();

        //creating a filter so the word does not contain any characters or numbers
        while (word.contains("1") || word.contains("2") || word.contains("3") || word.contains("4") || word.contains("5") || word.contains("6") || word.contains("7") || word.contains("8") || word.contains("9") || word.contains("0") || word.contains("_") || word.contains("*") || word.contains("&") || word.contains("^") || word.contains("%") || word.contains("$") || word.contains("#") || word.contains("@") || word.contains("!") || word.contains("=") || word.contains("+") || word.contains("|") || word.contains(".") || word.contains("?") || word.contains("<") || word.contains(">")) {
            System.out.println("sorry " + word + " is not a word. Please enter a new word:");
            word = input.nextLine();
        }
        String word2 = word;

        // convert word to dashes
        for (int i = 0; i < word.length(); i++) {
            char character = word2.charAt(i);
            word2 = word2.replace(character, '-');
        }

        //setting the number of incorrect guesses to 6
        int incorrect = 6;
        //printing a bunch of spaces to clear screen and hide the word
        for (int i = 0; i < 80; i = i + 1) {
            System.out.println("");
        }
        //print the word with the blanks
        System.out.println(word2);

        //if there are blanks in the word then;
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess1 = input.nextLine();
            //turning the inputed letter to lowercase
            guess1 = guess1.toLowerCase();
            //putting the letter into a character form-instead of string
            guess1i = guess1.charAt(0);

            //convert the correct letter to astrixs and save that to word2

            if (word.contains(guess1)) {
                word2 = word.replace(guess1i, '*');
                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '*') {
                        word2 = word2.replace(word2.charAt(x), '-');
                    }

                }
                //fill in the guessed letter
                word2 = word2.replace('*', guess1i);
            }
            //if they guessed incorrectly
            if (!(word.contains(guess1))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);

        //if the word still has blanks, let them guess a letter
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess2 = input.nextLine();
            //turning the inputed letter to lowercase
            guess2 = guess2.toLowerCase();
            //putting the letter into a character form-instead of string
            guess2i = guess2.charAt(0);

            //if the letter guessed was correct
            if (word.contains(guess2)) {
                word2 = word;
                //replace the guess with temp variables
                word2 = word2.replace(guess2i, '1');
                word2 = word2.replace(guess1i, '*');
                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '1' && word2.charAt(x) != '*') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('*', guess1i);
                word2 = word2.replace('1', guess2i);
            }
            //if the guess was incorrect;
            if (!(word.contains(guess2))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);

        //if the word still has blanks, let them guess a letter
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess3 = input.nextLine();
            //turning the inputed letter to lowercase
            guess3 = guess3.toLowerCase();
            //putting the letter into a character form-instead of string
            guess3i = guess3.charAt(0);

            //if the letter guessed was correct
            if (word.contains(guess3)) {
                word2 = word;
                //replace the guess with temp variables
                word2 = word2.replace(guess3i, '3');
                word2 = word2.replace(guess2i, '2');
                word2 = word2.replace(guess1i, '1');

                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '1' && word2.charAt(x) != '2' && word2.charAt(x) != '3') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('1', guess1i);
                word2 = word2.replace('2', guess2i);
                word2 = word2.replace('3', guess3i);
            }
            //if the guess was incorrect;
            if (!(word.contains(guess3))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);


        //if the word still has blanks, let them guess a letter
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess4 = input.nextLine();
            //turning the inputed letter to lowercase
            guess4 = guess4.toLowerCase();
            //putting the letter into a character form-instead of string
            guess4i = guess4.charAt(0);

            //if the letter guessed was correct
            if (word.contains(guess4)) {
                word2 = word;
                //replace the guess with temp variables
                word2 = word2.replace(guess4i, '4');
                word2 = word2.replace(guess3i, '3');
                word2 = word2.replace(guess2i, '2');
                word2 = word2.replace(guess1i, '1');

                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '1' && word2.charAt(x) != '2' && word2.charAt(x) != '3' && word2.charAt(x) != '4') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('1', guess1i);
                word2 = word2.replace('2', guess2i);
                word2 = word2.replace('3', guess3i);
                word2 = word2.replace('4', guess4i);
            }
            //if the guess was incorrect;
            if (!(word.contains(guess4))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);

        //if the word still has blanks, let them guess a letter
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess5 = input.nextLine();
            //turning the inputed letter to lowercase
            guess5 = guess5.toLowerCase();
            //putting the letter into a character form-instead of string
            guess5i = guess5.charAt(0);

            //if the letter guessed was correct
            if (word.contains(guess5)) {
                word2 = word;
                //replace the guess with temp variables
                word2 = word2.replace(guess5i, '5');
                word2 = word2.replace(guess4i, '4');
                word2 = word2.replace(guess3i, '3');
                word2 = word2.replace(guess2i, '2');
                word2 = word2.replace(guess1i, '1');

                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '1' && word2.charAt(x) != '2' && word2.charAt(x) != '3' && word2.charAt(x) != '4' && word2.charAt(x) != '5') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('1', guess1i);
                word2 = word2.replace('2', guess2i);
                word2 = word2.replace('3', guess3i);
                word2 = word2.replace('4', guess4i);
                word2 = word2.replace('5', guess5i);
            }
            //if the guess was incorrect;
            if (!(word.contains(guess5))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);


        //if the word still has blanks, let them guess a letter
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess6 = input.nextLine();
            //turning the inputed letter to lowercase
            guess6 = guess6.toLowerCase();
            //putting the letter into a character form-instead of string
            guess6i = guess6.charAt(0);

            //if the letter guessed was correct
            if (word.contains(guess6)) {
                word2 = word;
                //replace the guess with temp variables
                word2 = word2.replace(guess6i, '6');
                word2 = word2.replace(guess5i, '5');
                word2 = word2.replace(guess4i, '4');
                word2 = word2.replace(guess3i, '3');
                word2 = word2.replace(guess2i, '2');
                word2 = word2.replace(guess1i, '1');

                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '1' && word2.charAt(x) != '2' && word2.charAt(x) != '3' && word2.charAt(x) != '4' && word2.charAt(x) != '5' && word2.charAt(x) != '6') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('1', guess1i);
                word2 = word2.replace('2', guess2i);
                word2 = word2.replace('3', guess3i);
                word2 = word2.replace('4', guess4i);
                word2 = word2.replace('5', guess5i);
                word2 = word2.replace('6', guess6i);
            }
            //if the guess was incorrect;
            if (!(word.contains(guess6))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);


        //if the word still has blanks, let them guess a letter
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess7 = input.nextLine();
            //turning the inputed letter to lowercase
            guess7 = guess7.toLowerCase();
            //putting the letter into a character form-instead of string
            guess7i = guess7.charAt(0);

            //if the letter guessed was correct
            if (word.contains(guess7)) {
                word2 = word;
                //replace the guess with temp variables
                word2 = word2.replace(guess7i, '7');
                word2 = word2.replace(guess6i, '6');
                word2 = word2.replace(guess5i, '5');
                word2 = word2.replace(guess4i, '4');
                word2 = word2.replace(guess3i, '3');
                word2 = word2.replace(guess2i, '2');
                word2 = word2.replace(guess1i, '1');

                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '1' && word2.charAt(x) != '2' && word2.charAt(x) != '3' && word2.charAt(x) != '4' && word2.charAt(x) != '5' && word2.charAt(x) != '6' && word2.charAt(x) != '7') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('1', guess1i);
                word2 = word2.replace('2', guess2i);
                word2 = word2.replace('3', guess3i);
                word2 = word2.replace('4', guess4i);
                word2 = word2.replace('5', guess5i);
                word2 = word2.replace('6', guess6i);
                word2 = word2.replace('7', guess7i);
            }
            //if the guess was incorrect;
            if (!(word.contains(guess7))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);


        //if the word still has blanks, let them guess a letter
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess8 = input.nextLine();
            //turning the inputed letter to lowercase
            guess8 = guess8.toLowerCase();
            //putting the letter into a character form-instead of string
            guess8i = guess8.charAt(0);

            //if the letter guessed was correct
            if (word.contains(guess8)) {
                word2 = word;
                //replace the guess with temp variables
                word2 = word2.replace(guess8i, '8');
                word2 = word2.replace(guess7i, '7');
                word2 = word2.replace(guess6i, '6');
                word2 = word2.replace(guess5i, '5');
                word2 = word2.replace(guess4i, '4');
                word2 = word2.replace(guess3i, '3');
                word2 = word2.replace(guess2i, '2');
                word2 = word2.replace(guess1i, '1');

                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '1' && word2.charAt(x) != '2' && word2.charAt(x) != '3' && word2.charAt(x) != '4' && word2.charAt(x) != '5' && word2.charAt(x) != '6' && word2.charAt(x) != '7' && word2.charAt(x) != '8') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('1', guess1i);
                word2 = word2.replace('2', guess2i);
                word2 = word2.replace('3', guess3i);
                word2 = word2.replace('4', guess4i);
                word2 = word2.replace('5', guess5i);
                word2 = word2.replace('6', guess6i);
                word2 = word2.replace('7', guess7i);
                word2 = word2.replace('8', guess8i);
            }
            //if the guess was incorrect;
            if (!(word.contains(guess8))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);


        //if the word still has blanks, let them guess a letter
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess9 = input.nextLine();
            //turning the inputed letter to lowercase
            guess9 = guess9.toLowerCase();
            //putting the letter into a character form-instead of string
            guess9i = guess9.charAt(0);

            //if the letter guessed was correct
            if (word.contains(guess9)) {
                word2 = word;
                //replace the guess with temp variables
                word2 = word2.replace(guess9i, '9');
                word2 = word2.replace(guess8i, '8');
                word2 = word2.replace(guess7i, '7');
                word2 = word2.replace(guess6i, '6');
                word2 = word2.replace(guess5i, '5');
                word2 = word2.replace(guess4i, '4');
                word2 = word2.replace(guess3i, '3');
                word2 = word2.replace(guess2i, '2');
                word2 = word2.replace(guess1i, '1');

                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '1' && word2.charAt(x) != '2' && word2.charAt(x) != '3' && word2.charAt(x) != '4' && word2.charAt(x) != '5' && word2.charAt(x) != '6' && word2.charAt(x) != '7' && word2.charAt(x) != '8' && word2.charAt(x) != '9') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('1', guess1i);
                word2 = word2.replace('2', guess2i);
                word2 = word2.replace('3', guess3i);
                word2 = word2.replace('4', guess4i);
                word2 = word2.replace('5', guess5i);
                word2 = word2.replace('6', guess6i);
                word2 = word2.replace('7', guess7i);
                word2 = word2.replace('8', guess8i);
                word2 = word2.replace('9', guess9i);
            }
            //if the guess was incorrect;
            if (!(word.contains(guess9))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);


        //if the word still has blanks, let them guess a letter
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess10 = input.nextLine();
            //turning the inputed letter to lowercase
            guess10 = guess10.toLowerCase();
            //putting the letter into a character form-instead of string
            guess10i = guess10.charAt(0);

            //if the letter guessed was correct
            if (word.contains(guess10)) {
                word2 = word;
                //replace the guess with temp variables
                word2 = word2.replace(guess10i, '!');
                word2 = word2.replace(guess9i, '9');
                word2 = word2.replace(guess8i, '8');
                word2 = word2.replace(guess7i, '7');
                word2 = word2.replace(guess6i, '6');
                word2 = word2.replace(guess5i, '5');
                word2 = word2.replace(guess4i, '4');
                word2 = word2.replace(guess3i, '3');
                word2 = word2.replace(guess2i, '2');
                word2 = word2.replace(guess1i, '1');

                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '1' && word2.charAt(x) != '2' && word2.charAt(x) != '3' && word2.charAt(x) != '4' && word2.charAt(x) != '5' && word2.charAt(x) != '6' && word2.charAt(x) != '7' && word2.charAt(x) != '8' && word2.charAt(x) != '9' && word2.charAt(x) != '!') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('1', guess1i);
                word2 = word2.replace('2', guess2i);
                word2 = word2.replace('3', guess3i);
                word2 = word2.replace('4', guess4i);
                word2 = word2.replace('5', guess5i);
                word2 = word2.replace('6', guess6i);
                word2 = word2.replace('7', guess7i);
                word2 = word2.replace('8', guess8i);
                word2 = word2.replace('9', guess9i);
                word2 = word2.replace('!', guess10i);
            }
            //if the guess was incorrect;
            if (!(word.contains(guess10))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);


        //if the word still has blanks, let them guess a letter
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess11 = input.nextLine();
            //turning the inputed letter to lowercase
            guess11 = guess11.toLowerCase();
            //putting the letter into a character form-instead of string
            guess11i = guess11.charAt(0);

            //if the letter guessed was correct
            if (word.contains(guess11)) {
                word2 = word;
                //replace the guess with temp variables
                word2 = word2.replace(guess11i, '@');
                word2 = word2.replace(guess10i, '!');
                word2 = word2.replace(guess9i, '9');
                word2 = word2.replace(guess8i, '8');
                word2 = word2.replace(guess7i, '7');
                word2 = word2.replace(guess6i, '6');
                word2 = word2.replace(guess5i, '5');
                word2 = word2.replace(guess4i, '4');
                word2 = word2.replace(guess3i, '3');
                word2 = word2.replace(guess2i, '2');
                word2 = word2.replace(guess1i, '1');

                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '1' && word2.charAt(x) != '2' && word2.charAt(x) != '3' && word2.charAt(x) != '4' && word2.charAt(x) != '5' && word2.charAt(x) != '6' && word2.charAt(x) != '7' && word2.charAt(x) != '8' && word2.charAt(x) != '9' && word2.charAt(x) != '!' && word2.charAt(x) != '@') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('1', guess1i);
                word2 = word2.replace('2', guess2i);
                word2 = word2.replace('3', guess3i);
                word2 = word2.replace('4', guess4i);
                word2 = word2.replace('5', guess5i);
                word2 = word2.replace('6', guess6i);
                word2 = word2.replace('7', guess7i);
                word2 = word2.replace('8', guess8i);
                word2 = word2.replace('9', guess9i);
                word2 = word2.replace('!', guess10i);
                word2 = word2.replace('@', guess11i);
            }
            //if the guess was incorrect;
            if (!(word.contains(guess11))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);


        //if the word still has blanks, let them guess a letter
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess12 = input.nextLine();
            //turning the inputed letter to lowercase
            guess12 = guess12.toLowerCase();
            //putting the letter into a character form-instead of string
            guess12i = guess12.charAt(0);

            //if the letter guessed was correct
            if (word.contains(guess12)) {
                word2 = word;
                //replace the guess with temp variables
                word2 = word2.replace(guess12i, '#');
                word2 = word2.replace(guess11i, '@');
                word2 = word2.replace(guess10i, '!');
                word2 = word2.replace(guess9i, '9');
                word2 = word2.replace(guess8i, '8');
                word2 = word2.replace(guess7i, '7');
                word2 = word2.replace(guess6i, '6');
                word2 = word2.replace(guess5i, '5');
                word2 = word2.replace(guess4i, '4');
                word2 = word2.replace(guess3i, '3');
                word2 = word2.replace(guess2i, '2');
                word2 = word2.replace(guess1i, '1');

                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '1' && word2.charAt(x) != '2' && word2.charAt(x) != '3' && word2.charAt(x) != '4' && word2.charAt(x) != '5' && word2.charAt(x) != '6' && word2.charAt(x) != '7' && word2.charAt(x) != '8' && word2.charAt(x) != '9' && word2.charAt(x) != '!' && word2.charAt(x) != '@' && word2.charAt(x) != '#') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('1', guess1i);
                word2 = word2.replace('2', guess2i);
                word2 = word2.replace('3', guess3i);
                word2 = word2.replace('4', guess4i);
                word2 = word2.replace('5', guess5i);
                word2 = word2.replace('6', guess6i);
                word2 = word2.replace('7', guess7i);
                word2 = word2.replace('8', guess8i);
                word2 = word2.replace('9', guess9i);
                word2 = word2.replace('!', guess10i);
                word2 = word2.replace('@', guess11i);
                word2 = word2.replace('#', guess12i);
            }
            //if the guess was incorrect;
            if (!(word.contains(guess12))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);


        //if the word still has blanks, let them guess a letter
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess13 = input.nextLine();
            //turning the inputed letter to lowercase
            guess13 = guess13.toLowerCase();
            //putting the letter into a character form-instead of string
            guess13i = guess13.charAt(0);

            //if the letter guessed was correct
            if (word.contains(guess13)) {
                word2 = word;
                //replace the guess with temp variables
                word2 = word2.replace(guess13i, '$');
                word2 = word2.replace(guess12i, '#');
                word2 = word2.replace(guess11i, '@');
                word2 = word2.replace(guess10i, '!');
                word2 = word2.replace(guess9i, '9');
                word2 = word2.replace(guess8i, '8');
                word2 = word2.replace(guess7i, '7');
                word2 = word2.replace(guess6i, '6');
                word2 = word2.replace(guess5i, '5');
                word2 = word2.replace(guess4i, '4');
                word2 = word2.replace(guess3i, '3');
                word2 = word2.replace(guess2i, '2');
                word2 = word2.replace(guess1i, '1');

                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '1' && word2.charAt(x) != '2' && word2.charAt(x) != '3' && word2.charAt(x) != '4' && word2.charAt(x) != '5' && word2.charAt(x) != '6' && word2.charAt(x) != '7' && word2.charAt(x) != '8' && word2.charAt(x) != '9' && word2.charAt(x) != '!' && word2.charAt(x) != '@' && word2.charAt(x) != '#' && word2.charAt(x) != '$') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('1', guess1i);
                word2 = word2.replace('2', guess2i);
                word2 = word2.replace('3', guess3i);
                word2 = word2.replace('4', guess4i);
                word2 = word2.replace('5', guess5i);
                word2 = word2.replace('6', guess6i);
                word2 = word2.replace('7', guess7i);
                word2 = word2.replace('8', guess8i);
                word2 = word2.replace('9', guess9i);
                word2 = word2.replace('!', guess10i);
                word2 = word2.replace('@', guess11i);
                word2 = word2.replace('#', guess12i);
                word2 = word2.replace('$', guess13i);
            }
            //if the guess was incorrect;
            if (!(word.contains(guess13))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);


        //if the word still has blanks, let them guess a letter
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess14 = input.nextLine();
            //turning the inputed letter to lowercase
            guess14 = guess14.toLowerCase();
            //putting the letter into a character form-instead of string
            guess14i = guess14.charAt(0);

            //if the letter guessed was correct
            if (word.contains(guess14)) {
                word2 = word;
                //replace the guess with temp variables
                word2 = word2.replace(guess14i, '%');
                word2 = word2.replace(guess13i, '$');
                word2 = word2.replace(guess12i, '#');
                word2 = word2.replace(guess11i, '@');
                word2 = word2.replace(guess10i, '!');
                word2 = word2.replace(guess9i, '9');
                word2 = word2.replace(guess8i, '8');
                word2 = word2.replace(guess7i, '7');
                word2 = word2.replace(guess6i, '6');
                word2 = word2.replace(guess5i, '5');
                word2 = word2.replace(guess4i, '4');
                word2 = word2.replace(guess3i, '3');
                word2 = word2.replace(guess2i, '2');
                word2 = word2.replace(guess1i, '1');

                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '1' && word2.charAt(x) != '2' && word2.charAt(x) != '3' && word2.charAt(x) != '4' && word2.charAt(x) != '5' && word2.charAt(x) != '6' && word2.charAt(x) != '7' && word2.charAt(x) != '8' && word2.charAt(x) != '9' && word2.charAt(x) != '!' && word2.charAt(x) != '@' && word2.charAt(x) != '#' && word2.charAt(x) != '$' && word2.charAt(x) != '%') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('1', guess1i);
                word2 = word2.replace('2', guess2i);
                word2 = word2.replace('3', guess3i);
                word2 = word2.replace('4', guess4i);
                word2 = word2.replace('5', guess5i);
                word2 = word2.replace('6', guess6i);
                word2 = word2.replace('7', guess7i);
                word2 = word2.replace('8', guess8i);
                word2 = word2.replace('9', guess9i);
                word2 = word2.replace('!', guess10i);
                word2 = word2.replace('@', guess11i);
                word2 = word2.replace('#', guess12i);
                word2 = word2.replace('$', guess13i);
                word2 = word2.replace('%', guess14i);
            }
            //if the guess was incorrect;
            if (!(word.contains(guess14))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);


        //if the word still has blanks, let them guess a letter
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess15 = input.nextLine();
            //turning the inputed letter to lowercase
            guess15 = guess15.toLowerCase();
            //putting the letter into a character form-instead of string
            guess15i = guess15.charAt(0);

            //if the letter guessed was correct
            if (word.contains(guess15)) {
                word2 = word;
                //replace the guess with temp variables
                word2 = word2.replace(guess15i, '^');
                word2 = word2.replace(guess14i, '%');
                word2 = word2.replace(guess13i, '$');
                word2 = word2.replace(guess12i, '#');
                word2 = word2.replace(guess11i, '@');
                word2 = word2.replace(guess10i, '!');
                word2 = word2.replace(guess9i, '9');
                word2 = word2.replace(guess8i, '8');
                word2 = word2.replace(guess7i, '7');
                word2 = word2.replace(guess6i, '6');
                word2 = word2.replace(guess5i, '5');
                word2 = word2.replace(guess4i, '4');
                word2 = word2.replace(guess3i, '3');
                word2 = word2.replace(guess2i, '2');
                word2 = word2.replace(guess1i, '1');

                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '1' && word2.charAt(x) != '2' && word2.charAt(x) != '3' && word2.charAt(x) != '4' && word2.charAt(x) != '5' && word2.charAt(x) != '6' && word2.charAt(x) != '7' && word2.charAt(x) != '8' && word2.charAt(x) != '9' && word2.charAt(x) != '!' && word2.charAt(x) != '@' && word2.charAt(x) != '#' && word2.charAt(x) != '$' && word2.charAt(x) != '%' && word2.charAt(x) != '^') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('1', guess1i);
                word2 = word2.replace('2', guess2i);
                word2 = word2.replace('3', guess3i);
                word2 = word2.replace('4', guess4i);
                word2 = word2.replace('5', guess5i);
                word2 = word2.replace('6', guess6i);
                word2 = word2.replace('7', guess7i);
                word2 = word2.replace('8', guess8i);
                word2 = word2.replace('9', guess9i);
                word2 = word2.replace('!', guess10i);
                word2 = word2.replace('@', guess11i);
                word2 = word2.replace('#', guess12i);
                word2 = word2.replace('$', guess13i);
                word2 = word2.replace('%', guess14i);
                word2 = word2.replace('^', guess15i);
            }
            //if the guess was incorrect;
            if (!(word.contains(guess15))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);


        //if the word still has blanks, let them guess a letter
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess16 = input.nextLine();
            //turning the inputed letter to lowercase
            guess16 = guess16.toLowerCase();
            //putting the letter into a character form-instead of string
            guess16i = guess16.charAt(0);

            //if the letter guessed was correct
            if (word.contains(guess16)) {
                word2 = word;
                //replace the guess with temp variables
                word2 = word2.replace(guess16i, '&');
                word2 = word2.replace(guess15i, '^');
                word2 = word2.replace(guess14i, '%');
                word2 = word2.replace(guess13i, '$');
                word2 = word2.replace(guess12i, '#');
                word2 = word2.replace(guess11i, '@');
                word2 = word2.replace(guess10i, '!');
                word2 = word2.replace(guess9i, '9');
                word2 = word2.replace(guess8i, '8');
                word2 = word2.replace(guess7i, '7');
                word2 = word2.replace(guess6i, '6');
                word2 = word2.replace(guess5i, '5');
                word2 = word2.replace(guess4i, '4');
                word2 = word2.replace(guess3i, '3');
                word2 = word2.replace(guess2i, '2');
                word2 = word2.replace(guess1i, '1');

                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '1' && word2.charAt(x) != '2' && word2.charAt(x) != '3' && word2.charAt(x) != '4' && word2.charAt(x) != '5' && word2.charAt(x) != '6' && word2.charAt(x) != '7' && word2.charAt(x) != '8' && word2.charAt(x) != '9' && word2.charAt(x) != '!' && word2.charAt(x) != '@' && word2.charAt(x) != '#' && word2.charAt(x) != '$' && word2.charAt(x) != '%' && word2.charAt(x) != '^' && word2.charAt(x) != '&') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('1', guess1i);
                word2 = word2.replace('2', guess2i);
                word2 = word2.replace('3', guess3i);
                word2 = word2.replace('4', guess4i);
                word2 = word2.replace('5', guess5i);
                word2 = word2.replace('6', guess6i);
                word2 = word2.replace('7', guess7i);
                word2 = word2.replace('8', guess8i);
                word2 = word2.replace('9', guess9i);
                word2 = word2.replace('!', guess10i);
                word2 = word2.replace('@', guess11i);
                word2 = word2.replace('#', guess12i);
                word2 = word2.replace('$', guess13i);
                word2 = word2.replace('%', guess14i);
                word2 = word2.replace('^', guess15i);
                word2 = word2.replace('&', guess16i);
            }
            //if the guess was incorrect;
            if (!(word.contains(guess16))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);


        //if the word still has blanks, let them guess a letter
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess17 = input.nextLine();
            //turning the inputed letter to lowercase
            guess17 = guess17.toLowerCase();
            //putting the letter into a character form-instead of string
            guess17i = guess17.charAt(0);

            //if the letter guessed was correct
            if (word.contains(guess17)) {
                word2 = word;
                //replace the guess with temp variables
                word2 = word2.replace(guess17i, '*');
                word2 = word2.replace(guess16i, '&');
                word2 = word2.replace(guess15i, '^');
                word2 = word2.replace(guess14i, '%');
                word2 = word2.replace(guess13i, '$');
                word2 = word2.replace(guess12i, '#');
                word2 = word2.replace(guess11i, '@');
                word2 = word2.replace(guess10i, '!');
                word2 = word2.replace(guess9i, '9');
                word2 = word2.replace(guess8i, '8');
                word2 = word2.replace(guess7i, '7');
                word2 = word2.replace(guess6i, '6');
                word2 = word2.replace(guess5i, '5');
                word2 = word2.replace(guess4i, '4');
                word2 = word2.replace(guess3i, '3');
                word2 = word2.replace(guess2i, '2');
                word2 = word2.replace(guess1i, '1');

                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '1' && word2.charAt(x) != '2' && word2.charAt(x) != '3' && word2.charAt(x) != '4' && word2.charAt(x) != '5' && word2.charAt(x) != '6' && word2.charAt(x) != '7' && word2.charAt(x) != '8' && word2.charAt(x) != '9' && word2.charAt(x) != '!' && word2.charAt(x) != '@' && word2.charAt(x) != '#' && word2.charAt(x) != '$' && word2.charAt(x) != '%' && word2.charAt(x) != '^' && word2.charAt(x) != '&' && word2.charAt(x) != '*') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('1', guess1i);
                word2 = word2.replace('2', guess2i);
                word2 = word2.replace('3', guess3i);
                word2 = word2.replace('4', guess4i);
                word2 = word2.replace('5', guess5i);
                word2 = word2.replace('6', guess6i);
                word2 = word2.replace('7', guess7i);
                word2 = word2.replace('8', guess8i);
                word2 = word2.replace('9', guess9i);
                word2 = word2.replace('!', guess10i);
                word2 = word2.replace('@', guess11i);
                word2 = word2.replace('#', guess12i);
                word2 = word2.replace('$', guess13i);
                word2 = word2.replace('%', guess14i);
                word2 = word2.replace('^', guess15i);
                word2 = word2.replace('%', guess16i);
                word2 = word2.replace('*', guess17i);
            }
            //if the guess was incorrect;
            if (!(word.contains(guess17))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);


        //if the word still has blanks, let them guess a letter
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess18 = input.nextLine();
            //turning the inputed letter to lowercase
            guess18 = guess18.toLowerCase();
            //putting the letter into a character form-instead of string
            guess18i = guess18.charAt(0);

            //if the letter guessed was correct
            if (word.contains(guess18)) {
                word2 = word;
                //replace the guess with temp variables
                word2 = word2.replace(guess18i, '_');
                word2 = word2.replace(guess17i, '*');
                word2 = word2.replace(guess16i, '&');
                word2 = word2.replace(guess15i, '^');
                word2 = word2.replace(guess14i, '%');
                word2 = word2.replace(guess13i, '$');
                word2 = word2.replace(guess12i, '#');
                word2 = word2.replace(guess11i, '@');
                word2 = word2.replace(guess10i, '!');
                word2 = word2.replace(guess9i, '9');
                word2 = word2.replace(guess8i, '8');
                word2 = word2.replace(guess7i, '7');
                word2 = word2.replace(guess6i, '6');
                word2 = word2.replace(guess5i, '5');
                word2 = word2.replace(guess4i, '4');
                word2 = word2.replace(guess3i, '3');
                word2 = word2.replace(guess2i, '2');
                word2 = word2.replace(guess1i, '1');

                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '1' && word2.charAt(x) != '2' && word2.charAt(x) != '3' && word2.charAt(x) != '4' && word2.charAt(x) != '5' && word2.charAt(x) != '6' && word2.charAt(x) != '7' && word2.charAt(x) != '8' && word2.charAt(x) != '9' && word2.charAt(x) != '!' && word2.charAt(x) != '@' && word2.charAt(x) != '#' && word2.charAt(x) != '$' && word2.charAt(x) != '%' && word2.charAt(x) != '^' && word2.charAt(x) != '&' && word2.charAt(x) != '*' && word2.charAt(x) != '_') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('1', guess1i);
                word2 = word2.replace('2', guess2i);
                word2 = word2.replace('3', guess3i);
                word2 = word2.replace('4', guess4i);
                word2 = word2.replace('5', guess5i);
                word2 = word2.replace('6', guess6i);
                word2 = word2.replace('7', guess7i);
                word2 = word2.replace('8', guess8i);
                word2 = word2.replace('9', guess9i);
                word2 = word2.replace('!', guess10i);
                word2 = word2.replace('@', guess11i);
                word2 = word2.replace('#', guess12i);
                word2 = word2.replace('$', guess13i);
                word2 = word2.replace('%', guess14i);
                word2 = word2.replace('^', guess15i);
                word2 = word2.replace('%', guess16i);
                word2 = word2.replace('*', guess17i);
                word2 = word2.replace('_', guess18i);
            }
            //if the guess was incorrect;
            if (!(word.contains(guess18))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);


        //if the word still has blanks, let them guess a letter
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess19 = input.nextLine();
            //turning the inputed letter to lowercase
            guess19 = guess19.toLowerCase();
            //putting the letter into a character form-instead of string
            guess19i = guess19.charAt(0);

            //if the letter guessed was correct
            if (word.contains(guess19)) {
                word2 = word;
                //replace the guess with temp variables
                word2 = word2.replace(guess19i, '=');
                word2 = word2.replace(guess18i, '_');
                word2 = word2.replace(guess17i, '*');
                word2 = word2.replace(guess16i, '&');
                word2 = word2.replace(guess15i, '^');
                word2 = word2.replace(guess14i, '%');
                word2 = word2.replace(guess13i, '$');
                word2 = word2.replace(guess12i, '#');
                word2 = word2.replace(guess11i, '@');
                word2 = word2.replace(guess10i, '!');
                word2 = word2.replace(guess9i, '9');
                word2 = word2.replace(guess8i, '8');
                word2 = word2.replace(guess7i, '7');
                word2 = word2.replace(guess6i, '6');
                word2 = word2.replace(guess5i, '5');
                word2 = word2.replace(guess4i, '4');
                word2 = word2.replace(guess3i, '3');
                word2 = word2.replace(guess2i, '2');
                word2 = word2.replace(guess1i, '1');

                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '1' && word2.charAt(x) != '2' && word2.charAt(x) != '3' && word2.charAt(x) != '4' && word2.charAt(x) != '5' && word2.charAt(x) != '6' && word2.charAt(x) != '7' && word2.charAt(x) != '8' && word2.charAt(x) != '9' && word2.charAt(x) != '!' && word2.charAt(x) != '@' && word2.charAt(x) != '#' && word2.charAt(x) != '$' && word2.charAt(x) != '%' && word2.charAt(x) != '^' && word2.charAt(x) != '&' && word2.charAt(x) != '*' && word2.charAt(x) != '_' && word2.charAt(x) != '=') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('1', guess1i);
                word2 = word2.replace('2', guess2i);
                word2 = word2.replace('3', guess3i);
                word2 = word2.replace('4', guess4i);
                word2 = word2.replace('5', guess5i);
                word2 = word2.replace('6', guess6i);
                word2 = word2.replace('7', guess7i);
                word2 = word2.replace('8', guess8i);
                word2 = word2.replace('9', guess9i);
                word2 = word2.replace('!', guess10i);
                word2 = word2.replace('@', guess11i);
                word2 = word2.replace('#', guess12i);
                word2 = word2.replace('$', guess13i);
                word2 = word2.replace('%', guess14i);
                word2 = word2.replace('^', guess15i);
                word2 = word2.replace('%', guess16i);
                word2 = word2.replace('*', guess17i);
                word2 = word2.replace('_', guess18i);
                word2 = word2.replace('=', guess19i);
            }
            //if the guess was incorrect;
            if (!(word.contains(guess19))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);


        //if the word still has blanks, let them guess a letter
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess20 = input.nextLine();
            //turning the inputed letter to lowercase
            guess20 = guess20.toLowerCase();
            //putting the letter into a character form-instead of string
            guess20i = guess20.charAt(0);

            //if the letter guessed was correct
            if (word.contains(guess20)) {
                word2 = word;
                //replace the guess with temp variables
                word2 = word2.replace(guess20i, '+');
                word2 = word2.replace(guess19i, '=');
                word2 = word2.replace(guess18i, '_');
                word2 = word2.replace(guess17i, '*');
                word2 = word2.replace(guess16i, '&');
                word2 = word2.replace(guess15i, '^');
                word2 = word2.replace(guess14i, '%');
                word2 = word2.replace(guess13i, '$');
                word2 = word2.replace(guess12i, '#');
                word2 = word2.replace(guess11i, '@');
                word2 = word2.replace(guess10i, '!');
                word2 = word2.replace(guess9i, '9');
                word2 = word2.replace(guess8i, '8');
                word2 = word2.replace(guess7i, '7');
                word2 = word2.replace(guess6i, '6');
                word2 = word2.replace(guess5i, '5');
                word2 = word2.replace(guess4i, '4');
                word2 = word2.replace(guess3i, '3');
                word2 = word2.replace(guess2i, '2');
                word2 = word2.replace(guess1i, '1');

                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '1' && word2.charAt(x) != '2' && word2.charAt(x) != '3' && word2.charAt(x) != '4' && word2.charAt(x) != '5' && word2.charAt(x) != '6' && word2.charAt(x) != '7' && word2.charAt(x) != '8' && word2.charAt(x) != '9' && word2.charAt(x) != '!' && word2.charAt(x) != '@' && word2.charAt(x) != '#' && word2.charAt(x) != '$' && word2.charAt(x) != '%' && word2.charAt(x) != '^' && word2.charAt(x) != '&' && word2.charAt(x) != '*' && word2.charAt(x) != '_' && word2.charAt(x) != '=' && word2.charAt(x) != '+') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('1', guess1i);
                word2 = word2.replace('2', guess2i);
                word2 = word2.replace('3', guess3i);
                word2 = word2.replace('4', guess4i);
                word2 = word2.replace('5', guess5i);
                word2 = word2.replace('6', guess6i);
                word2 = word2.replace('7', guess7i);
                word2 = word2.replace('8', guess8i);
                word2 = word2.replace('9', guess9i);
                word2 = word2.replace('!', guess10i);
                word2 = word2.replace('@', guess11i);
                word2 = word2.replace('#', guess12i);
                word2 = word2.replace('$', guess13i);
                word2 = word2.replace('%', guess14i);
                word2 = word2.replace('^', guess15i);
                word2 = word2.replace('%', guess16i);
                word2 = word2.replace('*', guess17i);
                word2 = word2.replace('_', guess18i);
                word2 = word2.replace('=', guess19i);
                word2 = word2.replace('+', guess20i);
            }
            //if the guess was incorrect;
            if (!(word.contains(guess20))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);


        //if the word still has blanks, let them guess a letter
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess21 = input.nextLine();
            //turning the inputed letter to lowercase
            guess21 = guess21.toLowerCase();
            //putting the letter into a character form-instead of string
            guess21i = guess21.charAt(0);

            //if the letter guessed was correct
            if (word.contains(guess21)) {
                word2 = word;
                //replace the guess with temp variables
                word2 = word2.replace(guess21i, '0');
                word2 = word2.replace(guess20i, '+');
                word2 = word2.replace(guess19i, '=');
                word2 = word2.replace(guess18i, '_');
                word2 = word2.replace(guess17i, '*');
                word2 = word2.replace(guess16i, '&');
                word2 = word2.replace(guess15i, '^');
                word2 = word2.replace(guess14i, '%');
                word2 = word2.replace(guess13i, '$');
                word2 = word2.replace(guess12i, '#');
                word2 = word2.replace(guess11i, '@');
                word2 = word2.replace(guess10i, '!');
                word2 = word2.replace(guess9i, '9');
                word2 = word2.replace(guess8i, '8');
                word2 = word2.replace(guess7i, '7');
                word2 = word2.replace(guess6i, '6');
                word2 = word2.replace(guess5i, '5');
                word2 = word2.replace(guess4i, '4');
                word2 = word2.replace(guess3i, '3');
                word2 = word2.replace(guess2i, '2');
                word2 = word2.replace(guess1i, '1');

                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '1' && word2.charAt(x) != '2' && word2.charAt(x) != '3' && word2.charAt(x) != '4' && word2.charAt(x) != '5' && word2.charAt(x) != '6' && word2.charAt(x) != '7' && word2.charAt(x) != '8' && word2.charAt(x) != '9' && word2.charAt(x) != '!' && word2.charAt(x) != '@' && word2.charAt(x) != '#' && word2.charAt(x) != '$' && word2.charAt(x) != '%' && word2.charAt(x) != '^' && word2.charAt(x) != '&' && word2.charAt(x) != '*' && word2.charAt(x) != '_' && word2.charAt(x) != '=' && word2.charAt(x) != '+' && word2.charAt(x) != '0') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('1', guess1i);
                word2 = word2.replace('2', guess2i);
                word2 = word2.replace('3', guess3i);
                word2 = word2.replace('4', guess4i);
                word2 = word2.replace('5', guess5i);
                word2 = word2.replace('6', guess6i);
                word2 = word2.replace('7', guess7i);
                word2 = word2.replace('8', guess8i);
                word2 = word2.replace('9', guess9i);
                word2 = word2.replace('!', guess10i);
                word2 = word2.replace('@', guess11i);
                word2 = word2.replace('#', guess12i);
                word2 = word2.replace('$', guess13i);
                word2 = word2.replace('%', guess14i);
                word2 = word2.replace('^', guess15i);
                word2 = word2.replace('%', guess16i);
                word2 = word2.replace('*', guess17i);
                word2 = word2.replace('_', guess18i);
                word2 = word2.replace('=', guess19i);
                word2 = word2.replace('+', guess20i);
                word2 = word2.replace('0', guess21i);
            }
            //if the guess was incorrect;
            if (!(word.contains(guess21))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);


        //if the word still has blanks, let them guess a letter
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess22 = input.nextLine();
            //turning the inputed letter to lowercase
            guess22 = guess22.toLowerCase();
            //putting the letter into a character form-instead of string
            guess22i = guess22.charAt(0);

            //if the letter guessed was correct
            if (word.contains(guess22)) {
                word2 = word;
                //replace the guess with temp variables
                word2 = word2.replace(guess22i, '/');
                word2 = word2.replace(guess21i, '0');
                word2 = word2.replace(guess20i, '+');
                word2 = word2.replace(guess19i, '=');
                word2 = word2.replace(guess18i, '_');
                word2 = word2.replace(guess17i, '*');
                word2 = word2.replace(guess16i, '&');
                word2 = word2.replace(guess15i, '^');
                word2 = word2.replace(guess14i, '%');
                word2 = word2.replace(guess13i, '$');
                word2 = word2.replace(guess12i, '#');
                word2 = word2.replace(guess11i, '@');
                word2 = word2.replace(guess10i, '!');
                word2 = word2.replace(guess9i, '9');
                word2 = word2.replace(guess8i, '8');
                word2 = word2.replace(guess7i, '7');
                word2 = word2.replace(guess6i, '6');
                word2 = word2.replace(guess5i, '5');
                word2 = word2.replace(guess4i, '4');
                word2 = word2.replace(guess3i, '3');
                word2 = word2.replace(guess2i, '2');
                word2 = word2.replace(guess1i, '1');

                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '1' && word2.charAt(x) != '2' && word2.charAt(x) != '3' && word2.charAt(x) != '4' && word2.charAt(x) != '5' && word2.charAt(x) != '6' && word2.charAt(x) != '7' && word2.charAt(x) != '8' && word2.charAt(x) != '9' && word2.charAt(x) != '!' && word2.charAt(x) != '@' && word2.charAt(x) != '#' && word2.charAt(x) != '$' && word2.charAt(x) != '%' && word2.charAt(x) != '^' && word2.charAt(x) != '&' && word2.charAt(x) != '*' && word2.charAt(x) != '_' && word2.charAt(x) != '=' && word2.charAt(x) != '+' && word2.charAt(x) != '0' && word2.charAt(x) != '/') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('1', guess1i);
                word2 = word2.replace('2', guess2i);
                word2 = word2.replace('3', guess3i);
                word2 = word2.replace('4', guess4i);
                word2 = word2.replace('5', guess5i);
                word2 = word2.replace('6', guess6i);
                word2 = word2.replace('7', guess7i);
                word2 = word2.replace('8', guess8i);
                word2 = word2.replace('9', guess9i);
                word2 = word2.replace('!', guess10i);
                word2 = word2.replace('@', guess11i);
                word2 = word2.replace('#', guess12i);
                word2 = word2.replace('$', guess13i);
                word2 = word2.replace('%', guess14i);
                word2 = word2.replace('^', guess15i);
                word2 = word2.replace('%', guess16i);
                word2 = word2.replace('*', guess17i);
                word2 = word2.replace('_', guess18i);
                word2 = word2.replace('=', guess19i);
                word2 = word2.replace('+', guess20i);
                word2 = word2.replace('0', guess21i);
                word2 = word2.replace('/', guess22i);
            }
            //if the guess was incorrect;
            if (!(word.contains(guess22))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);


        //if the word still has blanks, let them guess a letter
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess23 = input.nextLine();
            //turning the inputed letter to lowercase
            guess23 = guess23.toLowerCase();
            //putting the letter into a character form-instead of string
            guess23i = guess23.charAt(0);

            //if the letter guessed was correct
            if (word.contains(guess23)) {
                word2 = word;
                //replace the guess with temp variables
                word2 = word2.replace(guess23i, '?');
                word2 = word2.replace(guess22i, '/');
                word2 = word2.replace(guess21i, '0');
                word2 = word2.replace(guess20i, '+');
                word2 = word2.replace(guess19i, '=');
                word2 = word2.replace(guess18i, '_');
                word2 = word2.replace(guess17i, '*');
                word2 = word2.replace(guess16i, '&');
                word2 = word2.replace(guess15i, '^');
                word2 = word2.replace(guess14i, '%');
                word2 = word2.replace(guess13i, '$');
                word2 = word2.replace(guess12i, '#');
                word2 = word2.replace(guess11i, '@');
                word2 = word2.replace(guess10i, '!');
                word2 = word2.replace(guess9i, '9');
                word2 = word2.replace(guess8i, '8');
                word2 = word2.replace(guess7i, '7');
                word2 = word2.replace(guess6i, '6');
                word2 = word2.replace(guess5i, '5');
                word2 = word2.replace(guess4i, '4');
                word2 = word2.replace(guess3i, '3');
                word2 = word2.replace(guess2i, '2');
                word2 = word2.replace(guess1i, '1');

                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '1' && word2.charAt(x) != '2' && word2.charAt(x) != '3' && word2.charAt(x) != '4' && word2.charAt(x) != '5' && word2.charAt(x) != '6' && word2.charAt(x) != '7' && word2.charAt(x) != '8' && word2.charAt(x) != '9' && word2.charAt(x) != '!' && word2.charAt(x) != '@' && word2.charAt(x) != '#' && word2.charAt(x) != '$' && word2.charAt(x) != '%' && word2.charAt(x) != '^' && word2.charAt(x) != '&' && word2.charAt(x) != '*' && word2.charAt(x) != '_' && word2.charAt(x) != '=' && word2.charAt(x) != '+' && word2.charAt(x) != '0' && word2.charAt(x) != '/' && word2.charAt(x) != '?') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('1', guess1i);
                word2 = word2.replace('2', guess2i);
                word2 = word2.replace('3', guess3i);
                word2 = word2.replace('4', guess4i);
                word2 = word2.replace('5', guess5i);
                word2 = word2.replace('6', guess6i);
                word2 = word2.replace('7', guess7i);
                word2 = word2.replace('8', guess8i);
                word2 = word2.replace('9', guess9i);
                word2 = word2.replace('!', guess10i);
                word2 = word2.replace('@', guess11i);
                word2 = word2.replace('#', guess12i);
                word2 = word2.replace('$', guess13i);
                word2 = word2.replace('%', guess14i);
                word2 = word2.replace('^', guess15i);
                word2 = word2.replace('%', guess16i);
                word2 = word2.replace('*', guess17i);
                word2 = word2.replace('_', guess18i);
                word2 = word2.replace('=', guess19i);
                word2 = word2.replace('+', guess20i);
                word2 = word2.replace('0', guess21i);
                word2 = word2.replace('/', guess22i);
                word2 = word2.replace('?', guess23i);
            }
            //if the guess was incorrect;
            if (!(word.contains(guess23))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);


        //if the word still has blanks, let them guess a letter
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess24 = input.nextLine();
            //turning the inputed letter to lowercase
            guess24 = guess24.toLowerCase();
            //putting the letter into a character form-instead of string
            guess24i = guess24.charAt(0);

            //if the letter guessed was correct
            if (word.contains(guess24)) {
                word2 = word;
                //replace the guess with temp variables
                word2 = word2.replace(guess24i, '<');
                word2 = word2.replace(guess23i, '?');
                word2 = word2.replace(guess22i, '/');
                word2 = word2.replace(guess21i, '0');
                word2 = word2.replace(guess20i, '+');
                word2 = word2.replace(guess19i, '=');
                word2 = word2.replace(guess18i, '_');
                word2 = word2.replace(guess17i, '*');
                word2 = word2.replace(guess16i, '&');
                word2 = word2.replace(guess15i, '^');
                word2 = word2.replace(guess14i, '%');
                word2 = word2.replace(guess13i, '$');
                word2 = word2.replace(guess12i, '#');
                word2 = word2.replace(guess11i, '@');
                word2 = word2.replace(guess10i, '!');
                word2 = word2.replace(guess9i, '9');
                word2 = word2.replace(guess8i, '8');
                word2 = word2.replace(guess7i, '7');
                word2 = word2.replace(guess6i, '6');
                word2 = word2.replace(guess5i, '5');
                word2 = word2.replace(guess4i, '4');
                word2 = word2.replace(guess3i, '3');
                word2 = word2.replace(guess2i, '2');
                word2 = word2.replace(guess1i, '1');

                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '1' && word2.charAt(x) != '2' && word2.charAt(x) != '3' && word2.charAt(x) != '4' && word2.charAt(x) != '5' && word2.charAt(x) != '6' && word2.charAt(x) != '7' && word2.charAt(x) != '8' && word2.charAt(x) != '9' && word2.charAt(x) != '!' && word2.charAt(x) != '@' && word2.charAt(x) != '#' && word2.charAt(x) != '$' && word2.charAt(x) != '%' && word2.charAt(x) != '^' && word2.charAt(x) != '&' && word2.charAt(x) != '*' && word2.charAt(x) != '_' && word2.charAt(x) != '=' && word2.charAt(x) != '+' && word2.charAt(x) != '0' && word2.charAt(x) != '/' && word2.charAt(x) != '?' && word2.charAt(x) != '<') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('1', guess1i);
                word2 = word2.replace('2', guess2i);
                word2 = word2.replace('3', guess3i);
                word2 = word2.replace('4', guess4i);
                word2 = word2.replace('5', guess5i);
                word2 = word2.replace('6', guess6i);
                word2 = word2.replace('7', guess7i);
                word2 = word2.replace('8', guess8i);
                word2 = word2.replace('9', guess9i);
                word2 = word2.replace('!', guess10i);
                word2 = word2.replace('@', guess11i);
                word2 = word2.replace('#', guess12i);
                word2 = word2.replace('$', guess13i);
                word2 = word2.replace('%', guess14i);
                word2 = word2.replace('^', guess15i);
                word2 = word2.replace('%', guess16i);
                word2 = word2.replace('*', guess17i);
                word2 = word2.replace('_', guess18i);
                word2 = word2.replace('=', guess19i);
                word2 = word2.replace('+', guess20i);
                word2 = word2.replace('0', guess21i);
                word2 = word2.replace('/', guess22i);
                word2 = word2.replace('?', guess23i);
                word2 = word2.replace('<', guess24i);
            }
            //if the guess was incorrect;
            if (!(word.contains(guess24))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);


        //if the word still has blanks, let them guess a letter
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess25 = input.nextLine();
            //turning the inputed letter to lowercase
            guess25 = guess25.toLowerCase();
            //putting the letter into a character form-instead of string
            guess25i = guess25.charAt(0);

            //if the letter guessed was correct
            if (word.contains(guess25)) {
                word2 = word;
                //replace the guess with temp variables
                word2 = word2.replace(guess25i, '>');
                word2 = word2.replace(guess24i, '<');
                word2 = word2.replace(guess23i, '?');
                word2 = word2.replace(guess22i, '/');
                word2 = word2.replace(guess21i, '0');
                word2 = word2.replace(guess20i, '+');
                word2 = word2.replace(guess19i, '=');
                word2 = word2.replace(guess18i, '_');
                word2 = word2.replace(guess17i, '*');
                word2 = word2.replace(guess16i, '&');
                word2 = word2.replace(guess15i, '^');
                word2 = word2.replace(guess14i, '%');
                word2 = word2.replace(guess13i, '$');
                word2 = word2.replace(guess12i, '#');
                word2 = word2.replace(guess11i, '@');
                word2 = word2.replace(guess10i, '!');
                word2 = word2.replace(guess9i, '9');
                word2 = word2.replace(guess8i, '8');
                word2 = word2.replace(guess7i, '7');
                word2 = word2.replace(guess6i, '6');
                word2 = word2.replace(guess5i, '5');
                word2 = word2.replace(guess4i, '4');
                word2 = word2.replace(guess3i, '3');
                word2 = word2.replace(guess2i, '2');
                word2 = word2.replace(guess1i, '1');

                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '1' && word2.charAt(x) != '2' && word2.charAt(x) != '3' && word2.charAt(x) != '4' && word2.charAt(x) != '5' && word2.charAt(x) != '6' && word2.charAt(x) != '7' && word2.charAt(x) != '8' && word2.charAt(x) != '9' && word2.charAt(x) != '!' && word2.charAt(x) != '@' && word2.charAt(x) != '#' && word2.charAt(x) != '$' && word2.charAt(x) != '%' && word2.charAt(x) != '^' && word2.charAt(x) != '&' && word2.charAt(x) != '*' && word2.charAt(x) != '_' && word2.charAt(x) != '=' && word2.charAt(x) != '+' && word2.charAt(x) != '0' && word2.charAt(x) != '/' && word2.charAt(x) != '?' && word2.charAt(x) != '<' && word2.charAt(x) != '>') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('1', guess1i);
                word2 = word2.replace('2', guess2i);
                word2 = word2.replace('3', guess3i);
                word2 = word2.replace('4', guess4i);
                word2 = word2.replace('5', guess5i);
                word2 = word2.replace('6', guess6i);
                word2 = word2.replace('7', guess7i);
                word2 = word2.replace('8', guess8i);
                word2 = word2.replace('9', guess9i);
                word2 = word2.replace('!', guess10i);
                word2 = word2.replace('@', guess11i);
                word2 = word2.replace('#', guess12i);
                word2 = word2.replace('$', guess13i);
                word2 = word2.replace('%', guess14i);
                word2 = word2.replace('^', guess15i);
                word2 = word2.replace('%', guess16i);
                word2 = word2.replace('*', guess17i);
                word2 = word2.replace('_', guess18i);
                word2 = word2.replace('=', guess19i);
                word2 = word2.replace('+', guess20i);
                word2 = word2.replace('0', guess21i);
                word2 = word2.replace('/', guess22i);
                word2 = word2.replace('?', guess23i);
                word2 = word2.replace('<', guess24i);
                word2 = word2.replace('>', guess25i);
            }
            //if the guess was incorrect;
            if (!(word.contains(guess25))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);


        //if the word still has blanks, let them guess a letter
        if (word2.contains("-") && incorrect > 0) {
            //asks player 2 to input a guess
            System.out.println("Please guess a letter.");
            //input for the letter
            String guess26 = input.nextLine();
            //turning the inputed letter to lowercase
            guess26 = guess26.toLowerCase();
            //putting the letter into a character form-instead of string
            guess26i = guess26.charAt(0);

            //if the letter guessed was correct
            if (word.contains(guess26)) {
                word2 = word;
                //replace the guess with temp variables
                word2 = word2.replace(guess26i, '.');
                word2 = word2.replace(guess25i, '>');
                word2 = word2.replace(guess24i, '<');
                word2 = word2.replace(guess23i, '?');
                word2 = word2.replace(guess22i, '/');
                word2 = word2.replace(guess21i, '0');
                word2 = word2.replace(guess20i, '+');
                word2 = word2.replace(guess19i, '=');
                word2 = word2.replace(guess18i, '_');
                word2 = word2.replace(guess17i, '*');
                word2 = word2.replace(guess16i, '&');
                word2 = word2.replace(guess15i, '^');
                word2 = word2.replace(guess14i, '%');
                word2 = word2.replace(guess13i, '$');
                word2 = word2.replace(guess12i, '#');
                word2 = word2.replace(guess11i, '@');
                word2 = word2.replace(guess10i, '!');
                word2 = word2.replace(guess9i, '9');
                word2 = word2.replace(guess8i, '8');
                word2 = word2.replace(guess7i, '7');
                word2 = word2.replace(guess6i, '6');
                word2 = word2.replace(guess5i, '5');
                word2 = word2.replace(guess4i, '4');
                word2 = word2.replace(guess3i, '3');
                word2 = word2.replace(guess2i, '2');
                word2 = word2.replace(guess1i, '1');

                //if the character at each position is not an astrix, replace it with a dash
                for (int x = 0; x < word.length(); x++) {
                    if (word2.charAt(x) != '1' && word2.charAt(x) != '2' && word2.charAt(x) != '3' && word2.charAt(x) != '4' && word2.charAt(x) != '5' && word2.charAt(x) != '6' && word2.charAt(x) != '7' && word2.charAt(x) != '8' && word2.charAt(x) != '9' && word2.charAt(x) != '!' && word2.charAt(x) != '@' && word2.charAt(x) != '#' && word2.charAt(x) != '$' && word2.charAt(x) != '%' && word2.charAt(x) != '^' && word2.charAt(x) != '&' && word2.charAt(x) != '*' && word2.charAt(x) != '_' && word2.charAt(x) != '=' && word2.charAt(x) != '+' && word2.charAt(x) != '0' && word2.charAt(x) != '/' && word2.charAt(x) != '?' && word2.charAt(x) != '<' && word2.charAt(x) != '>' && word2.charAt(x) != '.') {
                        word2 = word2.replace(word2.charAt(x), '-');

                    }
                }
                //fill in the guessed letter
                word2 = word2.replace('1', guess1i);
                word2 = word2.replace('2', guess2i);
                word2 = word2.replace('3', guess3i);
                word2 = word2.replace('4', guess4i);
                word2 = word2.replace('5', guess5i);
                word2 = word2.replace('6', guess6i);
                word2 = word2.replace('7', guess7i);
                word2 = word2.replace('8', guess8i);
                word2 = word2.replace('9', guess9i);
                word2 = word2.replace('!', guess10i);
                word2 = word2.replace('@', guess11i);
                word2 = word2.replace('#', guess12i);
                word2 = word2.replace('$', guess13i);
                word2 = word2.replace('%', guess14i);
                word2 = word2.replace('^', guess15i);
                word2 = word2.replace('%', guess16i);
                word2 = word2.replace('*', guess17i);
                word2 = word2.replace('_', guess18i);
                word2 = word2.replace('=', guess19i);
                word2 = word2.replace('+', guess20i);
                word2 = word2.replace('0', guess21i);
                word2 = word2.replace('/', guess22i);
                word2 = word2.replace('?', guess23i);
                word2 = word2.replace('<', guess24i);
                word2 = word2.replace('>', guess25i);
                word2 = word2.replace('.', guess26i);
            }
            //if the guess was incorrect;
            if (!(word.contains(guess26))) {
                //decrease number of incorrect guesses by one
                incorrect = incorrect - 1;
                //tell them they guessed incorrectly
                System.out.println("Sorry, that was incorrect. You only have " + incorrect + " guesses left.");
            }
        }

        //print the word
        System.out.println(word2);

        //for when they win the game
        if (!(word2.contains("-")) && incorrect > 0) {
            System.out.println("Congradulations! You won the game with" + incorrect + " guesses remaining.");
        }
        //for when they lose the game
        if (incorrect == 0) {
            System.out.println("Sorry, you used up all your guesses. You lose the game. Please play again.");
        }
    }
}
