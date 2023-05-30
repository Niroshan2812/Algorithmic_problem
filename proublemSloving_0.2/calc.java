//fibonachi number calculation

import java.lang.reflect.Array;
import java.util.HashMap;

public class calc {
    public static void main(String[] args) {
     
        System.out.println(modfib (50, null));

    }

    //The proublem is when you call for example 50 as the input it gain lot time to calculation 
/*
 *          7
 *         /\
 *        /  \
 *       6    4
 *      /\    /\ 
 *     /  \   3 2
 *    5    4  /\
 *   /\    /\ 2 1
 *  3  2   3 1
 * /\      /\
 * 2 1    2  1
 * 
 * if the node 2 or 1 the return is 1 
 * Then calculate the numbers bottom to top 
 * Time complexity = O(2^n)
 */  
    static int fib(int num){
        if(num <= 2 ){
            return  1;

        }
        return fib(num-1)+fib(num-2);
    }

    //------------------------------------------------------------------------------
/* Above function get Time complexity = O(2^n)

 * if you see in above tree there have same group is duplication again and again so we can avoid that dublication
 *   3      3 
 *  /\      /\
 * 2 1     2  1
 * 
 * if you seee closly 5th fibonachi is always 5 
 * 
 * so we can appliy memorization for that 
 * 
 * 
 * 
 */
  static int modfib(int num1, HashMap<Integer, Integer> memo) {
    
    if (memo == null) {
        memo = new HashMap<>();
    }if (memo.containsKey(num1))
        return memo.get(num1);
    
    if (num1 <= 2)
        return 1;
    
    memo.put(num1, modfib(num1 - 1, memo) + modfib(num1 - 2, memo));
    return memo.get(num1);
 }
}