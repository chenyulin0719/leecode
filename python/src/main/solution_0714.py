from typing import Tuple


class Solution(object):
    def maxProfit(self, prices, fee):
        """
        :type prices: List[int]
        :type fee: int
        :rtype: int
        """

        max_profit_dict = {}

        def dp(day: int) -> Tuple[int, int]:
            """
            Tuple keep 2 state of the day:
                0. max profit in hold state,
                1. max profit in empty state)
            """
            if day == 0:
                return -prices[0], 0

            if (day - 1) not in max_profit_dict:
                pre_hold_profit, pre_empty_profit = dp(day - 1)
            else:
                pre_hold_profit, pre_empty_profit = max_prfit_dict.get(day - 1)

            today_profit = (max(pre_hold_profit, pre_empty_profit - prices[day]),  # hold state
                            max(pre_empty_profit, pre_hold_profit + prices[day] - fee))  # empty_state
            max_profit_dict[day] = today_profit
            return today_profit

        return dp(len(prices) - 1)[1]
