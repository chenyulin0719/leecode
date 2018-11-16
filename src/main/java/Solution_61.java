import Utils.ListNode;

public class Solution_61 {
  public ListNode rotateRight(ListNode head, int k) {
    if (head == null || k == 0)
      return head;

    int n = 0;
    ListNode countIndex = head;
    while (countIndex != null) {
      n++;
      countIndex = countIndex.next;
    }
    int offset = k % n;
    ListNode tempIndex = head;
    ListNode resultHead = head;
    ListNode tail = null;
    for (int i = 1; i <= n; i++) {
      if (i == (n - offset + 1)) {
        resultHead = tempIndex;
      }
      if (i == (n - offset))
        tail = tempIndex;
      if (i == n)
        tempIndex.next = head;
      else
        tempIndex = tempIndex.next;
    }
    tail.next = null;
    return resultHead;
  }
}