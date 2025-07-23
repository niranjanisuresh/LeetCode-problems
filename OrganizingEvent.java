import java.util.Scanner;

public class OrganizingEvent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int total = n*(n-1)/2;
        System.out.println(total);
    }
}
