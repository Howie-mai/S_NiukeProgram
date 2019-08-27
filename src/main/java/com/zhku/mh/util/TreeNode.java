package com.zhku.mh.util;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName:
 * @description: Definition for binary tree
 * @author: mh
 * @create: 2019-08-27 14:07
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    /**
     * @return void
     * @Description: 前序遍历
     * @Param [node]
     * @Author mh
     * @Date 2019/8/27
     */
    public static void preOrderTraverse(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.val + " ");
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }

    /**
     * @return void
     * @Description: 中序遍历
     * @Param [node]
     * @Author mh
     * @Date 2019/8/27
     */
    public static void inOrderTraverse(TreeNode node) {
        if (node == null)
            return;
        inOrderTraverse(node.left);
        System.out.print(node.val + " ");
        inOrderTraverse(node.right);
    }

    /**
     * @return void
     * @Description: 后序遍历
     * @Param [node]
     * @Author mh
     * @Date 2019/8/27
     */
    public static void postOrderTraverse(TreeNode node) {
        if (node == null)
            return;
        postOrderTraverse(node.left);
        postOrderTraverse(node.right);
        System.out.print(node.val + " ");
    }
}
