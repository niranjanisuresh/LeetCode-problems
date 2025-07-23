
import java.util.Scanner;

public class ReadElementsinArr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        //declare array
        int[] arr = new int[n];

        //reading elements
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
        }

        //print elements
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
