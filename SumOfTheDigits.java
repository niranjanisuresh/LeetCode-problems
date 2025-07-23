import java.util.Scanner;

public class SumOfTheDigits {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        while(num > 0){
            int remainder = num % 10;
            sum =sum + remainder;
            num = num / 10;   
        }
        System.out.println(sum);
    }
}
