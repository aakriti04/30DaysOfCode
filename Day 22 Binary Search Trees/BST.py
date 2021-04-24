class Node:
    def __init__(self,data):
        self.right=self.left=None
        self.data = data
class Solution:
    def insert(self,root,data):
        if root==None:
            return Node(data)
        else:
            if data<=root.data:
                cur=self.insert(root.left,data)
                root.left=cur
            else:
                cur=self.insert(root.right,data)
                root.right=cur
        return root

    def getHeight(self,root):
        #Write your code here
        leftHeight = 0
        rightHeight = 0
        height = 0 
        curr = root
        if(curr.left != None):
            leftHeight= self.getHeight(curr.left)+1
        if (curr.right != None):
            rightHeight=self.getHeight(curr.right)+1
        
        height = leftHeight if leftHeight>rightHeight else rightHeight
        return height 
            

T=int(input())
myTree=Solution()
root=None
for i in range(T):
    data=int(input())
    root=myTree.insert(root,data)
height=myTree.getHeight(root)
print(height)       