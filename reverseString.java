<<<<<<< HEAD
import java.util.Scanner;

public class reverseString{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        char[] ch = input.toCharArray();
        int start = 0;
        int end = ch.length-1;

        while(start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            
            start++;
            end--;
        }
        String reversed = new String(ch);
        System.out.println(reversed+" ");
    }
=======
import java.util.Scanner;

public class reverseString{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        char[] ch = input.toCharArray();
        int start = 0;
        int end = ch.length-1;

        while(start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            
            start++;
            end--;
        }
        String reversed = new String(ch);
        System.out.println(reversed+" ");
    }
>>>>>>> dd560e230e3136adda2a1274efd27c96c72126a7
}