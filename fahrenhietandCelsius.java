import java.util.Scanner;
public class fahrenhietandCelsius{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float fahrenhiet = scan.nextFloat();

        float celsius = (fahrenhiet-32)*5/9;
        System.out.printf(" Temperature in celsius: %.2f°C\n",celsius);
    }
}