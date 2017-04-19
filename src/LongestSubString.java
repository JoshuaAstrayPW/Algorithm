import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * 有一组单词，请编写一个程序，在数组中找出由数组中字符串组成的最长的串A，即A是由其它单词组成的(可重复)最长的单词。
 给定一个string数组str，同时给定数组的大小n。请返回最长单词的长度，保证题意所述的最长单词存在。
 测试样例：
 ["a","b","c","ab","bc","abc"],6
 返回：3
 */
public class LongestSubString {
    public int getLongest(String[] str, int n) {
       if(str == null || str.length <= 0)
           return 0;
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        Map<String, Boolean> map = new HashMap<>();
        for(String k : str)
            map.put(k, null);
        for(String max : str)
            if(canBuildWord(max, true, map))
                return max.length();
        return  0;

       }
       public boolean canBuildWord(String str, boolean isOriginal, Map<String, Boolean> map){
           if(map.containsKey(str) && !isOriginal)
               return true;
           for(int i = 1; i < str.length(); i++){
               String left = str.substring(0, i);
               String right = str.substring(i);
               if(map.containsKey(left) && canBuildWord(right, false, map ))
                   return true;

           }
           return false;
       }


}





