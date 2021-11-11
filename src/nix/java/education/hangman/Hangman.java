package nix.java.education.hangman;
import java.util.*;
public class Hangman {

    public static void main(String[] args) {
        //STAGE 1
        System.out.println("HANGMAN\nThe game will be available soon...");
        //STAGE 2
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Guess the word: ");
//        String answer = scanner.nextLine();
//        if (answer.equals("java")){
//            System.out.println("You survived!!");
//        }
//        else {
//            System.out.println("You lost!");
//        }
        //STAGE 3
        String[] words={"python", "java", "kotlin", "javascript"};
        Random r=new Random();
        int randomNumber=r.nextInt(words.length);
//        System.out.print("Guess the word: ");
//        String answer = scanner.nextLine();
//        if (answer.equals(words[randomNumber])){
//            System.out.println("You survived!!");
//        }
//        else {
//            System.out.println("You lost!");
//        }

        //stage 4
        StringBuilder strBuff  = new StringBuilder(words[randomNumber]);
        for (int i = 2; i <= strBuff.length()-1; i++){
            strBuff.setCharAt(i, '-');
        }
        System.out.print("Guess the word " + strBuff + " : ");
        String answer = scanner.nextLine();
        if (answer.equals(words[randomNumber])){
            System.out.println("You survived!!");
        }
        else {
            System.out.println("You lost!");
        }
    }
}
