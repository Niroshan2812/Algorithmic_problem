/*
 * Write a program in Java that takes in an array of integers and returns the second smallest number in the array. 
 * If there is no second smallest number (e.g., if all the numbers in the array are the same), the program should output an appropriate message.
 */

public class prm2 {
   

    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 15, 7, 3};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
    
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                secondSmallest = smallest;
                smallest = numbers[i];
            } else if (numbers[i] < secondSmallest && numbers[i] != smallest) {
                secondSmallest = numbers[i];
            }
        }
    

        if (secondSmallest == Integer.MAX_VALUE) {
        System.out.println("There is no second smallest number.");
        } else {
        System.out.println("The second smallest number is: " + secondSmallest);
        }
    }
    
}
