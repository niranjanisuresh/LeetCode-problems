<<<<<<< HEAD
public class palindromeStringCheck {
    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;

        while(left < right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "level";
        if(isPalindrome(str)){
            System.out.println(str+" is a palindrome");
        }
        else{
            System.out.println(str+" not a palindrome");
        }
    }
}
=======
public class palindromeStringCheck {
    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;

        while(left < right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "level";
        if(isPalindrome(str)){
            System.out.println(str+" is a palindrome");
        }
        else{
            System.out.println(str+" not a palindrome");
        }
    }
}
>>>>>>> dd560e230e3136adda2a1274efd27c96c72126a7
