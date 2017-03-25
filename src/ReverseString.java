/**
 * Created by fangxu on 2017/3/24.
 */
import java.util.*;

public class ReverseString {
    public String reverse(String iniString) {
       StringBuffer sb = new StringBuffer(iniString);
       return sb.reverse().toString();
    }
}