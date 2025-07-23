
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr=new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
            sum = sum+arr[i];
        }
        int product = 1;
        for(int i=0;i<n;i++){
            product = product*arr[i];
        }
        if(sum%2==0){
            System.out.println(sum);
        }
        else{
            System.out.println(product);
        }
    }
}
