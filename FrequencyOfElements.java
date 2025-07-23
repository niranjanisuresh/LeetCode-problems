import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
            
        }
        HashMap<Integer,Integer>frequency=new HashMap<>();

    }
}
