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
