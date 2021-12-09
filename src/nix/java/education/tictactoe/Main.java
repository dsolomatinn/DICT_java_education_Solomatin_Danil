package nix.java.education.tictactoe;
import java.util.Scanner;
public class Main {
    public static final Scanner  scanner =new Scanner(System.in);
    public static void main(String[] args) {
        Game ticTacToe = new Game();
        ticTacToe.createBoard();
        ticTacToe.checkWinner();
    }



}
