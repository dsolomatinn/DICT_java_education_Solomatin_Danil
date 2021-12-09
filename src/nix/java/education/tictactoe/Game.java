package nix.java.education.tictactoe;

import java.util.Arrays;

public class Game {

    int number = 0;
    String playingBoard;
    public void createBoard() {
        System.out.print("Enter your  cells: ");
        playingBoard = Main.scanner.next();
        System.out.println("-----");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(playingBoard.charAt(number));
                number++;
            }
            System.out.println("|");
        }
        System.out.println("-----");
    }


    public void checkWinner() {
        if (((playingBoard.charAt(0) == 'X' && playingBoard.charAt(1) == 'X' && playingBoard.charAt(2) == 'X') ||
                (playingBoard.charAt(3) == 'X' && playingBoard.charAt(4) == 'X' && playingBoard.charAt(5) == 'X') ||
                (playingBoard.charAt(6) == 'X' && playingBoard.charAt(7) == 'X' && playingBoard.charAt(8) == 'X') ||
                (playingBoard.charAt(0) == 'X' && playingBoard.charAt(3) == 'X' && playingBoard.charAt(6) == 'X') ||
                (playingBoard.charAt(1) == 'X' && playingBoard.charAt(4) == 'X' && playingBoard.charAt(7) == 'X') ||
                (playingBoard.charAt(2) == 'X' && playingBoard.charAt(5) == 'X' && playingBoard.charAt(8) == 'X') ||
                (playingBoard.charAt(0) == 'X' && playingBoard.charAt(4) == 'X' && playingBoard.charAt(8) == 'X') ||
                (playingBoard.charAt(2) == 'X' && playingBoard.charAt(4) == 'X' && playingBoard.charAt(6) == 'X'))
                && ((playingBoard.charAt(0) == 'O' && playingBoard.charAt(1) == 'O' && playingBoard.charAt(2) == 'O') ||
                (playingBoard.charAt(3) == 'O' && playingBoard.charAt(4) == 'O' && playingBoard.charAt(5) == 'O') ||
                (playingBoard.charAt(6) == 'O' && playingBoard.charAt(7) == 'O' && playingBoard.charAt(8) == 'O') ||
                (playingBoard.charAt(0) == 'O' && playingBoard.charAt(3) == 'O' && playingBoard.charAt(6) == 'O') ||
                (playingBoard.charAt(1) == 'O' && playingBoard.charAt(4) == 'O' && playingBoard.charAt(7) == 'O') ||
                (playingBoard.charAt(2) == 'O' && playingBoard.charAt(5) == 'O' && playingBoard.charAt(8) == 'O') ||
                (playingBoard.charAt(0) == 'O' && playingBoard.charAt(4) == 'O' && playingBoard.charAt(8) == 'O') ||
                (playingBoard.charAt(2) == 'O' && playingBoard.charAt(4) == 'O' && playingBoard.charAt(6) == 'O'))) {
            System.out.println("Impossible");
        }
        else if ((playingBoard.charAt(0) == 'X' && playingBoard.charAt(1) == 'X' && playingBoard.charAt(2) == 'X') ||
                (playingBoard.charAt(3) == 'X' && playingBoard.charAt(4) == 'X' && playingBoard.charAt(5) == 'X') ||
                (playingBoard.charAt(6) == 'X' && playingBoard.charAt(7) == 'X' && playingBoard.charAt(8) == 'X') ||
                (playingBoard.charAt(0) == 'X' && playingBoard.charAt(3) == 'X' && playingBoard.charAt(6) == 'X') ||
                (playingBoard.charAt(1) == 'X' && playingBoard.charAt(4) == 'X' && playingBoard.charAt(7) == 'X') ||
                (playingBoard.charAt(2) == 'X' && playingBoard.charAt(5) == 'X' && playingBoard.charAt(8) == 'X') ||
                (playingBoard.charAt(0) == 'X' && playingBoard.charAt(4) == 'X' && playingBoard.charAt(8) == 'X') ||
                (playingBoard.charAt(2) == 'X' && playingBoard.charAt(4) == 'X' && playingBoard.charAt(6) == 'X')){
            System.out.println("X win");}
        else if ((playingBoard.charAt(0) == 'O' && playingBoard.charAt(1) == 'O' && playingBoard.charAt(2) == 'O') ||
                (playingBoard.charAt(3) == 'O' && playingBoard.charAt(4) == 'O' && playingBoard.charAt(5) == 'O') ||
                (playingBoard.charAt(6) == 'O' && playingBoard.charAt(7) == 'O' && playingBoard.charAt(8) == 'O') ||
                (playingBoard.charAt(0) == 'O' && playingBoard.charAt(3) == 'O' && playingBoard.charAt(6) == 'O') ||
                (playingBoard.charAt(1) == 'O' && playingBoard.charAt(4) == 'O' && playingBoard.charAt(7) == 'O') ||
                (playingBoard.charAt(2) == 'O' && playingBoard.charAt(5) == 'O' && playingBoard.charAt(8) == 'O') ||
                (playingBoard.charAt(0) == 'O' && playingBoard.charAt(4) == 'O' && playingBoard.charAt(8) == 'O') ||
                (playingBoard.charAt(2) == 'O' && playingBoard.charAt(4) == 'O' && playingBoard.charAt(6) == 'O')) {
            System.out.println("O win");
        }
        else if (playingBoard.charAt(0) == '_' || playingBoard.charAt(1) == '_' || playingBoard.charAt(2) == '_' ||
                playingBoard.charAt(3) == '_' || playingBoard.charAt(4) == '_' || playingBoard.charAt(5) == '_' ||
                playingBoard.charAt(6) == '_' || playingBoard.charAt(7) == '_' || playingBoard.charAt(8) == '_'){
            System.out.println("Game not finished");
        }
        else{
            System.out.println("Draw");
        }
    }


}
