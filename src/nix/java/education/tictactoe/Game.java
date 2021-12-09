package nix.java.education.tictactoe;

public class Game {

    public void createBoard(){
        int number = 0;
        String field;
        System.out.print("Enter your  cells: ");
        field = Main.scanner.next();
        System.out.println("-----");
        for (int i = 0; i < 3; i ++){
            System.out.print("|");
            for (int j = 0; j < 3; j++){
                System.out.print(field.charAt(number));
                number ++;
            }
            System.out.println("|");
        }
        System.out.println("-----");
    }

}
