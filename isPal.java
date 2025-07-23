<<<<<<< HEAD
public class isPal {
    public boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        int original = x;
        int reverse = 0;
        while(x!=0){
            int lastdigit = x%10;
            reverse = reverse * 10 + lastdigit;
            x = x / 10;
        }
        return original == reverse;
    }
}
=======
public class isPal {
    public boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        int original = x;
        int reverse = 0;
        while(x!=0){
            int lastdigit = x%10;
            reverse = reverse * 10 + lastdigit;
            x = x / 10;
        }
        return original == reverse;
    }
}
>>>>>>> dd560e230e3136adda2a1274efd27c96c72126a7
