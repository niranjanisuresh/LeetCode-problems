import java.util.ArrayList;
import java.util.Collections;

public class PrintAllDivisors {
    public static void printAllDivisors(int n){
        ArrayList<Integer> largeDivisors = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i + " ");
                if(i!=n/i){
                    largeDivisors.add(n/i);
                }
            }
        }
        Collections.sort(largeDivisors);
        for(int i=0;i<largeDivisors.size();i++){
            System.out.print(largeDivisors.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        int n = 36;
        printAllDivisors(n);
    }
}
