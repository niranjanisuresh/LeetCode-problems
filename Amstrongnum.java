public class Amstrongnum {
    public boolean isArmstrong(int n) {
        int sum = 0;
        int original = n;
        while(n!=0){
            int lastDigit = n % 10;
            sum = sum + lastDigit*lastDigit*lastDigit;
            n = n / 10;
        }
        return original == sum;
    }
}

