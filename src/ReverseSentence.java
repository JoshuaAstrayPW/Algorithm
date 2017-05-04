/**
 * 对于一个字符串，请设计一个算法，只在字符串的单词间做逆序调整，也就是说，字符串由一些由空格分隔的部分组成，你需要将这些部分逆序。

 给定一个原字符串A和他的长度，请返回逆序后的字符串。

 测试样例：
 "dog loves pig",13
 返回："pig loves dog"
 */
public class ReverseSentence {
    public String ReverseSentence(String str) {
        //直接逆序
        /*if(str == null || str.trim().equals(""))
            return str;
        StringBuilder sb = new StringBuilder();
        String[] s = str.split(" ");
        int i ;
        for( i = s.length - 1; i > 0; i--)
            sb.append(s[i]+" ");

        sb.append(s[0]);

        return sb.toString();*/
        //先整体逆序再局部逆序
        char[] c = str.toCharArray();
        int index = 0;
        int end = c.length - 1;
        reverse(c, index, c.length - 1);
        for(int i = 0; i < str.length(); i++){
            if(c[i] == ' '){
                end = i - 1;
                reverse(c, index, end);
                index = i + 1;
            }
            if(i == str.length() - 1){
                end = i;
                reverse(c, index, end);
            }

        }
        return String.valueOf(c);


    }
    public void reverse(char[] a, int index, int end){
        while (index < end){
            char tmp = a[index];
            a[index] = a[end];
            a[end] = tmp;
            index ++;
            end --;
        }


    }

    public static void main(String[] argv){
        ReverseSentence r = new ReverseSentence();
        System.out.println(r.ReverseSentence("student. am i"));
        System.out.println(r.ReverseSentence(" "));
        System.out.println(r.ReverseSentence("student. am i"));
    }

}
