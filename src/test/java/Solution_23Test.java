import Utils.ListNode;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Solution_23Test {
  private ListNode[] input = {
          new ListNode(1).stickyToTail(4).stickyToTail(5),
          new ListNode(1).stickyToTail(3).stickyToTail(4),
          new ListNode(2).stickyToTail(6)};
  private ListNode expect = new ListNode(1).stickyToTail(1).stickyToTail(2).stickyToTail(3)
          .stickyToTail(4).stickyToTail(4).stickyToTail(5).stickyToTail(6);

  @Test
  public void mergeKListsPriorityQueue() {
    Solution_23 instance = new Solution_23();
    assertTrue(expect.equals(instance.mergeKListsPriorityQueue(input)));
  }


  @Test
  public void mergeKListsBrute() {
    Solution_23 instance = new Solution_23();
    assertTrue(expect.equals(instance.mergeKListsBrute(input)));
  }
}