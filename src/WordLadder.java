import javax.print.DocFlavor;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;




/**
 * Created by fangxu on 2017/4/1.
 *有一个单词列表，一个初始单词和一个最终单词，初始单词需要通过单词列表逐步变换到最终单词，求变换所需的最短变换路径长度。
 变换规则：每次只能变动1个字母（不可交换位置，如：从abc变成cba属于变动了2个字母），每次变换只能从单词列表中选取。
 例如：初始单词hot，最终单词dog，单词列表[got, dot, god, dog, lot, log]，最短变换路径为[hot,dot,dog]，最短变换路径长度为3。
 注：单词列表中包含最终单词，不包含初始单词；列表中每一项单词长度与初始单词、最终单词相同；列表中单词不重复；所有字母均为小写。

 输入
 输入数据有三行，第一行为初始单词；第二行为最终单词；第三行为单词列表，单词和单词之间以空格分割。

 输出
 最短变换路径长度。


 样例输入
 hot
 dog
 got dot god dog lot log

 样例输出
 3

 Hint
 寻找最短路径相关算法。

 * */
public class WordLadder {
    public static void main(String[] argv){
        Scanner in = new Scanner(System.in);
        String start = in.next();
        String end = in.next();
        HashSet<String> set = new HashSet<>();

        while(in.hasNext()){
             set.add(in.next());
    }
    System.out.println(ladderLength(start, end, set));
}


    public static int ladderLength(String start, String end, Set<String> dict)
    {
        // write your code here
        if (start == null || end == null
                || start.length() == 0
                || end.length() == 0
                || start.length() != end.length())
        {
            return 0;
        }
        LinkedList<String> queue = new LinkedList<String>();
        HashSet<String> visit = new HashSet<String>();
        int level = 1;
        int lastNum = 1;
        int curNum = 0;
        queue.offer(start);
        visit.add(start);
        while (!queue.isEmpty())
        {
            String cur = queue.poll();
            lastNum--;
            for (int i = 0; i < cur.length(); i++)
            {
                char[] charCur = cur.toCharArray();
                for (char c = 'a'; c <= 'z'; c++)
                {
                    charCur[i] = c;
                    String temp = new String(charCur);
                    if (temp.equals(end))
                    {
                        return level + 1;
                    }
                    if (dict.contains(temp) && !visit.contains(temp))
                    {
                        curNum++;
                        queue.offer(temp);
                        visit.add(temp);
                    }
                }
            }
            if (lastNum == 0)
            {
                lastNum = curNum;
                curNum = 0;
                level++;
            }
        }
        return 0;
    }
}
