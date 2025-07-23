import java.util.Scanner;

public class patternNestedLoop{
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();

    for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);

        for(int j=0;j<=i;j++){
            System.out.print(ch);
        }
        System.out.println(" ");
    }
}
}
