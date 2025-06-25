import java.util.Scanner;

public class SuperMarketEmployee {
   public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

       char P = scan.next().charAt(0);
       double T = scan.nextDouble();
       double G;
       if(P=='A'){
            G=0.0;
       }
       else if(P=='B'){
        G = 0.02;
       }
       else if(P=='C'){
        G = 0.05;
       }
       else if(P=='D'){
        G=0.12;
       }
       else if(P=='E'){
        G=0.18;
       }
       else if(P=='F'){
        G=0.28;
       }
       else{
        System.out.println("Invalid choice");
        return;
       }
       double finalAmount = T-(T*G);
       System.out.printf("%.2f",finalAmount);

   } 
}
