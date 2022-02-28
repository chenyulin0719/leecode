# Definition for a binary tree node.

from typing import Optional
from typing import List

from utils import TreeNode


class Solution:

    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        queue = []
        result = []

        def dfs(root, queue):

            queue.append(root.val)
            if not root.left and not root.right:
                result.append(build_path(queue))

            if root.left:
                dfs(root.left, queue)

            if root.right:
                dfs(root.right, queue)
            queue.pop()

        def build_path(queue: list):
            if len(queue) == 0:
                return ""
            else:
                result = str(queue[0])
                for temp in queue[1:]:
                    result = str(result) + "->" + str(temp)
                return result

        if root is None:
            return []
        else:
            dfs(root, queue)

        return result
