import unittest


class Test(unittest.TestCase):
    def test_countNodes(self):
        from solution_714 import Solution
        solution = Solution()
        price1 = [1, 3, 2, 8, 4, 9]

        fee1 = 2

        price2 = [1, 3, 7, 5, 10, 3]
        fee2 = 3
        self.assertEqual(solution.maxProfit(price1, fee1), 8)
        self.assertEqual(solution.maxProfit(price2, fee2), 6)
