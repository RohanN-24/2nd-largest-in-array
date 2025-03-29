import java.util.Arrays;
import java.util.Scanner;

public class LagrestNo
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();   //75 50 45 25 10
        }

        Arrays.sort(arr);
       int large= arr[arr.length -1];
       int slarge= large;
       int i= arr.length-2;
        
       while (i>=0) {
         if (arr[i]<large) {
            slarge=arr[i];
            break;
         }
         i--;

       }
       
        System.out.print("second largest "+ slarge);


    }
}
