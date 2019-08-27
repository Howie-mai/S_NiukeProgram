import com.zhku.mh.NiukeProgram;
import com.zhku.mh.util.ListNode;
import org.junit.Test;

import java.util.ArrayList;

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
    public void TestProgram2(){
        StringBuffer str=new StringBuffer("W e Ar e Ha p py");
        System.out.println(niukeProgram.Program2_replaceSpace(str));
    }

    @Test
    public void TestProgram3(){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        ListNode t=head.next;
        for(int i=3;i<10;i++){
            t.next=new ListNode(i);
            t=t.next;
        }
        System.out.println("头部节点："+head.val);
        ListNode.printListNode(head);
        System.out.println(" ");
        ArrayList<Integer> list=niukeProgram.Pragrom3_printListFromTailToHead(head);
        System.out.println("列表："+"\n"+list);
    }
}
