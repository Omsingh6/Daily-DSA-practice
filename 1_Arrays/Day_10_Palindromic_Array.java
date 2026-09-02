import java.util.*;
public class Day_10_Palindromic_Array {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int arr[] = {121, 131, 44, 10};

    
   int count =0;
    for(int i=0; i<arr.length; i++) {
      int reverse = 0;
      int n;
      n = arr[i];
      int ori = n;
      
      while(n > 0){
        int digit = n % 10;
        reverse =  reverse * 10 + digit;
        n = n/10;
      }

      if(ori == reverse ){
           count++;
      }

    }
    if(count == arr.length){
      System.out.println(" The array is palindromic.");
    } else{
      System.out.println("The array is not palindromic.");
    }
  }

}