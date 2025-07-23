<<<<<<< HEAD
import java.util.Scanner;

public class GridStar {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();

       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print("*");
        }
        System.out.println(" ");
       }
    }
}
=======

import java.util.Scanner;

public class GridStar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=0 ; i<=n ; i++){
            for(int j=0;j<=n;j++){
                System.out.print("*");
               
            }
            System.out.println(" ");
        }
    }
}
>>>>>>> dd560e230e3136adda2a1274efd27c96c72126a7
