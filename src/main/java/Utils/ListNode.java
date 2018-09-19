package Utils;

//Used by Solution_2
public class ListNode {
  public int val;
  public ListNode next;
  private ListNode last;

  public ListNode(int x) {
    val = x;
    this.next = null;
    this.last = this;
  }

  public ListNode stickyToHead(int x) {
    ListNode head = new ListNode(x);
    head.next = this;
    return head;
  }

  public ListNode stickyToTail(int x) {
    ListNode tail = new ListNode(x);
    last.next = tail;
    last = tail;
    return this;
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

  public void print() {
    ListNode t = this;
    while (t != null) {
      System.out.print("=>" + t.val);
      t = t.next;
    }
    System.out.println();
  }
}
