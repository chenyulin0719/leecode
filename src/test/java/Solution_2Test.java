import Utils.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_2Test {

  @Test
  public void testAddTwoNumbers() {
    Solution_2 instance = new Solution_2();
    ListNode list1 = new ListNode(3).sticky(4).sticky(2);
    ListNode list2 = new ListNode(4).sticky(6).sticky(5);

    ListNode list3 = new ListNode(8).sticky(0).sticky(7);
    boolean result = list3.equals(instance.addTwoNumbers(list1, list2));
    assertTrue(result);

  }

}