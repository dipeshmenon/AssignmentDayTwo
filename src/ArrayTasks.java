import java.util.Scanner;
import java.util.*;

public class ArrayTasks {

    public void array(){
        System.out.println("Arrays -----");
        System.out.println("Number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        int[] marks = new int[n];
        for(int i = 0; i< n; i++){
            marks[i]=sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum += marks[i];
        }




        double average = sum / n;

        System.out.println("Average of array : "+average);

        Arrays.sort(marks);
        System.out.println("Minimum element of array: " + marks[0]);
        System.out.println("Maximum element of array: " + marks[n-1]);
    }

    public void twoDArray(){

        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("Enter values of 2D array: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is:");
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }



}

