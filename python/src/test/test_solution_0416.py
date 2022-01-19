import unittest


class Test(unittest.TestCase):

    def test_canFinish(self):
        from solution_0416 import Solution
        solution = Solution()
        nums1 = [1, 5, 11, 5]
        nums2 = [1, 2, 3, 5]
        nums3 = [88, 29, 42, 97, 15, 74, 16, 52, 59, 28, 86, 35, 50, 99, 50, 94, 46, 74, 16, 94, 52, 24, 90, 60, 37, 68,
                 85, 74, 96, 22, 16, 50, 11, 70, 39, 68, 97, 11, 46, 27, 44, 78, 35, 26, 84, 18, 93, 77, 98, 47, 20, 74,
                 100, 95, 64, 75, 69, 43, 16, 20, 79, 30, 45, 9, 69, 9, 74, 98, 16, 6, 13, 72, 53, 61, 70, 71, 58, 80,
                 64, 21, 14, 27, 1, 45, 75, 28, 33, 5, 45, 89, 99, 54, 83, 58, 96, 19, 25, 15, 48]

        self.assertTrue(solution.canPartition(nums1))
        self.assertFalse(solution.canPartition(nums2))
        self.assertTrue(solution.canPartition(nums3))
