<<<<<<< HEAD
/** 
public class CountDigit {
    public int countDigit(int n) {
        if(n==0){
            return 1;
        }
        n = Math.abs(n);
        int count = 0;
        while(n>0){
            count++;
            n = n/10;
        }
        return count;
    }
}
**/
public class CountDigit {
    public int countDigit(int n) {
        if (n == 0) {
            return 1;
        }
        n = Math.abs(n);
        int count = 0;
        return (int) Math.floor(Math.log10(n)) + 1;
    }
=======
/** 
public class CountDigit {
    public int countDigit(int n) {
        if(n==0){
            return 1;
        }
        n = Math.abs(n);
        int count = 0;
        while(n>0){
            count++;
            n = n/10;
        }
        return count;
    }
}
**/
public class CountDigit {
    public int countDigit(int n) {
        if (n == 0) {
            return 1;
        }
        n = Math.abs(n);
        int count = 0;
        return (int) Math.floor(Math.log10(n)) + 1;
    }
>>>>>>> dd560e230e3136adda2a1274efd27c96c72126a7
}