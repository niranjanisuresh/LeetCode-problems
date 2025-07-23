<<<<<<< HEAD
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

=======
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

>>>>>>> dd560e230e3136adda2a1274efd27c96c72126a7
