<<<<<<< HEAD
public class Reverse {
    
    public int reverse(int x) {
        
        int reverse = 0;
        while(x!=0){
            int lastdigit = x % 10;
            x = x / 10;
            reverse = reverse * 10 + lastdigit;
        }
        return reverse;
    }
}

=======
public class Reverse {
    
    public int reverse(int x) {
        
        int reverse = 0;
        while(x!=0){
            int lastdigit = x % 10;
            x = x / 10;
            reverse = reverse * 10 + lastdigit;
        }
        return reverse;
    }
}

>>>>>>> dd560e230e3136adda2a1274efd27c96c72126a7
