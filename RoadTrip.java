import java.util.*;

public class RoadTrip {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int M =scan.nextInt();
        int G = scan.nextInt();
        Double A = scan.nextDouble();
        int P = scan.nextInt();
        int T = scan.nextInt();
        
        double totalCost =(((M / A )*G)+P)+T;
        System.out.printf("%.2f",totalCost);
    }
}
