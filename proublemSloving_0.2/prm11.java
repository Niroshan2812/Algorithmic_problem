import java.lang.reflect.Array;
import java.util.Arrays;

public class prm11{
    public static void multidimatiol(int[] arr1, int[] arr2){
        //Check whether array length are same or not
        int[] apendarr =new int[arr1.length];
        if (arr1.length != arr2.length){
            System.out.println("Array are not same length");
        }else{
            for (int i =0; i < arr1.length;i++){
             
                apendarr[i]= arr1[i]*arr2[i];
            }
            System.out.println(Arrays.toString(apendarr));
        }
    }
    public static void main(String[] args) {
        int[]arrays = {1,2,3,45,4};
        int[] arrays2 = {3,4,5,8,1};
        multidimatiol(arrays, arrays2);
    }
}















