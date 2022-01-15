class Solution(object):
    def countNodes(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """

        def height(root):
            """Count height of complete binary tree"""
            if root is None:
                return 0
            else:
                return 1 + height(root.left)

        if root is None:
            return 0
        if root.left is None:
            return 1
        elif height(root.left) == height(root.right):
            return (1 << (height(root) - 1)) + self.countNodes(root.right)
        elif height(root.left) > height(root.right):
            return (1 << (height(root) - 2)) + self.countNodes(root.left)
