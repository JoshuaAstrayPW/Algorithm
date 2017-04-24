/**
 * Created by fangxu on 2017/4/23.
 */
import java.util.*;

public class Rotation {
    public boolean chkRotation(String A, int lena, String B, int lenb) {
       String a = A + A;
       String b = B + B;
       if(a.contains(B) || b.contains(A))
           return true;
       return false;
    }
}