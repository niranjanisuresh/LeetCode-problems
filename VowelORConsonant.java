<<<<<<< HEAD
import java.util.*;


public class VowelORConsonant {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char ch=scan.next().toLowerCase().charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println("invalid error");
        }
        else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println(ch+"is an vowel");
        }
        else{
            System.out.println(ch+"is an consonant");
        }
        

    }
}
=======
import java.util.*;


public class VowelORConsonant {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char ch=scan.next().toLowerCase().charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println("invalid error");
        }
        else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println(ch+"is an vowel");
        }
        else{
            System.out.println(ch+"is an consonant");
        }
        

    }
}
>>>>>>> dd560e230e3136adda2a1274efd27c96c72126a7
