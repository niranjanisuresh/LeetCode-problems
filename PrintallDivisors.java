public class PrintallDivisors {
    public static void printDivisors(long n) {
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        long n = 8; // Example number
        printDivisors(n);
    }
}
