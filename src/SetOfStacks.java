import java.util.ArrayList;

/**
 * 请实现一种数据结构SetOfStacks，由多个栈组成，其中每个栈的大小为size，
 * 当前一个栈填满时，新建一个栈。该数据结构应支持与普通栈相同的push和pop操作。
 * 给定一个操作序列int[][2] ope(C++为vector<vector<int>>)，
 * 每个操作的第一个数代表操作类型，若为1，则为push操作，后一个数为应push的数字；
 * 若为2，则为pop操作，后一个数无意义。请返回一个int[][](C++为vector<vector<int>>)，
 * 为完成所有操作后的SetOfStacks，顺序应为从下到上，默认初始的SetOfStacks为空。保证数据合法。
 */
public class SetOfStacks {
    public ArrayList<ArrayList<Integer>> setOfStacks(int[][] ope, int size) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> curArray = new ArrayList<>();
        list.add(curArray);
        for (int i = 0; i < ope.length; i++) {
            if (ope[i][0] == 1) {
                if (curArray.size() != size)
                    curArray.add(ope[i][1]);
                else {
                    curArray = new ArrayList<Integer>(size);
                    list.add(curArray);
                    curArray.add(ope[i][1]);
                }
            }
            if (ope[i][0] == 2) {
                if(curArray.size() != 0)
                    curArray.remove(curArray.size() - 1);
                else {
                    list.remove(list.size() - 1);
                    curArray = list.get(list.size() - 1);
                    curArray.remove(curArray.size() - 1);


                }
            }

        }
        return list;

    }
}
