import unittest


class Test(unittest.TestCase):

    def test_wordBreak(self):
        from solution_139 import Solution
        solution = Solution()
        s1 = "leetcode"
        word_dict1 = ["leet", "code"]

        s2 = "applepenapple"
        word_dict2 = ["apple", "pen"]

        s3 = "catsandog"
        word_dict3 = ["cats", "dog", "sand", "and", "cat"]

        self.assertTrue(solution.wordBreak(s1, word_dict1))
        self.assertTrue(solution.wordBreak(s2, word_dict2))
        self.assertFalse(solution.wordBreak(s3, word_dict3))
