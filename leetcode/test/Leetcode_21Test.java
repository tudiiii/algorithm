import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Leetcode_21Test {

    Leetcode_21 s = new Leetcode_21();

    @Test
    public void test(){
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode result = new ListNode(1,new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));

        Assert.assertEquals(s.mergeTwoLists(l1,l2),result);
    }

}