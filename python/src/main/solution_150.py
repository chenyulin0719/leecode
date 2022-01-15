class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []

        def cal_one_operater(stack: List[str], annotation):
            b = stack.pop()
            a = stack.pop()

            if annotation == '+':
                stack.append(a + b)
            elif annotation == '-':
                stack.append(a - b)
            elif annotation == '*':
                stack.append(a * b)
            elif annotation == '/':
                stack.append(a / b)
            return stack

        for token in tokens:
            if token in '+-*/':
                cal_one_operater(stack, token)
            else:
                stack.append(int(token))

        return stack.pop()
