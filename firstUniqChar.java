<<<<<<< HEAD
import java.util.HashMap;

public class firstUniqChar{
    public int firstUniq(String s) {
        int index =-1;

        HashMap<Character, Integer> Freq  = new HashMap<>();

        for(int i = 0 ; i  < s.length(); i++){
            char ch = s.charAt(i);
            int frequency = Freq.getOrDefault(ch,0);
            Freq.put(ch, frequency+1);
        }

        for(int i = 0; i < s.length(); i++){
            if(Freq.get(s.charAt(i)) == 1){
                index = i;
                break;
            }
        }
        return index;
    }
}

=======
import java.util.HashMap;

public class firstUniqChar{
    public int firstUniq(String s) {
        int index =-1;

        HashMap<Character, Integer> Freq  = new HashMap<>();

        for(int i = 0 ; i  < s.length(); i++){
            char ch = s.charAt(i);
            int frequency = Freq.getOrDefault(ch,0);
            Freq.put(ch, frequency+1);
        }

        for(int i = 0; i < s.length(); i++){
            if(Freq.get(s.charAt(i)) == 1){
                index = i;
                break;
            }
        }
        return index;
    }
}

>>>>>>> dd560e230e3136adda2a1274efd27c96c72126a7
