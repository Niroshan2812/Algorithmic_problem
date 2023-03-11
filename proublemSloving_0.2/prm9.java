/*
 * step 1 write a code to count the prime number 
 */
public class prm9 {

    public static int count_number (int[] arr){
        int count = 0;

        for (int arrs : arr ){
            
            if (arrs % 2 > 0){
                
                count += 1;
            }else if(arrs <= 0 ){
                continue;
            }
            
           
        }

        return count;
    }



   public static void main(String[] args) {
    int[] arr ={1,1,5,1,2,4,3,1,0};
    System.out.print(count_number (arr));
    
   } 
}
