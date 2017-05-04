/**
 * 对于一个字符串，请设计一个算法，将字符串的长度为len的前缀平移到字符串的最后。

 给定一个字符串A和它的长度，同时给定len，请返回平移后的字符串。

 测试样例：
 "ABCDE",5,3
 返回："DEABC"
 */

//先局部翻转再整体翻转
public class StringTranslation {
    public String Translation(String A, int n, int len) {
       char[] c = A.toCharArray();
       int index = 0;
       int end = n - 1;
       reverse(c, index, len - 1);
       reverse(c, len, end);
       reverse(c, index, end);
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
}
