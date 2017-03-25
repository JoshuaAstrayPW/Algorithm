import java.util.HashMap;

/**
 * Created by fangxu on 2017/3/24.
 */
public class SameString {
    public boolean checkSam(String stringA, String stringB) {
        HashMap<Character,Integer> map = new HashMap<>(256);
        for(int i = 0; i < stringA.length(); i++)
            map.put(stringA.charAt(i),1);
        for(int i = 0; i < stringB.length(); i++)
            if(map.containsKey(stringB.charAt(i)))
                 map.put(stringB.charAt(i),2);
            else
                map.put(stringB.charAt(i),1);
        for(char c : map.keySet())
            if(map.get(c) == 1)
                return false;
        return true;

    }
}
