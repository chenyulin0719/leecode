class TreeNode(object):

    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

    def add_left(self, val):
        self.left = TreeNode(val)

    def add_right(self, val):
        self.right = TreeNode(val)


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

    def __eq__(self, target_node):
        if self.val != target_node.val:
            return False

        a = self
        b = target_node

        while (a is not None) and (b is not None):
            if a.val != b.val:
                return False

            a = a.next
            b = b.next

        return (a is None) and (b is None)

    def __str__(self):
        a = self
        temp = []
        while a is not None:
            temp.append(a.val)
            a = a.next
        return ','.join(map(str, temp))

    def append(self, vals: list):
        tail = self
        for i in vals:
            temp = ListNode(i)
            tail.next = temp
            tail = temp
        return self
