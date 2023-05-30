//fibonachi number calculation

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
