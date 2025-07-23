import java.util.*;

public class LargestFromThree {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();

        int largest = Math.max(a,Math.max(b, c));
        System.out.println(largest);
    }
}
