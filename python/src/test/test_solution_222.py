import unittest


class Test(unittest.TestCase):

    def test_countNodes(self):
        from solution_222 import Solution
        from utils import TreeNode
        solution = Solution()
        root = TreeNode(1, TreeNode(2), TreeNode(3))
        root.left.add_left(4)
        root.left.add_right(5)
        root.right.add_left(6)

        self.assertEqual(solution.countNodes(root), 6)
