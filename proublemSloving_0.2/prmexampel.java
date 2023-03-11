import java.util.Arrays;

public class prmexampel {
    public static void selectionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {

                //for decending order comapre the value gether then j 
                
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            // Swap the order with founded number 
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 9};
        selectionSortDescending(arr);
        System.out.println(Arrays.toString(arr));
    }
}
