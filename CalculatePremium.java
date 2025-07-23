import java.util.Scanner;

public class CalculatePremium {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char h = scan.next().charAt(0);
        char l = scan.next().charAt(0);
        char g = scan.next().charAt(0);
        int a = scan.nextInt();

        if(a>=25 && a<=35 && g=='m' && h=='e' && l=='c'){
            System.out.println("The Premium Is Rs.4 Per Thousand And His Policy Cannot Exceed Rs.2 Lakhs");
        }
        else if(g=='f' && a>=25 && a<=35 && l=='c'&&h=='e'){
            System.out.println("The Premium is Rs.3 Per Thousand And Policy Cannot Exceed Rs.1 Lakhs");
        }
        else if( h=='p'&& a>=25 && a<=35 && g=='m'&&l=='v'){
            System.out.println("The Premium is Rs.6 Per Thousand And Cannot Exceed Rs,10,000");
        }
        else{
            System.out.println("Not Insured");
        }
    }
}
