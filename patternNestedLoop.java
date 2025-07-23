<<<<<<< HEAD
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
=======

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
>>>>>>> dd560e230e3136adda2a1274efd27c96c72126a7
