<<<<<<< HEAD
import java.util.Scanner; 

public class palindromeNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int original = num;
        int reversed = 0;

        if(num<0){
            System.out.println(num+"not a palindrome number");
        }
        else{
            if(num>0){
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num = num/10;
            }
        }
        if(original == reversed){
            System.out.println(original+"not a palindrome number");
        }
        else{
            System.out.println(original+"  a palindrome number");
        }
    }
}
=======
import java.util.Scanner; 

public class palindromeNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int original = num;
        int reversed = 0;

        if(num<0){
            System.out.println(num+"not a palindrome number");
        }
        else{
            if(num>0){
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num = num/10;
            }
        }
        if(original == reversed){
            System.out.println(original+"not a palindrome number");
        }
        else{
            System.out.println(original+"  a palindrome number");
        }
    }
}
>>>>>>> dd560e230e3136adda2a1274efd27c96c72126a7
