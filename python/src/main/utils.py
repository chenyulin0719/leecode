class TreeNode(object):

    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

    def add_left(self, val):
        self.left = TreeNode(val)

    def add_right(self, val):
        self.right = TreeNode(val)
