<<<<<<< HEAD
import java.util.Scanner;

public class FindingMaxandMinInTheArray{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int userInput = scan.nextInt();
        
        int[] arr = new int[userInput];
        System.out.print("Enter the elements: ");
        
        for(int i=0;i<userInput;i++){
            arr[i]=scan.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for(int i=0;i<userInput;i++){
            max = Integer.max(max, arr[i]);
            min = Integer.min(min, arr[i]);
        }
        System.out.println("Maximum Element is "+max);
        System.out.println("Minimum Element is "+min);
    }
=======
import java.util.Scanner;

public class FindingMaxandMinInTheArray{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int userInput = scan.nextInt();
        
        int[] arr = new int[userInput];
        System.out.print("Enter the elements: ");
        
        for(int i=0;i<userInput;i++){
            arr[i]=scan.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for(int i=0;i<userInput;i++){
            max = Integer.max(max, arr[i]);
            min = Integer.min(min, arr[i]);
        }
        System.out.println("Maximum Element is "+max);
        System.out.println("Minimum Element is "+min);
    }
>>>>>>> dd560e230e3136adda2a1274efd27c96c72126a7
}