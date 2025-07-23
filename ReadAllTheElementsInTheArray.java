import java.util.Scanner;

public class ReadAllTheElementsInTheArray {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter the number of elements ");
       int n=scan.nextInt();
       int[] arr = new int[n];
       int sum  = 0;
       System.out.print("Enter the elements ");

       for(int i=0;i<n;i++){
           arr[i] = scan.nextInt();
            sum = sum+arr[i];
       }
       System.out.println("The sum of all elements "+sum);

   } 
    }

