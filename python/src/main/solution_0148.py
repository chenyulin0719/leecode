=from typing import Optional
from utils import ListNode


class Solution:

    def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # merge sort
        # sort[4,2,1,3]
        # merge(sort[4,2], sort[1,3])
        # merge(merge(sort[4],sort[2]) ,  merge(sort[1], sort[3]))
        # merge([2,4], [1,3])
        # [1,2,3,4]

        if head is None or head.next is None:
            return head

        fast = head
        slow = head
        pre = None

        while fast is not None and fast.next is not None:
            fast = fast.next.next
            pre = slow
            slow = slow.next

        left = head
        right = slow
        if pre is not None:
            pre.next = None

        def merge(l1, l2):
            if l1 is None and l2 is None:
                return None

            temp_head = ListNode(0)
            cursor = temp_head
            while l1 or l2:
                if l1 is None:
                    cursor.next = l2
                    break
                if l2 is None:
                    cursor.next = l1
                    break

                if l1.val < l2.val:
                    cursor.next = l1
                    l1 = l1.next
                    cursor = cursor.next
                else:
                    cursor.next = l2
                    l2 = l2.next
                    cursor = cursor.next
            return temp_head.next

        return merge(self.sortList(left), self.sortList(right))
