public class Solution_2 implements Solution {

  public void solve() {
    System.out.println("Problem 2:");

    ListNode list1 = new ListNode(3).sticky(4).sticky(2).sticky(2);
    ListNode list2 = new ListNode(4).sticky(6).sticky(5);

    check(list1);
    check(list2);

    check(addTwoNumbers(list1, list2));

  }

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

  private class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }

    ListNode sticky(int x) {
      ListNode head = new ListNode(x);
      head.next = this;
      return head;
    }

  }

  private void check(ListNode listNode) {
    if (listNode == null) {
      throw new IllegalArgumentException("Null list.");
    }
    System.out.print("List values:");
    do {
      System.out.print(listNode.val + " ");
      listNode = listNode.next;
    } while (listNode != null);
    System.out.println();
  }
}
