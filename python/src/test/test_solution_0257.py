import unittest


class Test(unittest.TestCase):

    def test_binaryTreePaths(self):
        from solution_0257 import Solution
        from utils import TreeNode

        solution = Solution()

        root1 = TreeNode(1, TreeNode("2"), TreeNode("3"))
        root1.left.right = TreeNode("5")

        root2 = TreeNode("1")

        self.assertListEqual(solution.binaryTreePaths(root1), ["1->2->5", "1->3"])
        self.assertListEqual(solution.binaryTreePaths(root2), ["1"])
