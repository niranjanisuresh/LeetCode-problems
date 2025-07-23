
import java.util.Scanner;

public class ConFahToCel {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double fahrenhiet = scan.nextDouble();
        double celsius = (fahrenhiet-32)*5/9;
        System.out.printf("Equivalent temperature in Celius: %.2f",celsius);
    }
}
