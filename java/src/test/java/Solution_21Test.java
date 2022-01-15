import Utils.ListNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Solution_21Test {

  @Test
  public void mergeTwoLists() {
    Solution_21 instance = new Solution_21();
    ListNode list1 = new ListNode(1).stickyToTail(2).stickyToTail(4);
    ListNode list2 = new ListNode(1).stickyToTail(3).stickyToTail(4);
    ListNode expect = new ListNode(1).stickyToTail(1).stickyToTail(2).stickyToTail(3).stickyToTail(4).stickyToTail(4);

    assertTrue(expect.equals(instance.mergeTwoLists(list1, list2)));
  }
}