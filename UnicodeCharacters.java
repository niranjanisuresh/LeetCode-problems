<<<<<<< HEAD

public class UnicodeCharacters {
    public static void main(String[] args) {
        String n="Hello123@!";
        int LowerCase = 0;
        int UpperCase = 0;
        int Digits = 0;
        int Symbols = 0;

        for(int i=0;i<n.length();i++){
            char ch =n.charAt(i);
            if(Character.isUpperCase(ch)){
                UpperCase++;
            }
            else if(Character.isLowerCase(ch)){
                LowerCase++;
            }
            else if(Character.isDigit(ch)){
                Digits++;
            }
            else {
                Symbols++;
            }  
        }
        System.out.println(UpperCase+" ");
        System.out.println(LowerCase+" ");
        System.out.println(Digits+" ");
        System.out.println(Symbols+" ");
    }
}
=======

public class UnicodeCharacters {
    public static void main(String[] args) {
        String n="Hello123@!";
        int LowerCase = 0;
        int UpperCase = 0;
        int Digits = 0;
        int Symbols = 0;

        for(int i=0;i<n.length();i++){
            char ch =n.charAt(i);
            if(Character.isUpperCase(ch)){
                UpperCase++;
            }
            else if(Character.isLowerCase(ch)){
                LowerCase++;
            }
            else if(Character.isDigit(ch)){
                Digits++;
            }
            else {
                Symbols++;
            }  
        }
        System.out.println(UpperCase+" ");
        System.out.println(LowerCase+" ");
        System.out.println(Digits+" ");
        System.out.println(Symbols+" ");
    }
}
>>>>>>> dd560e230e3136adda2a1274efd27c96c72126a7
