<<<<<<< HEAD
import java.util.Scanner;
public class GradingSystem{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks (0 to 100): ");
        int marks = scanner.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Grade: B");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Grade: C");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Grade: D");
        } else if (marks >= 0 && marks < 60) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid marks entered. Please enter a value between 0 and 100.");
        }

        scanner.close();
    }
}
 
=======
import java.util.Scanner;
public class GradingSystem{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks (0 to 100): ");
        int marks = scanner.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Grade: B");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Grade: C");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Grade: D");
        } else if (marks >= 0 && marks < 60) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid marks entered. Please enter a value between 0 and 100.");
        }

        scanner.close();
    }
}
 
>>>>>>> dd560e230e3136adda2a1274efd27c96c72126a7
