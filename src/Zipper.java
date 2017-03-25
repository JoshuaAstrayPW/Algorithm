/**
 * 利用字符重复出现的次数，编写一个方法，实现基本的字符串压缩功能。
 * 比如，字符串“aabcccccaaa”经压缩会变成“a2b1c5a3”。
 * 若压缩后的字符串没有变短，则返回原先的字符串。
 *给定一个string iniString为待压缩的串(长度小于等于10000)，
 * 保证串内字符均由大小写英文字母组成，返回一个string，为所求的压缩后或未变化的串。
 *测试样例
 *"aabcccccaaa"
 *返回："a2b1c5a3"
 */
public class Zipper {
    public String zipString(String iniString) {
       StringBuffer sb = new StringBuffer();
       int k = 1;
       for(int i = 0; i < iniString.length() - 1; i++){
           if(iniString.charAt(i) == iniString.charAt(i+1))
               k++;
           else {
               sb.append(iniString.charAt(i));
               sb.append(k);
               k = 1;
           }

       }
        sb.append(iniString.charAt(iniString.length() - 1));
        sb.append(k);
        if(sb.length() > iniString.length())
            return iniString;
       return sb.toString();
    }
    public static void main(String[] argv){
        Zipper z = new Zipper();
        String a = "aabcccccaaa";
        System.out.println(z.zipString(a));

    }
}
