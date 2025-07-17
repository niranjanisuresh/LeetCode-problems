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

