package nix.java.education.tictactoe;
import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int num = 0;
            int turn = 0;
            int correct = 0, correct2 = 0;
            boolean end = false;
            int[] coordinates = new int[2];
            String field;
            char[] board = new char[9];
            field = "_________";
            for (int i5 = 0; i5 < 9; i5 ++){
                board[i5] = field.charAt(i5);
            }do{
                num = 0;
                correct2 = 0;
                end = false;
                System.out.println("-----");
                for (int i = 0; i < 3; i ++){
                    System.out.print("|");
                    for (int i1 = 0; i1 < 3; i1 ++){
                        System.out.print(board[num]);
                        num ++;
                    }System.out.println("|");
                }System.out.println("-----");
                System.out.print("Enter coordinates: ");
                for (int i2 = 0; i2 < 2; i2 ++){
                    coordinates[i2] = in.nextInt();
                }for (int i3 = 1; i3 < 4; i3 ++){
                    for (int i4 = 1; i4 < 4; i4 ++){
                        if (coordinates[0] == i3 && coordinates[1] == i4){
                            correct = correct2;
                            end = true;
                        }correct2 ++;
                    }
                }if (end == false){
                    System.out.println("Coordinates should be from 1 to 3");
                }if (end == true){
                    if (board[correct] == 'X' || board[correct] == 'O'){
                        System.out.println("This cell is occupied! Choose another one!");
                    }else{
                        if (turn == 0){
                            board[correct] = 'X';
                            turn ++;
                        }else if (turn == 1){
                            board[correct] = 'O';
                            turn --;
                        }
                    }
                }if ((board[0] == 'X' && board[1] == 'X' && board[2] == 'X') ||
                        (board[3] == 'X' && board[4] == 'X' && board[5] == 'X') ||
                        (board[6] == 'X' && board[7] == 'X' && board[8] == 'X') ||
                        (board[0] == 'X' && board[3] == 'X' && board[6] == 'X') ||
                        (board[1] == 'X' && board[4] == 'X' && board[7] == 'X') ||
                        (board[2] == 'X' && board[5] == 'X' && board[8] == 'X') ||
                        (board[0] == 'X' && board[4] == 'X' && board[8] == 'X') ||
                        (board[2] == 'X' && board[4] == 'X' && board[6] == 'X')){
                    System.out.println("X win");
                    System.exit(0);
                } else if ((board[0] == 'O'&& board[1] == 'O' && board[2] == 'O')||
                        (board[3] == 'O' && board[4] == 'O' && board[5] == 'O') ||
                        (board[6] == 'O' && board[7] == 'O' && board[8] == 'O') ||
                        (board[0] == 'O' && board[3] == 'O' && board[6] == 'O') ||
                        (board[1] == 'O' && board[4] == 'O' && board[7] == 'O') ||
                        (board[2] == 'O' && board[5] == 'O' && board[8] == 'O') ||
                        (board[0] == 'O' && board[4] == 'O' && board[8] == 'O') ||
                        (board[2] == 'O' && board[4] == 'O' && board[6] == 'O')){
                    System.out.println("O win");
                    System.exit(0);
                }else if (board[0] == '_' || board[1] == '_' || board[2] == '_' ||
                        board[3] == '_' || board[4] == '_' || board[5] == '_' ||
                        board[6] == '_' || board[7] == '_' || board[8] == '_'){
                    System.out.println("Game not finished");
                }else {
                    System.out.println("Draw");
                    System.exit(0);
                }
            }while (true);
        }
    }



