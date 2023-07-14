import java.io.*;

public class prm14_stack {
    public static void main(String[] args) {

        // Create a 2D array of size 3x4
        int[][] arr = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 } };

        // Print the 2D array to the console
        for (int i = 0 ; i<arr[0].length;i++){
           for (int j = i; j< i+1; j++ ){
            System.out.println(arr[i][j]);
           }
        }
    }

    public void fun() {
        int arr[][] = { { 10, 20, 30, 40, 50 }, { 1, 2, 3, 4, 5 } };
        int arrs[] = new int[0];
        int index = 0;

        int i = arr.length;
        System.out.println(i);
        for (i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                arrs[index] = arr[i][j];
            }
        }
        System.out.println("arr[0][0] = " + arr[0][0]);
    }
}