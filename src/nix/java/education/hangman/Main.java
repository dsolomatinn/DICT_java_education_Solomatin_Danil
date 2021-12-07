package nix.java.education.hangman;

import java.util.ArrayList;
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
        String[] words = {"java", "python", "javascript", "kotlin"};
        String randomWord = words[random.nextInt(words.length)];
        /*System.out.print("Try to guess the word: ");*/
    /*    if (answerUser.equals(randomWord)){
            System.out.println("You win");
        }
        else{
            System.out.println("You lost!");
        }*/

        //STAGE 4

//        char[] symbol = randomWord.toCharArray();
//        for (int i = 2; i < symbol.length; i++) {
//            symbol[i] = '-';
//        }
//        String word = String.valueOf(symbol);
//        System.out.print("Try to guess the word " + word + " : ");
//        String answerUser = scanner.nextLine();
//        if (answerUser.equals(randomWord)){
//            System.out.println("You win");
//        }
//        else{
//            System.out.println("You lost!");
//        }

        //STAGE 5

        ArrayList<String> someLetters = new ArrayList<>();
        StringBuffer word = new StringBuffer(randomWord);
        char[] symbol = randomWord.toCharArray();

        for (int i = 0; i < symbol.length; i++) {
            word.setCharAt(i, '-');
        }

        int life = 8;
        boolean True = true;

        while (True) {
            if (life > 0) {
                System.out.print("Try to guess the word: " + word + "\nEnter the letter:");
                String playersLetter = scanner.nextLine();

                if (randomWord.contains(playersLetter)) {
                    if (someLetters.contains(playersLetter)) {
                        System.out.println("No improvements");
                    } else {
                        for (int i = 0; i < randomWord.length(); i++) {
                            if (symbol[i] == playersLetter.charAt(0)) {
                                word.setCharAt(i, playersLetter.charAt(0));
                            }
                        }
                    }
                    if (word.toString().equals(randomWord)) {
                        System.out.println("This word is: " + randomWord+ "\nCongratulate");
                        break;
                    }
                } else {
                    System.out.println("This letter doesn't appear in the word!");
                    life--;
                }
                someLetters.add(playersLetter);
            } else {
                System.out.println("You lost!");
                break;
            }
        }

        //Stage 6


    }
}