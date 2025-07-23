<<<<<<< HEAD
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        char  operator = scan.next().charAt(0);

        double result;
        switch(operator){
            case '+':
                result = num1 + num2;
                System.out.println(result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(result);
                break;

            case '/':
                if(num2 != 0){
                    result = num1 / num2;
                    System.out.println(result);
                }else {
                    System.out.println("error");
                }
                break;
                default:
                    System.out.println("invalid operator");
        }

    }
}
=======
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        char operator = scan.next().charAt(0);

        double result;
        switch(operator){
            case '+':
                result = num1 + num2;
                System.out.println(result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(result);
                break;

            case '/':
                if(num2 != 0){
                    result = num1 / num2;
                    System.out.println(result);
                }else {
                    System.out.println("error");
                }
                break;
                default:
                    System.out.println("invalid operator");
        }

    }
}
>>>>>>> dd560e230e3136adda2a1274efd27c96c72126a7
