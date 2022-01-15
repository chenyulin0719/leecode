import Utils.ListNode;

public class Solution_19 {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    if (head == null) {
      throw new RuntimeException("head can't be null.");
    }
    ListNode t = head;
    int fromEnd = 1;
    ListNode fromEndNode = head;
    while (t.next != null) {
      if (fromEnd <= n) {
        fromEnd++;
      } else {
        fromEndNode = fromEndNode.next;
      }
      t = t.next;
    }

    if (fromEnd < n) {
      throw new RuntimeException("Can't delete n th node from end.");
    } else if (fromEnd == n) {
      return head.next;
    } else {
      fromEndNode.next = fromEndNode.next.next;
    }
    return head;
  }
}
