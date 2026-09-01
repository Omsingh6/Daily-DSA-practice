import java.util.*;
public class SumofArrayDigit {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     int size = sc.nextInt();
     int arr[] = new int[size];
     for(int i= 0; i<size; i++){
      arr[i] = sc.nextInt();
     }
     for(int i=0; i<size; i++){
       System.out.print(arr[i] + " ");
     }

     for(int i=0; i<arr.length; i++){
    int n = arr[i];
    int sum = 0;

    while(n > 0){
        int digit = n % 10;
        sum += digit;
        n = n / 10;
    }
  }

  System.out.print(sum + " ");
}
}
