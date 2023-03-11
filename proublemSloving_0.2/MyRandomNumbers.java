
/*
 * For quection 3 c 1
 */
import java.util.Arrays;
import java.util.Random;

public class MyRandomNumbers {
    // store prime numbers to new array
    public static int[] count_number(int[] arr) {
        int count = 0;
        int[] primes = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 > 0) {
                primes[count++] = arr[i];
            } else if (arr[i] <= 0) {
                continue;
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = primes[i];
        }
        return result;
    }

    // Change the order
    public static int[] selectionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                // for decending order comapre the value gether then j
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            // Swap the order with founded number
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static int[] multidimatiol(int[] arr1, int[] arr2) {
        // Check whether array length are same or not
        int[] apendarr = new int[arr1.length];
        if (arr1.length != arr2.length) {
            System.out.println("Array are not same length");
        } else {
            for (int i = 0; i < arr1.length; i++) {
                apendarr[i] = arr1[i] * arr2[i];
            }
        }
        return apendarr;
    }

    public static void main(String[] args) {
        Random objGenerator = new Random();
        int[] myRndmNos = new int[20];
        for (int ii = 0; ii < myRndmNos.length; ii++) {
            myRndmNos[ii] = objGenerator.nextInt(4321);
        }

        // System.out.println(Arrays.toString(myRndmNos));;
        int[] primenum = count_number(myRndmNos);
        System.out.println("Prime number array is " + Arrays.toString(primenum));
        System.out.println("");
        int[] decendingoder = selectionSortDescending(count_number(myRndmNos));
        System.out.println("Descending order array is " + Arrays.toString(decendingoder));
        System.out.println("");
        int[] multiply = multidimatiol(primenum, decendingoder);
        System.out.println("Element-wise multiplication" + Arrays.toString(multiply));
        System.out.println("");
    }
}