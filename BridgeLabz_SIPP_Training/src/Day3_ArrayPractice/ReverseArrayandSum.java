package Day3_ArrayPractice;

public abstract class ReverseArrayandSum {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix values:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();

        int[] arr = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                arr[index++] = matrix[i][j];

        System.out.print("1D array: ");
        for (int num : arr)
            System.out.print(num + " ");
        sc.close();
    }
}
