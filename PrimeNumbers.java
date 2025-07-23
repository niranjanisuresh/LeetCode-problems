
import java.util.Scanner;

/**
 import java.util.Scanner;

public class PrimeNumbers {
    public static boolean isPrime(int N){
        for(int i=2;i<=N/2;i++){
            if(N%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.println(isPrime(N));
    }
}


import java.util.Scanner;
public class PrimeNumbers{
    public static boolean isPrime(int n){
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(isPrime(n));
    }
}
**/
public class PrimeNumbers{
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum =0;
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
            if(isPrime(arr[i])){
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}