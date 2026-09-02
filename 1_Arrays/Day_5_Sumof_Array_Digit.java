import java.util.*;
public class Day_5_Sumof_Array_Digit {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     int size = sc.nextInt();
     int arr[] = new int[size];
     int sum =0;
     for(int i= 0; i<size; i++){
      arr[i] = sc.nextInt();
     }
     for(int i=0; i<size; i++){
       System.out.print(arr[i] + " ");
     }

     for(int i=0; i<arr.length; i++){
    int n = arr[i];

    while(n > 0){
        int digit = n % 10;
        sum += digit;
        n = n / 10;
    }
  }

  System.out.print(sum + " ");
}
}
