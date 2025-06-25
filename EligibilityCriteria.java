import java.util.Scanner;

public class EligibilityCriteria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A=scan.nextInt();
        double I;
        int C;
        if((A>=21)&&(A<=60)){
            I = scan.nextDouble();
            if(I>300000){
                C= scan.nextInt();
                if(C>=750 && C<=850){
                    System.out.println("EXCELLENT - ELIGIBLE");
                }
                else if(C>=700 && C<=749){
                    System.out.println("GOOD - ELIGIBLE");
                }
                else if(C>=650 && C<=699){
                    System.out.println("FAIR - ELIGIBLE");
                }
                else if(C>=550 && C<=649){
                    System.out.println("POOR - NOT ELIGIBLE");
                }
                else{
                    System.out.println("NOT APPLICABLE");
                }
            }
            else{
                System.out.println("NOT ELIGIBLE");
            }
        }
        else{
            System.out.println("NOT APPLICABLE");
        }
    }
}
