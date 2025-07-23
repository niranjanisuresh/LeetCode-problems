import java.util.Scanner;
public class MidLast {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int mid = n/2;
        
        for(int i=n-1;i>=mid;i--){
            System.out.println(arr[i]);
        }
    }
}

