public class fibonacciNumber {
    public static void main(String[] args) {

        int first = 0;
        int second = 1;
        int sum;
        int n=10;

        for(int i=1;i<=n; i++){
            System.out.println(first);

            int next = first + second;
            first = second ;
            second = next;

        }
    }
}
