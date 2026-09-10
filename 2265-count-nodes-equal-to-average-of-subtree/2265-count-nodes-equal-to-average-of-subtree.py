# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):

    def count(self, root):
        if root == None:
            return 0 , 0, 0
        
        lsum , lcount, ln = self.count( root.left )
        rsum , rcount, rn = self.count( root.right )
        tsum = lsum+rsum+root.val
        tcount = lcount + rcount + 1 
        tn = ln+rn

        if round( tsum/tcount ) == root.val:
            tn+= 1
        return tsum , tcount, tn

        

    def averageOfSubtree(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        _, _, n = self.count(root)

        return n

