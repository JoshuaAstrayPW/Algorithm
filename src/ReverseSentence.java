/**
 * Created by fangxu on 2017/3/13.
 */
public class ReverseSentence {
    public String ReverseSentence(String str) {
        if(str == null || str.trim().equals(""))
            return str;
        StringBuilder sb = new StringBuilder();
        String[] s = str.split(" ");
        int i ;
        for( i = s.length - 1; i > 0; i--)
            sb.append(s[i]+" ");

        sb.append(s[0]);

        return sb.toString();
    }
    public static void main(String[] argv){
        ReverseSentence r = new ReverseSentence();
        System.out.println(r.ReverseSentence("student. am i"));
        System.out.println(r.ReverseSentence(" "));
        System.out.println(r.ReverseSentence("student. am i"));
    }

}
