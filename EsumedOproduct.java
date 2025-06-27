import java.util.Scanner;

public class EsumedOproduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = scan.nextInt();

        System.out.println("Enter the elements: ");
        int[] arr=new int[n];

        int sum = 0;
        long product= 1;
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
            sum = sum+arr[i];
        }
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
