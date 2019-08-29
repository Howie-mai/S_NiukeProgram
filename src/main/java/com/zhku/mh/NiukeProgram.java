package com.zhku.mh;

import com.zhku.mh.util.ListNode;
import com.zhku.mh.util.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

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
     * 用栈解决
     *
     * @return java.util.ArrayList<java.lang.Integer>
     * @Param [listNode]
     * @Author mh
     * @Date 2019/8/27
     */
    public ArrayList<Integer> Pragrom3_printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.empty()) {
            list.add(stack.pop());
        }
        return list;
    }

    /**
     * 3、
     * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
     * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
     *
     * @return TreeNode
     * @Param [pre, in]
     * @Author mh
     * @Date 2019/8/27
     */
    public TreeNode Program4_reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode treeNode = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return treeNode;
    }

    /**
     * @return com.zhku.mh.util.TreeNode
     * @Description: 根据根节点分为左子树和有子树遍历
     * @Param [pre, startPre, endPre, in, startIn, endIn]
     * @Author mh
     * @Date 2019/8/27
     */
    private static TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {
        if (startPre > endPre || startIn > endIn)
            return null;
        int root = pre[startPre]; // 根节点的值
        TreeNode treeNode = new TreeNode(root);
        for (int i = startIn; i <= endIn; i++) {
            if (in[i] == pre[startPre]) {
                treeNode.left = reConstructBinaryTree(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
                treeNode.right = reConstructBinaryTree(pre, i - startIn + startPre + 1, endPre, in, i + 1, endIn);
                break;
            }
        }
        return treeNode;
    }

    /**
     * @Description: 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
     * @Author mh
     * @Date 2019/8/27
     */
    public class Program_5 {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        public void push(int node) {
            stack1.push(node);
        }

        public int pop() {
            if (stack1.empty() && stack2.empty()) {
                throw new RuntimeException("为空");
            }
            if (stack2.empty()) {
                while (!stack1.empty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        char[] ctr = buf.readLine().toCharArray();
        Arrays.sort(ctr);
        ArrayList<Character> result = new ArrayList<Character>();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < ctr.length; i++) {
            if (map.isEmpty()) {
                result.add(ctr[i]);
                map.put(ctr[i], 1);
            } else {
                if (map.containsKey(ctr[i])) {
                    map.put(ctr[i], map.get(ctr[i]) + 1);
                } else {
                    result.add(ctr[i]);
                    map.put(ctr[i], 1);
                }
            }
//            if(i == ctr.length-2) break;
//            if(ctr[i] == ctr[i+1]){
//               i++;
//               count++;
//            }else{
//                map.put(ctr[i],count);
//                count = 0;
//            }
        }
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            String key = entry.getKey().toString();
//            String value = entry.getValue().toString();
//            System.out.print(key + value);
//        }
        for(int i = 0;i < result.size();i++){
            String key = result.get(i).toString();
            String value = map.get(result.get(i)).toString();
            System.out.print(key + value);
        }
    }

}
