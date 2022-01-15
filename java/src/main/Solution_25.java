import Utils.ListNode;

public class Solution_25 {
  public ListNode reverseKGroup(ListNode head, int k) {
    if (k == 1) return head;
    ListNode dummyHead = new ListNode(Integer.MIN_VALUE);
    dummyHead.next = head;
    ListNode currentHead = dummyHead;

    while (hasMoreGroup(currentHead, k)) {
      ListNode reversedHead = null;
      ListNode tail = currentHead.next;
      ListNode current = currentHead;
      ListNode firstElement = current.next;
      for (int i = 0; i < k; i++) {
        current = tail;
        tail = tail.next;
        current.next = reversedHead;
        reversedHead = current;
      }
      currentHead.next = reversedHead;
      currentHead = firstElement;
      firstElement.next = tail;
    }
    return dummyHead.next;
  }

  private boolean hasMoreGroup(ListNode currentHead, int k) {
    for (int i = 0; i < k; i++) {
      if (currentHead.next == null) {
        return false;
      }
      currentHead = currentHead.next;
    }
    return true;
  }
}
