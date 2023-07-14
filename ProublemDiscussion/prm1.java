package ProublemDiscussion;

public class prm1 {
    public static void main(String[] args) {
        int arr[] = {20,30,40,50,60};
        System.out.println(calculateSum(arr));
        System.out.println(calculateSums(arr));
    }

    public static int calculateSum(int[]numbers){
        int sum = 0;
        for (int i =0; i<numbers.length;i++){
            sum+=numbers[i];
        }
        return sum;
    }
    public static int calculateSums(int[] numbers) {
    int sum = 0;
    for (int num : numbers) {
        sum += num;
    }
    return sum;
}
}
