/*
 * You have been given a list of integers. Write a Java function to return the second smallest integer in the list. 
 * If there is no second smallest integer (e.g., all the integers in the list are the same), then the function should return -1.
 */


public class prm6 {

    public static int secondSmallest(List<Integer> list) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        
        return secondSmallest == Integer.MAX_VALUE ? -1 : secondSmallest;
    }

    
}
