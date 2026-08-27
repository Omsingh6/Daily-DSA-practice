//Check If Array is Sorted
import java.util.*;
public class CheckIfArrayisSorted {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of array:-");
    int size = sc.nextInt();
    int arr[] = new int[size];

    System.out.println("Enter the element in array:-");
    for(int i =0; i<size; i++){
      arr[i] = sc.nextInt();
    }
    
    System.out.println("Printing the array.");
    for(int i=0; i<size; i++){
      System.out.print(arr[i] + " ");
    }
    
     boolean  sorted = true;
    for(int i=0; i<=arr.length; i++){

      if(arr[i]> arr[i + 1]){
         sorted  = false;
         break;
      }
    }

    if(sorted){
      System.out.print("Array is sorted");
    }else {
      System.out.println("\nArray is not sorted");
    }
      }
}