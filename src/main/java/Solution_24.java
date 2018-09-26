import Utils.ListNode;

public class Solution_24 {
  public ListNode swapPairs(ListNode head) {
    ListNode ans = new ListNode(Integer.MIN_VALUE);
    ans.next = head;
    ListNode indexNode = ans;
    ListNode tail;

    while (indexNode.next != null && indexNode.next.next != null) {
      tail = indexNode.next;
      indexNode.next = indexNode.next.next;
      tail.next = indexNode.next.next;
      indexNode.next.next = tail;
      indexNode = tail;
    }
    return ans.next;
  }
}
