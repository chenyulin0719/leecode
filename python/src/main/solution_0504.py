class Solution:
    def convertToBase7(self, num: int) -> str:
        if num < 0:
            return "-" + self.convertToBase7(-num)
        if num < 7:
            return str(num)
        return self.convertToBase7(num // 7) + str(num % 7)

        # import math
        # max_power = math.ceil(math.log(10000000, 7))
        # result = ""
        # if num < 0:
        #     result = "-"
        #     num = -num
        #
        # for power in range(max_power + 1, 0, -1):
        #     powered = 7 ** power
        #     if num >= powered:
        #         result = result + str(math.floor(num / powered))
        #         num = num % powered
        #     else:
        #         if result == "" or result == "-":
        #             continue
        #         else:
        #             result = result + "0"
        #
        # if result == "" and num == 0:
        #     return "0"
        # else:
        #     return result + str(num)
