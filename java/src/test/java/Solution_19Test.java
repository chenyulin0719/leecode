import Utils.ListNode;
import org.junit.Test;
import org.w3c.dom.NodeList;

import java.util.List;

import static org.junit.Assert.*;

public class Solution_19Test {

  @Test
  public void removeNthFromEnd() {
    Solution_19 instance = new Solution_19();
    ListNode input = new ListNode(5).stickyToHead(4).stickyToHead(3).stickyToHead(2).stickyToHead(1);
    ListNode expect1 = new ListNode(5).stickyToHead(3).stickyToHead(2).stickyToHead(1);
    ListNode expect2 = new ListNode(5).stickyToHead(2).stickyToHead(1);

    assertTrue(expect1.equals(instance.removeNthFromEnd(input, 2)));
    assertTrue(expect2.equals(instance.removeNthFromEnd(input, 2)));
  }
}