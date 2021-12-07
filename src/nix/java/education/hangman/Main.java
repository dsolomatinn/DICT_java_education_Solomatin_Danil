package nix.java.education.hangman;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(
                """
                HANGMAN
                """);

        //STAGE 2

        System.out.print("Guess the word: ");
        String answerUser = scan.nextLine();
        String word = "java";
        if (answerUser.equals(word)){
            System.out.println("You win");
        }
        else{
            System.out.println("You lost!");
        }


    }
}

