/*

Task 4: Spiral Traversal of a Matrix
Write a program to traverse a matrix in spiral order. The program should accept the dimensions and
elements of the matrix as input and then display the spiral traversal.
Example Input:
Enter rows and columns of matrix: 3 3
Enter elements of the matrix:
1 2 3
4 5 6
7 8 9
Example Output:
Spiral Traversal: 1 2 3 6 9 8 7 4 5



*/
/*

Nichita Selchin , Student No : sba24331

Repository link : https://github.com/Nichita777/Task4

*/


package com.mycompany.task4;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the matrix
        System.out.print("Enter rows and columns of matrix: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        // Create and populate the matrix
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Perform spiral traversal
        System.out.print("Spiral Traversal: ");
        spiralTraversal(matrix, rows, cols);

        scanner.close();
    }

    // Method to traverse the matrix in spiral order
    public static void spiralTraversal(int[][] matrix, int rows, int cols) {
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++; // Move down the top boundary

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--; // Move left the right boundary

            if (top <= bottom) { // Check if there are remaining rows
                // Traverse from right to left
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--; // Move up the bottom boundary
            }

            if (left <= right) { // Check if there are remaining columns
                // Traverse from bottom to top
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++; // Move right the left boundary
            }
        }
    }
}
