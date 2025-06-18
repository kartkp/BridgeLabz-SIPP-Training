package Day4_Methods;

import java.util.*;

public class MatrixOperations {

    // Method to generate a random matrix
    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10);
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = B[0].length, common = B.length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < common; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }

    // Method to print a matrix
    public static void printMatrix(String label, int[][] matrix) {
        System.out.println(label);
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and cols for Matrix A: ");
        int rowsA = sc.nextInt(), colsA = sc.nextInt();

        System.out.print("Enter rows and cols for Matrix B: ");
        int rowsB = sc.nextInt(), colsB = sc.nextInt();

        int[][] A = generateMatrix(rowsA, colsA);
        int[][] B = generateMatrix(rowsB, colsB);

        printMatrix("Matrix A:", A);
        printMatrix("Matrix B:", B);
        if (rowsA == rowsB && colsA == colsB) {
            printMatrix("Addition (A + B):", addMatrices(A, B));
            printMatrix("Subtraction (A - B):", subtractMatrices(A, B));
        } else {
            System.out.println("Addition/Subtraction not possible (size mismatch).");
        }
        if (colsA == rowsB) {
            printMatrix("multipilcation (A * B):", multiplyMatrices(A, B));
        } else {
            System.out.println("multiplication not possibal (column of A ≠ row of B).");
        }
    }
}

