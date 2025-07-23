import java.util.Scanner;

public class primeNumber1toN {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int num = 2; num<=n ; num++){
            boolean isPrime = true;

            for(int i=2; i<=Math.sqrt(num);i++){
                if(num % 2 == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
            System.out.println(num);
        }
        }
    }    
}
