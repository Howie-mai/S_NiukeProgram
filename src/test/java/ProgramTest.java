import com.zhku.mh.NiukeProgram;
import com.zhku.mh.util.ListNode;
import com.zhku.mh.util.TreeNode;
import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ClassName:
 * @description TDOO
 * @author: mh
 * @create: 2019-08-27 12:32
 */
public class ProgramTest {
    NiukeProgram niukeProgram = new NiukeProgram();

    @Test
    public void TestProgram1() {
        int[][] array = {{1, 2, 5, 6}, {2, 6, 7, 9}};
        niukeProgram.Program1_Find(7, array);
    }

    @Test
    public void TestProgram2() {
        StringBuffer str = new StringBuffer("W e Ar e Ha p py");
        System.out.println(niukeProgram.Program2_replaceSpace(str));
    }

    @Test
    public void TestProgram3() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode t = head.next;
        for (int i = 3; i < 10; i++) {
            t.next = new ListNode(i);
            t = t.next;
        }
        System.out.println("头部节点：" + head.val);
        ListNode.printListNode(head);
        System.out.println(" ");
        ArrayList<Integer> list = niukeProgram.Pragrom3_printListFromTailToHead(head);
        System.out.println("列表：" + "\n" + list);
    }

    @Test
    public void TestProgram4() {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode treeNode = niukeProgram.Program4_reConstructBinaryTree(pre, in);
        TreeNode.preOrderTraverse(treeNode);
        System.out.println(" ");
        TreeNode.inOrderTraverse(treeNode);
        System.out.println(" ");
        TreeNode.postOrderTraverse(treeNode);
        System.out.println(" ");
    }

    @Test
    public void TestProgram5() {
        NiukeProgram.Program_5 program5 = new NiukeProgram().new Program_5();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("操作");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    flag = false;
                    System.out.println("===结束");
                    break;
                case 2:
                    System.out.println("请输入数字");
                    program5.push(sc.nextInt());
                    System.out.println("已入栈");
                    break;
                case 3:
                    System.out.println("===出栈");
                    System.out.println(program5.pop());
                    break;
            }
        }
    }
}
