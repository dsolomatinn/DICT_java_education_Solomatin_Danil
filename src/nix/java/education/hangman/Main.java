package nix.java.education.hangman;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                """
                HANGMAN
                """);

        //STAGE 2

        /* System.out.print("Guess the word: ");
        String answerUser = scanner.nextLine();
        String word = "java";
        if (answerUser.equals(word)){
            System.out.println("You win");
        }
        else{
            System.out.println("You lost!");
        }
*/
        //STAGE 3
        Random random = new Random();
        String[] words = {"java","python", "javascript", "kotlin"};
        String randomWord = words[random.nextInt(words.length)];
        /*System.out.print("Try to guess the word: ");*/
    /*    if (answerUser.equals(randomWord)){
            System.out.println("You win");
        }
        else{
            System.out.println("You lost!");
        }*/

        //STAGE 4
        char[] symbol = randomWord.toCharArray();
        for (int i = 2; i < symbol.length; i++) {
            symbol[i] = '-';
        }
        String word = String.valueOf(symbol);
        System.out.print("Try to guess the word " + word + " : ");
        String answerUser = scanner.nextLine();
        if (answerUser.equals(randomWord)){
            System.out.println("You win");
        }
        else{
            System.out.println("You lost!");
        }

    }
}

