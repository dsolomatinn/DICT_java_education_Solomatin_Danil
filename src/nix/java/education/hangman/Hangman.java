package nix.java.education.hangman;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {



    public static void chooseAction (){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("""
                            "HANGMAN!
                            The game will start right now"
                            If you wanna play press "p"
                            If you wanna quit press "q"
                            Choose
                            """
                    );
            String user = scanner.nextLine();
            if (user.equals("p")){
                startGame();
            }
            if (user.equals("q")){
                break;
            }
        }
    }


     public static void startGame (){
    Scanner scanner = new Scanner(System.in);
    System.out.print("""
                        HANGMAN
                        Please enter your name:
                        """);
    String playerName =scanner.nextLine();
    Random random = new Random();
    String[] words = {"java", "python", "javascript", "kotlin"};
    String randomWord = words[random.nextInt(words.length)];
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
            System.out.print(playerName + " try to guess the word: " + word + "\nEnter the letter:");
            String playersLetter = scanner.nextLine();
            if(someLetters.contains(playersLetter)){
                System.out.println("You've already guessed this letter.");
            }
            if (playersLetter.length()>1){
                System.out.println("you should input a single letter");
                continue;}
            if(!playersLetter.matches("[a-z]")) {
                System.out.println("Please enter a lowercase English letter" );
                continue;
            }


            if (randomWord.contains(playersLetter)) {
                if (someLetters.contains(playersLetter)) {
                } else {
                    for (int i = 0; i < randomWord.length(); i++) {
                        if (symbol[i] == playersLetter.charAt(0)) {
                            word.setCharAt(i, playersLetter.charAt(0));
                        }
                    }
                }
                if (word.toString().equals(randomWord)) {
                    System.out.println("This word is: " + randomWord+ "\nCongratulate " +playerName +"\nYOU WIN!! ");
                    break;
                }
            } else {
                System.out.println("This letter doesn't appear in the word!");
                life--;
            }
            someLetters.add(playersLetter);
        } else {
            System.out.println(playerName+" nice try but you lost!");
            break;
        }
    }
}
}