import Utils.ListNode;

public class Solution_21 {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode result = new ListNode(-1);
    ListNode c = result;
    while (l1 != null && l2 != null) {
      if (l1.val <= l2.val) {
        c.next = l1;
        c = l1;
        l1 = l1.next;
      } else {
        c.next = l2;
        c = l2;
        l2 = l2.next;
      }
    }
    if (l1 == null) c.next = l2;
    if (l2 == null) c.next = l1;

    return result.next;
  }
}
