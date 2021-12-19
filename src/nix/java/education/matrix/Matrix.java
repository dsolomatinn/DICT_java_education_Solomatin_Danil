package nix.java.education.matrix;
import java.util.Scanner;
public class Matrix {
    Scanner scanner = new Scanner(System.in);

    public void menu(){
        while (true){
            System.out.println("""
                    Chose your action
                    1. Sum of the matrix
                    """);
            String action = scanner.nextLine();
            if (action.equals("1")){
                sumOfMatrix();
            }
            else {
                break;
            }
        }
    }

    public void sumOfMatrix(){
        System.out.print("Enter parametric n(lines): ");
        int n = scanner.nextInt();
        System.out.print("Enter parametric m (rows): ");
        int m = scanner.nextInt();
        int [][] a = new  int [n][m];
        System.out.println("Enter the matrix values in order: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a [i][j] = scanner.nextInt();
            }
        }
        System.out.print("Enter parametric n(lines): ");
        int n1 = scanner.nextInt();
        System.out.print("Enter parametric m (rows): ");
        int m1 = scanner.nextInt();
        int [][] b = new  int [n1][m1];
        System.out.println("Enter the matrix values in order: ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                b [i][j] = scanner.nextInt();
            }
        }

        if(a.length == b.length){
            System.out.println("First Matrix: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Second Matrix: ");
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m1; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Sum of the matrix: ");
            int[][]c = new int[n][m];
            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {

                    c[i][j] = a[i][j] + b[i][j];
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("ERROR");
        }
    }






}
