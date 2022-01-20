# Definition for a binary tree node.
import math
from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:

        def inorder(root):
            # print(f'check: {root.val}')
            if not root:
                return True

            if not inorder(root.left):
                return False

            if self.prev >= root.val:
                return False

            self.prev = root.val

            return inorder(root.right)

        self.prev = -math.inf
        return inorder(root)

        #
        #     if root.left is None and root.right is None:
        #         return True
        #
        #     if root.left is None:
        #         return root.val < root.right.val and recursive(root.right)
        #
        #     if root.right is None:
        #         return root.val > root.left.val and recursive(root.left)
        #
        #     # print(f'root.left.val:{root.left.val}')
        #     # print(f'root.val: {root.val}')
        #     # print(f'root.right.val: {root.right.val}')
        #
        #     return root.left.val < root.val < root.right.val and recursive(root.left) and recursive(root.right)
        #
        # return recursive(root)
