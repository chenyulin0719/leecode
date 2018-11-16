import Utils.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_61Test {

  @Test
  public void rotateRight() {
    Solution_61 instance = new Solution_61();
    int k1 = 2;
    ListNode input1 = new ListNode(1).stickyToTail(2).stickyToTail(3).stickyToTail(4).stickyToTail(5);
    ListNode expect1 = new ListNode(4).stickyToTail(5).stickyToTail(1).stickyToTail(2).stickyToTail(3);
    assertTrue(expect1.equals(instance.rotateRight(input1, k1)));

    int k2 = 4;
    ListNode input2 = new ListNode(0).stickyToTail(1).stickyToTail(2);
    ListNode expect2 = new ListNode(2).stickyToTail(0).stickyToTail(1);
    assertTrue(expect2.equals(instance.rotateRight(input2, k2)));

    int k3 = 0;
    ListNode input3 = new ListNode(1);
    ListNode expect3 = new ListNode(1);
    assertTrue(expect3.equals(instance.rotateRight(input3, k3)));
  }
}