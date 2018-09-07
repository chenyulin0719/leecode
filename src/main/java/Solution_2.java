import Utils.ListNode;

public class Solution_2 {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int v1;
    int v2;
    int carry = 0;
    int sum;
    int value;

    ListNode list1 = l1;
    ListNode list2 = l2;
    ListNode dummyHead = new ListNode(0);
    ListNode curNode = dummyHead;

    while (list1 != null || list2 != null) {

      v1 = (list1 == null) ? 0 : list1.val;
      v2 = (list2 == null) ? 0 : list2.val;

      sum = v1 + v2 + carry;
      carry = (sum > 9) ? 1 : 0;
      value = (sum > 9) ? sum - 10 : sum;

      curNode.next = new ListNode(value);
      curNode = curNode.next;

      list1 = (list1 != null && list1.next != null) ? list1.next : null;
      list2 = (list2 != null && list2.next != null) ? list2.next : null;

    }

    if (carry > 0) {
      curNode.next = new ListNode(carry);
    }

    return dummyHead.next;
  }

}
