import unittest


class Test(unittest.TestCase):

    def test_isValidBST(self):
        from solution_0148 import Solution
        from utils import ListNode

        solution = Solution()
        head1 = ListNode(4).append([2, 1, 3])
        expect1 = ListNode(1).append([2, 3, 4])

        head2 = ListNode(-1).append([5, 3, 4, 0])
        expect2 = ListNode(-1).append([0, 3, 4, 5])

        self.assertTrue(solution.sortList(head1) == expect1)
        self.assertEqual(solution.sortList(head2), expect2)
#