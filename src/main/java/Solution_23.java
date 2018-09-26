import Utils.ListNode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution_23 {

  public ListNode mergeKListsPriorityQueue(ListNode[] lists) {
    ListNode[] tempList = Arrays.copyOf(lists, lists.length);
    ListNode head = new ListNode(Integer.MIN_VALUE);
    ListNode tail = head;
    PriorityQueue<Map.Entry<ListNode, Integer>> pq = new PriorityQueue<>(50, Comparator.comparing(Map.Entry::getValue));

    for (ListNode node : lists) {
      if (node != null) {
        pq.add(new MyEntry<>(node, node.val));
      }
    }
    while (!pq.isEmpty()) {
      Map.Entry<ListNode, Integer> element = pq.poll();
      tail.next = new ListNode(element.getValue());
      tail = tail.next;
      ListNode nextNode = element.getKey().next;
      if (nextNode != null) {
        pq.add(new MyEntry<>(nextNode, nextNode.val));
      }
    }
    return head.next;
  }

  final class MyEntry<K, V> implements Map.Entry<K, V> {
    private final K key;
    private V value;

    MyEntry(K key, V value) {
      this.key = key;
      this.value = value;
    }

    @Override
    public K getKey() {
      return key;
    }

    @Override
    public V getValue() {
      return value;
    }

    @Override
    public V setValue(V value) {
      V old = this.value;
      this.value = value;
      return old;
    }
  }

  public ListNode mergeKListsBrute(ListNode[] lists) {
    ListNode[] tempList = Arrays.copyOf(lists, lists.length);
    ListNode head = new ListNode(Integer.MIN_VALUE);
    ListNode tail = head;

    while (true) {
      int min = Integer.MAX_VALUE;
      ListNode minNode = null;
      int index = -1;
      for (int i = 0; i < tempList.length; i++) {
        if (tempList[i] != null && tempList[i].val < min) {
          min = tempList[i].val;
          index = i;
        }
      }
      if (index == -1) {
        break;
      } else {
        tail.next = tempList[index];
        tail = tail.next;
        tempList[index] = tempList[index].next;
        tail.next = null;
      }
    }

    return head.next;
  }
}
