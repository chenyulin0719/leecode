import unittest


class Test(unittest.TestCase):

    def test_isValidBST(self):
        from solution_0098 import Solution
        from utils import TreeNode

        solution = Solution()

        root1 = TreeNode(2, TreeNode(1), TreeNode(3))
        root2 = TreeNode(5, TreeNode(1), TreeNode(4))
        root2.right.left = TreeNode(3)
        root2.right.right = TreeNode(5)

        root3 = TreeNode(5, TreeNode(4), TreeNode(6))
        root3.right.left = TreeNode(3)
        root3.right.left = TreeNode(7)

        self.assertTrue(solution.isValidBST(root1))
        self.assertFalse(solution.isValidBST(root2))
        self.assertFalse(solution.isValidBST(root3))
