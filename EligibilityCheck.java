import java.util.Scanner;

public class EligibilityCheck {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        double I = scan.nextDouble();
        boolean C= scan.nextBoolean();

        if(A>=21 && I<=300000 && C){
            System.out.println("You are eligible");
        }else{
            System.out.println("You are not eligible");
        }
    
    }
}
