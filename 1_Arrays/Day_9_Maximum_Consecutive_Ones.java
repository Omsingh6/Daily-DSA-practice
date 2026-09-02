import java.util.Scanner;
public class Day_9_Maximum_Consecutive_Ones {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     
    System.out.println("Enter the size of array:-");
    int size = sc.nextInt();

    int arr[] = new int[size];

    System.out.println("Enter the number only 0 / 1 for count how many time number 1 is repited");
         for(int i=0; i<size; i++){
          arr[i] = sc.nextInt();
         }
         
         System.out.println("The array is :-");
            for(int i=0; i<size; i++){
              System.out.println(arr[i] + " ");
            }

            int count = 0;
            int max_count = 0;
            
            for(int i =0; i<arr.length; i++){

              if(arr[i] == 1){
                
               count +=1;

              }else{

                count = 0;
              }
            
              if(count > max_count){
                max_count =  count;
              }
            }
            
            System.out.println("\n" + max_count);
  }
}
