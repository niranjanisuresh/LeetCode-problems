public class PrintallDivisors {
    public static void printDivisors(int n) {
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int n = 36; // Example number
        printDivisors(n);
    }
}
