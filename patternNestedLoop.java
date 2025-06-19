
import java.util.Scanner;


public class patternNestedLoop{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n=scan.nextLine();

        for(int i=0;i<n.length();i++){
            char ch = n.charAt(i);

            for(int j=0; j<=i;j++){
                System.out.print(ch);

            }
            System.out.print(" ");
        }
    }
}
