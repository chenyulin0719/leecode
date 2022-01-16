class Solution:
    def numDecodings(self, s: str) -> int:
        num_1_digit_list = [str(i) for i in range(1, 10)]
        num_2_digit_list = [str(i) for i in range(10, 27)]

        dp_cache = {}

        def dp(s):
            if s in dp_cache:
                return dp_cache.get(s)

            if s == '0':
                return 0

            if s in num_1_digit_list or s == '':
                return 1

            if s[-1] != '0':  # 1 digit match
                if s[-2:] in num_2_digit_list:
                    decode_ways = dp(s[:-1]) + dp(s[:-2])
                else:
                    decode_ways = dp(s[:-1])
            else:
                if s[-2:] in num_2_digit_list:
                    decode_ways = dp(s[:-2])
                else:
                    decode_ways = 0
            dp_cache[s] = decode_ways
            return decode_ways

        return dp(s)
