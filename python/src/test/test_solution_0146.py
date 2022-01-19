import unittest


class Test(unittest.TestCase):

    def test_wordBreak(self):
        from solution_0146 import LRUCache

        lRUCache = LRUCache(2)
        lRUCache.put(1, 1)
        lRUCache.put(2, 2)
        self.assertEqual(lRUCache.get(1), 1)

        lRUCache.put(3, 3)
        self.assertEqual(lRUCache.get(2), -1)

        lRUCache.put(4, 4)
        self.assertEqual(lRUCache.get(1), -1)
        self.assertEqual(lRUCache.get(3), 3)
        self.assertEqual(lRUCache.get(4), 4)
