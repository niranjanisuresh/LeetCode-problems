import java.util.*;
public class HWIQues1{
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];  

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            b[i] = Integer.MAX_VALUE;
        }

        b[0] = 0; 

        for (int i = 0; i < n; i++) {
            if (i+1 <n && b[i+1] > b[i] + 1) {
                b[i+1] = b[i] + 1;
            }
            for (int j = i+1; j<n; j++) {
                if (a[j] % a[i] == 0) {
                    if (b[j]>b[i] + a[i]) {
                        b[j] = b[i] + a[i];
                        a[j]++; 
                 }
               }
            }
        }
        System.out.println(b[n-1]);
   }
}