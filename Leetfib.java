public class Leetfib {
    public int fib(int n) {
        int first = 0;
        int second = 1;
        int next  = 0;

        for(int i = 1 ; i<n ; i++){            
            next = first + second ;
            first = second ;
            second = next;
        }
       return next;
    }   
}

