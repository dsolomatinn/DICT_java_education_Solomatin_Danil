package nix.java.education.hangman;

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        //STAGE 1
        System.out.println("HANGMAN\nThe game will be available soon...");
        //STAGE 2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess the word: ");
        String answer = scanner.nextLine();
        if (answer.equals("java")){
            System.out.println("You survived!!");
        }
        else {
            System.out.println("You lost!");
        }
    }

}
