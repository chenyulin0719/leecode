import unittest


class Test(unittest.TestCase):
    def test_countNodes(self):
        from solution_0504 import Solution
        solution = Solution()

        self.assertEqual("202", solution.convertToBase7(100))
        self.assertEqual("-10", solution.convertToBase7(-7))
        self.assertEqual("1", solution.convertToBase7(1))
