import unittest


class Test(unittest.TestCase):

    def test_numDecodings(self):
        from solution_091 import Solution
        solution = Solution()
        s1 = "12"
        s2 = "226"
        s3 = "06"

        self.assertEqual(2, solution.numDecodings(s1))
        self.assertEqual(3, solution.numDecodings(s2))
        self.assertEqual(0, solution.numDecodings(s3))
