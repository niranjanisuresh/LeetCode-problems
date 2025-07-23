import java.util.*;
public class EvenPositioned {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int result = evenPositioned(arr);
        System.out.println(result);
    }
    public static int evenPositioned(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i=i+2){
            sum=sum+arr[i];
        }
        return sum;
    }
}

