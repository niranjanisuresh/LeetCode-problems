<<<<<<< HEAD
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if((year % 400 == 0)||(year % 100 != 0) && (year % 4 ==0)) {
            System.out.println(year + " is a leap year.");
        } 
        else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}
 
=======
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if((year % 400 == 0)||(year % 100 != 0) && (year % 4 ==0)) {
            System.out.println(year + " is a leap year.");
        } 
        else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}
 
>>>>>>> dd560e230e3136adda2a1274efd27c96c72126a7
