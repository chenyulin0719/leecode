from functools import cache
from typing import List


class Solution:
    def canPartition(self, nums: List[int]) -> bool:
        if len(nums) == 1:
            return False

        total = sum(nums)

        if total & 1 == 1:
            return False

        # Find any subset of nums, find out 1/2 sum sums.

        @cache
        def df(index, target):
            if index < 0 or target < 0:
                return False
            if target == 0:
                return True

            return df(index - 1, target) or df(index - 1, target - nums[index])

        return df(len(nums) - 1, total / 2)
