import java.util.Scanner;
/// The second and third Gretest number find ;
public class Day_4_SecondLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println("The elements of the array are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        
        int largest = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        
        int sl = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] > sl && arr[i] != largest) {
                sl = arr[i];
            }
        }

        int Tl =0;

        for(int i=0; i< size; i++){
          if(arr[i] > Tl && arr[i] != sl &&  arr[i] != largest ){
            Tl = arr[i];
          }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + sl);
        System.out.println("Tl=" + Tl);

        sc.close();
    }
}