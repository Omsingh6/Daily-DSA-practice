// Find the sum of Digit 23
import java.util.Scanner;

public class SumOfDigit {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Digit that you want to sum:-");
    int  n = sc.nextInt();
    

    int sum = 0;

    while (n > 0) {
       int digit = n % 10;

       sum = sum + digit;

       n = n / 10;
    }

    System.out.println(sum);
  }
  
}
