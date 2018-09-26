import Utils.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_25Test {

  @Test
  public void reverseKGroup() {
    Solution_25 instance = new Solution_25();
    ListNode input1 = new ListNode(1).stickyToTail(2).stickyToTail(3).stickyToTail(4).stickyToTail(5);
    ListNode input2 = new ListNode(1).stickyToTail(2).stickyToTail(3).stickyToTail(4).stickyToTail(5);
    ListNode expect1 = new ListNode(2).stickyToTail(1).stickyToTail(4).stickyToTail(3).stickyToTail(5);
    ListNode expect2 = new ListNode(3).stickyToTail(2).stickyToTail(1).stickyToTail(4).stickyToTail(5);

    assertTrue(expect1.equals(instance.reverseKGroup(input1, 2)));
    assertTrue(expect2.equals(instance.reverseKGroup(input2, 3)));
  }
}