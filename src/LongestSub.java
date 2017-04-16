import java.util.HashMap;
import java.util.Scanner;
/**
 *  给定一个字符串，寻找这个字符串的最长不重复子串(子串里面没有重复字母)。
 *  例如：对于字符串“abcabcbb”，它的最长不重复子串是“abc”，长度为3；而对于字符串“bbbbb”，它的最长不重复子串是“b”，长度为1。
 输入
 abcabcbb
 输出
 abc

 样例输入
 bbbbb
 样例输出
 b
 */
public class LongestSub {
    static String calDuplicateString(String str) {
        if(str == null)
            return null;
        StringBuilder res = new StringBuilder();
        char [] c = str.toCharArray();
        HashMap<Character, Integer> charsIndex = new HashMap<Character, Integer>();
        int startIndex = -1, currentIndex = startIndex, maxLen = 0;
        for(int i = 0; i < c.length; i++) {
            if(charsIndex.containsKey(c[i])) {
                int a = charsIndex.get(c[i]);
                if(a > startIndex){
                    startIndex = a;
                }
            }
            if(i - startIndex > maxLen) {
                maxLen = i - startIndex;
                currentIndex = startIndex;
            }
            charsIndex.put(c[i], i);
        }
        for(int index =  currentIndex + 1; index < currentIndex + maxLen + 1; index++) {
            res.append(c[index]);
        }
        return res.toString();

    }
    public static void main(String[] argv){
        Scanner in = new Scanner(System.in);
        String res;

        String _str;
        try {
            _str = in.nextLine();
        } catch (Exception e) {
            _str = null;
        }
      res = calDuplicateString(_str);




        System.out.println(res);
    }
}
