import unittest


class Test(unittest.TestCase):

    def test_wordBreak(self):
        from solution_150 import Solution
        solution = Solution()
        tokens1 = ["2", "1", "+", "3", "*"]
        tokens2 = ["4", "13", "5", "/", "+"]
        tokens3 = ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
        self.assertEqual(solution.evalRPN(tokens1), 9)
        self.assertEqual(solution.evalRPN(tokens2), 6)
        self.assertEqual(solution.evalRPN(tokens3), 22)
