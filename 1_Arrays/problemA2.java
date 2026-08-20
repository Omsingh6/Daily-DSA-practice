// Find Element at a Given Index

import java.util.Scanner;

public class prblemA2 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Array size:");
    int n= sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter the Elemenet in Array:");
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }

    System.out.println("Print the Arrya :-");
    for(int i=0; i<n; i++){
      System.out.print(arr[i] + " ");
    }

    System.out.println("Enter the Index the you want to print:-");

    int index = sc.nextInt();

    System.out.println("Element at Index " + index + " is " + arr[index]);

  }
}

