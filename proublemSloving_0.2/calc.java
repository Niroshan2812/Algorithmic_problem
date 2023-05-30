//fibonachi number calculation
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
 * 
 */ 




public class calc {
    public static void main(String[] args) {
        System.out.println(fib (1));

        System.out.println(fib (7));
        System.out.println(fib (8));

    }

    static int fib(int num){
        if(num <= 2 ){
            return  1;

        }
        return fib(num-1)+fib(num-2);
    }
}
