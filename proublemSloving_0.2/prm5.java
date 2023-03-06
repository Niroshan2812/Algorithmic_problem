/*
 * You are given a list of numbers. Write a function in Java that returns the sum of all even numbers in the list. 
 * For example, given the list [1, 2, 3, 4, 5, 6], your function should return 12 (which is the sum of 2, 4, and 6).
 */

public class prm5 {
     
    public static int sumofEven(int[] number){
        int sumofeven = 0;
        for (int numbers : number){
            if (numbers % 2 == 0 ){
                
                sumofeven += numbers;
            }
        }
       // System.out.println(sumofeven);
        return sumofeven;
    }

    public static void main(String[] args) {
        int[] numbers = {77,78,4,3,4,5,6};
        sumofEven(numbers);

    }
}
