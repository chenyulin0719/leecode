import unittest


class Test(unittest.TestCase):

    def test_canFinish(self):
        from solution_207 import Solution
        solution = Solution()
        numCourses1 = 2
        prerequisites1 = [[1, 0]]

        numCourses2 = 2
        prerequisites2 = [[1, 0], [0, 1]]

        numCourses3 = 1
        prerequisites3 = []

        self.assertTrue(solution.canFinish(numCourses1, prerequisites1))
        self.assertFalse(solution.canFinish(numCourses2, prerequisites2))
        self.assertTrue(solution.canFinish(numCourses3, prerequisites3))
