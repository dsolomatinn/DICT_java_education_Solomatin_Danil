package nix.java.education.matrix;
import java.util.Scanner;
public class Matrix {
    Scanner scanner = new Scanner(System.in);

    public void menu(){
            while (true) {
                System.out.print("""
                    Welcome to the matrix calculator
                    1. Sum of the matrix
                    2. Multiply matrix by constant
                    3. Multiply matrix
                    4.Transpose matrix
                    5. Determinant of matrix
                    6. Inverse matrix
                    7. Exit
                    Chose your action:
                    """);
                String action = scanner.next();
                if (action.equals("1")) {
                    sumOfMatrix();
                }
                else if (action.equals("2")) {
                    constantMatrix();
                }
                else if (action.equals("3")) {
                    multiplyMatrix();
                }
                else  if (action.equals("4")){
                    menuTransport();
                }
                else  if (action.equals("exit")){
                    break;
                }
            }
        }

    public void menuTransport(){
            System.out.print("""
                1.Main diagonal
                2.Side diagonal
                3.Vertical line
                4.Horizontal line
                """);
            String choice = scanner.next();
            if (choice.equals("1")) {
                transportMainDiagonal();
            }
            else if (choice.equals("2")) {
                transportSideDiagonal();
            }
            else if (choice.equals("3")) {
                transportVerticalLine();
            }
            else if (choice.equals("4")) {
                transportHorizontalLine();
            }
        }

