import java.util.HashMap;

/**
 * 对于两个字符串A和B，如果A和B中出现的字符种类相同且每种字符出现的次数相同，则A和B互为变形词，请设计一个高效算法，检查两给定串是否互为变形词。

 给定两个字符串A和B及他们的长度，请返回一个bool值，代表他们是否互为变形词。

 测试样例：
 "abc",3,"bca",3
 返回：true
 */

public class Transform {
        public boolean chkTransform(String A, int lena, String B, int lenb) {
            HashMap<Character,Integer> mapA = new HashMap<>();
            HashMap<Character,Integer> mapB = new HashMap<>();
            for(int i = 0; i < lena; i++){
                char c = A.charAt(i);
                if(mapA.get(c) == null)
                    mapA.put(c, 1);
                else
                    mapA.put(c, mapA.get(c) + 1);
            }
            for(int i = 0; i < lenb; i++){
                char c = B.charAt(i);
                if(mapB.get(c) == null)
                    mapB.put(c, 1);
                else
                    mapB.put(c, mapB.get(c) + 1);
            }
            if(mapA.size() != mapB.size())
                return false;
            else {
                for(char k : mapA.keySet()){
                    if(mapA.get(k) != mapB.get(k))
                        return false;
                }


            }
            return true;
        }
    }