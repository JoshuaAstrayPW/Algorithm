/**
 * Created by fangxu on 2017/4/26.
 */
import java.util.Scanner;
public class ali2 {

    public static boolean match(char[] str, char[] pattern)

    {
        return isMatch(str, 0, pattern, 0);
    }

    public static boolean isMatch(char[] str, int start1, char[] pattern, int start2) {
        if (start1 == str.length && start2 == pattern.length) return true;
        if (start2 >= pattern.length) return false;

        if (start2 < pattern.length - 1) {
            if (pattern[start2 + 1] == '*') {
                if ((start1 < str.length) && (str[start1] == pattern[start2] || pattern[start2] == '.')) {
                    return isMatch(str, start1, pattern, start2 + 2) || isMatch(str, start1 + 1, pattern, start2 + 2) || isMatch(str, start1 + 1, pattern, start2);
                } else return isMatch(str, start1, pattern, start2 + 2);
            }
        }
        if (start1 == str.length) return false;
        if (str[start1] == pattern[start2] || pattern[start2] == '.')
            return isMatch(str, start1 + 1, pattern, start2 + 1);
        return false;
    }
    public static  void  main(String[] args){
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        char[] s1 = str1.toCharArray();
        char[] s2 = str1.toCharArray();
        if(match(s1,s2) == true)
            System.out.print(1);
        else
            System.out.print(0);

    }
}