    public void sumOfMatrix(){
        System.out.print("Enter parametric n(lines): ");
        int n = scanner.nextInt();
        System.out.print("Enter parametric m (rows): ");
        int m = scanner.nextInt();
        int[][] a = new int[n][m];
        System.out.println("Enter the matrix values in order: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Enter parametric n(lines): ");
        int n1 = scanner.nextInt();
        System.out.print("Enter parametric m (rows): ");
        int m1 = scanner.nextInt();
        int[][] b = new int[n1][m1];
        System.out.println("Enter the matrix values in order: ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        if (a.length == b.length) {
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
            int[][] c = new int[n][m];
            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {

                    c[i][j] = a[i][j] + b[i][j];
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("ERROR");
        }
    }

    public void constantMatrix(){
        System.out.print("Enter parametric n(lines): ");
        int n = scanner.nextInt();
        System.out.print("Enter parametric m (rows): ");
        int m = scanner.nextInt();
        int[][] a = new int[n][m];
        System.out.println("Enter the matrix values in order: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Enter a constant: ");
        int constValue = scanner.nextInt();
        System.out.println("New matrix: ");
        int[][] c = new int[n][m];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                c[i][j] = a[i][j] * constValue;
                System.out.print(c[i][j] + " ");

            }
            System.out.println();
        }
    }

    public void multiplyMatrix(){
        int[] sizeFirstMatrix = new int[2];
        System.out.print("Enter size of first matrix : ");
        for (int i = 0; i < 2; i++) {
            sizeFirstMatrix[i] = scanner.nextInt();
        }
        double[][] firstMatrix = new double[sizeFirstMatrix[0]][sizeFirstMatrix[1]];
        System.out.println("Enter the values of first matrix : ");
        for (int i = 0; i < sizeFirstMatrix[0]; i++) {
            for (int j = 0; j < sizeFirstMatrix[1]; j++) {
                firstMatrix[i][j] = scanner.nextDouble();
            }
        }
        int[] sizeSecondMatrix = new int[2];
        System.out.print("Enter size of second matrix : ");
        for (int i = 0; i < 2; i++) {
            sizeSecondMatrix[i] = scanner.nextInt();
        }
        double[][] secondMatrix = new double[sizeSecondMatrix[0]][sizeSecondMatrix[1]];
        System.out.println("Enter the values of second matrix E: ");
        for (int i = 0; i < sizeSecondMatrix[0]; i++) {
            for (int j = 0; j < sizeSecondMatrix[1]; j++) {
                secondMatrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("First Matrix: ");
        for (int i = 0; i < sizeFirstMatrix[0]; i++) {
            for (int j = 0; j < sizeFirstMatrix[1]; j++) {
                System.out.print(firstMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Second Matrix: ");
        for (int i = 0; i < sizeSecondMatrix[0]; i++) {
            for (int j = 0; j < sizeSecondMatrix[1]; j++) {
                System.out.print(secondMatrix[i][j] + " ");
            }
            System.out.println();
        }

        double[][] multiplyMatrix = new double[sizeFirstMatrix[0]][sizeSecondMatrix[1]];
        for (int m = 0; m < sizeFirstMatrix[0]; m++) {
            for (int n = 0; n < sizeSecondMatrix[1]; n++) {
                multiplyMatrix[m][n] = 0;
            }
        }

        if (sizeFirstMatrix[1] == sizeSecondMatrix[0]) {
            System.out.println("Multiply Matrix");
            for (int v = 0; v < sizeFirstMatrix[0]; v++) {
                for (int z = 0; z < sizeSecondMatrix[1]; z++) {
                    for (int x = 0; x < sizeFirstMatrix[1]; x++) {
                        multiplyMatrix[v][z] = multiplyMatrix[v][z] + firstMatrix[v][x] * secondMatrix[x][z];
                    }
                    System.out.print(multiplyMatrix[v][z] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("ERROR");
        }
    }

    public void transportMainDiagonal(){
        int[] sizeMatrix = new int[2];
        System.out.print("Enter size of first matrix : ");
        for (int i = 0; i < 2; i++) {
            sizeMatrix[i] = scanner.nextInt();
        }
        double[][] myMatrix = new double[sizeMatrix[0]][sizeMatrix[1]];
        System.out.println("Enter the values of first matrix : ");
        for (int i = 0; i < sizeMatrix[0]; i++) {
            for (int j = 0; j < sizeMatrix[1]; j++) {
                myMatrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("First Matrix: ");
        for (int i = 0; i < sizeMatrix[0]; i++) {
            for (int j = 0; j < sizeMatrix[1]; j++) {
                System.out.print(myMatrix[i][j] + " ");
            }
            System.out.println();
        }

        double[][] transposeMatrix = new double[sizeMatrix[1]][sizeMatrix[0]];

        System.out.println("Transpose matrix: ");
        for (int n = 0; n < sizeMatrix[1]; n++) {
            for (int m = 0; m < sizeMatrix[0]; m++) {
                transposeMatrix[n][m] = myMatrix[m][n];
                System.out.print(transposeMatrix[n][m] + " ");
            }System.out.println();
        }
    }

    public void transportSideDiagonal(){
        int[] sizeMatrix = new int[2];
        System.out.print("Enter size of first matrix : ");
        for (int i = 0; i < 2; i++) {
            sizeMatrix[i] = scanner.nextInt();
        }
        double[][] myMatrix = new double[sizeMatrix[0]][sizeMatrix[1]];
        System.out.println("Enter the values of first matrix : ");
        for (int i = 0; i < sizeMatrix[0]; i++) {
            for (int j = 0; j < sizeMatrix[1]; j++) {
                myMatrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("First Matrix: ");
        for (int i = 0; i < sizeMatrix[0]; i++) {
            for (int j = 0; j < sizeMatrix[1]; j++) {
                System.out.print(myMatrix[i][j] + " ");
            }
            System.out.println();
        }

        double[][] transposeMatrix = new double[sizeMatrix[1]][sizeMatrix[0]];

        System.out.println("Transpose matrix: ");
        for (int n = 0; n < sizeMatrix[0]; n++) {
            for (int m = 0; m < sizeMatrix[1]; m++) {
                transposeMatrix[m][n] = myMatrix[sizeMatrix[0] - 1 - n][sizeMatrix[1] - 1 - m];
                System.out.print(transposeMatrix[m][n] + " ");
            }
            System.out.println();
        }
    }

    public void transportVerticalLine(){
        int[] sizeMatrix = new int[2];
        System.out.print("Enter size of first matrix : ");
        for (int i = 0; i < 2; i++) {
            sizeMatrix[i] = scanner.nextInt();
        }
        double[][] myMatrix = new double[sizeMatrix[0]][sizeMatrix[1]];
        System.out.println("Enter the values of first matrix : ");
        for (int i = 0; i < sizeMatrix[0]; i++) {
            for (int j = 0; j < sizeMatrix[1]; j++) {
                myMatrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("First Matrix: ");
        for (int i = 0; i < sizeMatrix[0]; i++) {
            for (int j = 0; j < sizeMatrix[1]; j++) {
                System.out.print(myMatrix[i][j] + " ");
            }
            System.out.println();
        }

        double[][] transposeMatrix = new double[sizeMatrix[1]][sizeMatrix[0]];

        System.out.println("Transpose matrix: ");
        for (int n = 0; n < sizeMatrix[0]; n++) {
            for (int m = 0; m < sizeMatrix[1]; m++) {
                transposeMatrix[n][m] = myMatrix[n][sizeMatrix[1] - 1 - m];
                System.out.print(transposeMatrix[n][m] + " ");
            }
            System.out.println();
        }
    }

    public void transportHorizontalLine(){
        int[] sizeMatrix = new int[2];
        System.out.print("Enter size of first matrix : ");
        for (int i = 0; i < 2; i++) {
            sizeMatrix[i] = scanner.nextInt();
        }
        double[][] myMatrix = new double[sizeMatrix[0]][sizeMatrix[1]];
        System.out.println("Enter the values of first matrix : ");
        for (int i = 0; i < sizeMatrix[0]; i++) {
            for (int j = 0; j < sizeMatrix[1]; j++) {
                myMatrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("First Matrix: ");
        for (int i = 0; i < sizeMatrix[0]; i++) {
            for (int j = 0; j < sizeMatrix[1]; j++) {
                System.out.print(myMatrix[i][j] + " ");
            }
            System.out.println();
        }

        double[][] transposeMatrix = new double[sizeMatrix[1]][sizeMatrix[0]];

        System.out.println("Transpose matrix: ");
        for (int n = 0; n < sizeMatrix[0]; n++) {
            for (int m = 0; m < sizeMatrix[1]; m++) {
                transposeMatrix[n][m] = myMatrix[sizeMatrix[0] - 1 - n][m];
                System.out.print(transposeMatrix[n][m] + " ");
            }
            System.out.println();
        }
    }





}