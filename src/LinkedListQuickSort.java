/**
 * Created by fangxu on 2017/4/16.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LinkedListQuickSort {


/*请完成下面这个函数，实现题目要求的功能*/
/*当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ */
    /******************************开始写代码******************************/
    static void quickSortInputOutput(Node begin,Node end ) {


        if (begin == null || end == null || begin == end)
            return;

        Node first = begin;
        Node second = begin.next;
        int mid = begin.data;
        while (second != end.next && second != null) {
            if (second.data < mid) {
                first = first.next;
                if (first != second) {
                    int temp = first.data;
                    first.data = second.data;
                    second.data = temp;
                }
            }
            second = second.next;
        }
        if (begin != first) {
            int temp = begin.data;
            begin.data = first.data;
            first.data = temp;
        }

        quickSortInputOutput(begin, first);
        quickSortInputOutput(first.next, end);


    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        String _str;
        try {
            _str = in.nextLine();
        } catch (Exception e) {
            _str = null;
        }
        String[] s = _str.split(",");
        int[] a = new int[s.length];
        for(int i = 0; i < s.length; i++)
            a[i] = Integer.parseInt(s[i]);
        Node head = new Node(a[0],null);
        Node c = head;
        for(int i = 1; i < a.length; i++){
             Node temp = new Node(a[i], null);
             c.next = temp;
             c = temp;
        }
        Node p = head;
        while (p.next != null) {

            p = p.next;
        }
        Node begin = head;
        Node end = p;
        quickSortInputOutput(begin, end);
        StringBuilder sb = new StringBuilder();
        p = head;
        while (p != null) {
            if(p.next != null)
                System.out.print(p.data + ",");
            else
                System.out.print(p.data);


            p = p.next;
        }
    }
}

class Node {
    public int data;
    public Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class LinkList {
    public Node head;
    public Node tail;

    public LinkList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

}

