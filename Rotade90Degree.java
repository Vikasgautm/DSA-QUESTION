import java.util.Scanner;

public class Rotade90Degree {
    public static void rotade(int matrix[][]) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Transpose the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = i; j < cols; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row of the transposed matrix
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols / 2; j++) {
        // int temp = matrix[i][j];
        // matrix[i][j] = matrix[i][cols - 1 - j];
        // matrix[i][cols - 1 - j] = temp;
        // }
        // }
        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[rows - 1 - i][j];
                matrix[rows - 1 - i][j] = t;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //  Scanner in=new Scanner(System.in);
        // // System.out.println("enter n*n type matrix");
        // int n=in.nextInt();
        // int arr[][]=new int[n][n];
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         arr[i][j]=in.nextInt();
        //     }
        // }
        
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 3, 4, 5, 5 },
                { 7, 8, 6, 6 },
                { 5, 6, 8, 9 },
        };
        rotade(arr);

    }
}
