import Utils.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_24Test {

  @Test
  public void swapPairs() {
    Solution_24 instance = new Solution_24();
    ListNode input = new ListNode(1).stickyToTail(2).stickyToTail(3).stickyToTail(4);
    ListNode expect = new ListNode(2).stickyToTail(1).stickyToTail(4).stickyToTail(3);
    assertTrue(expect.equals(instance.swapPairs(input)));
  }
}