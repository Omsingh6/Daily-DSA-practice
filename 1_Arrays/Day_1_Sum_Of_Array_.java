// Find the sum of arrray .

import java.util.Scanner;

class Day_1_Sum_Of_Array_ {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter thr size of array:-");
     int size = sc.nextInt();

     int[] arr = new int[size];

     System.out.println("Enter the element of array:-");
        for(int i=0; i<size; i++){
        arr[i] = sc.nextInt();
      }

      System.out.println("The array is :-");
      for(int i=0; i<size; i++){
        System.out.print(arr[i]+" ");
      }
 
      int sum =0;
      for(int i=0; i<size; i++){
        sum += arr[i];
      }

      System.out.println("\n" + sum);


     
  }
}