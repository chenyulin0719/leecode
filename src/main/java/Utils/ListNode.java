package Utils;

//Used by Solution_2
public class ListNode {
  public int val;
  public ListNode next;

  public ListNode(int x) {
    val = x;
    this.next = null;
  }

  public ListNode sticky(int x) {
    ListNode head = new ListNode(x);
    head.next = this;
    return head;
  }

  public boolean equals(ListNode target) {
    if (target == null) {
      System.out.println("target == null");
      return false;
    }

    if (val == target.val) {
      if (next == null) {
        return target.next == null;
      } else {
        return next.equals(target.next);
      }

    } else {
      return false;
    }

  }
}
