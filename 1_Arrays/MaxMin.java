/// Find the maximum and minimum element in array;

import java.util.Scanner;
public class MaxMin {
     public static void main(String arga[]){
        Scanner sc = new Scanner(System.in);
         
          System.out.print("Enter the size of array:-");
          int size  = sc.nextInt();

          int[] arr  = new int[size];

          System.out.print("Enter the element in array:-");
               
            for(int i=0 ; i<size; i++){
             arr[i] = sc.nextInt();
            }
          
          System.out.print("The Array element  are:-");
             
            for(int i=0; i<size; i++){
              System.out.print(arr[i] + " ");
            }

          int max = arr[0];
          int min = arr[0];

          for(int i=0; i<size; i++){
            if(arr[i]> max){
               max = arr[i];
            }

            if(arr[i]< min){
              min = arr[i];
            }
          }
        System.out.println("\nThe maximum number is:-"+ max);
        System.out.println("The Minimum number is:-"+ min);
     }
       
} 
