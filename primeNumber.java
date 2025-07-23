<<<<<<< HEAD
import java.util.Scanner;

public class primeNumber{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        boolean isPrime = true;

        if(num <= 1){
            isPrime = false;
        }else{
            for(int i = 2; i<=Math.sqrt(num);i++){
                if(num % i== 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num+" is a prime number");
            }
            else{
                System.out.println(num+" is not a prime number");
            }
        }
    }
}
=======
import java.util.Scanner;

public class primeNumber{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        boolean isPrime = true;

        if(num <= 1){
            isPrime = false;
        }else{
            for(int i = 2; i<=Math.sqrt(num);i++){
                if(num % i== 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num+" is a prime number");
            }
            else{
                System.out.println(num+" is not a prime number");
            }
        }
    }
}
>>>>>>> dd560e230e3136adda2a1274efd27c96c72126a7
