package com.zhku.mh;

import com.zhku.mh.util.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName:NiukeProgram
 * @description TDOO
 * @author: mh
 * @create: 2019-08-27 12:22
 */
public class NiukeProgram {

    /**
     * 1、
     * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     *
     * @return boolean
     * @Param [target, array]
     * @Author mh
     * @Date 2019/8/27
     */
    public boolean Program1_Find(int target, int[][] array) {
        if (array.length == 0)
            return false;
        int rowCount = array[0].length - 1;
        int i = rowCount - 1;
        int j = 0;
        while (i >= 0 && j < array.length) {
            int temp = array[i][j];
            if (target > temp) j++;
            if (target < temp) i--;
            if (temp == target) return true;
        }
        return false;
    }

    /**
     * 2、
     * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
     * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     *
     * @return java.lang.String
     * @Param [str]
     * @Author mh
     * @Date 2019/8/27
     */
    public String Program2_replaceSpace(StringBuffer str) {
        String newStr1 = str.toString();
        return newStr1.replace(" ", "%20");
    }

    /**
     * 3、
     * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList
     *
     * @return java.util.ArrayList<java.lang.Integer>
     * @Param [listNode]
     * @Author mh
     * @Date 2019/8/27
     */
    public ArrayList<Integer> Pragrom3_printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Stack<Integer> stack=new Stack<Integer>();
        while (listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        while (!stack.empty()){
            list.add(stack.pop());
        }
        return list;
    }
}
