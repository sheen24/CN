// Problem statement
// For a given postorder and inorder traversal of a Binary Tree of type integer stored in an array/list, create the binary tree using the given two arrays/lists. You just need to construct the tree and return the root.

// Note:
// Assume that the Binary Tree contains only unique elements. 
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints:
// 1 <= N <= 10^4
// Where N is the total number of nodes in the binary tree.

// Time Limit: 1 sec
// Sample Input 1:
// 7
// 4 5 2 6 7 3 1 
// 4 2 5 1 6 3 7 
// Sample Output 1:
// 1 
// 2 3 
// 4 5 6 7 
// Sample Input 2:
// 6
// 2 9 3 6 10 5 
// 2 6 3 9 5 10 
// Sample Output 2:
// 5 
// 6 10 
// 2 3 
// 9 
// /*
	
// 	Following is the structure used to represent the Binary Tree Node

// 	class BinaryTreeNode<T> {
// 		T data;
// 		BinaryTreeNode<T> left;
// 		BinaryTreeNode<T> right;

// 		public BinaryTreeNode(T data) {

/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

public class Solution {

	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		//Your code goes here
		 return helper(postOrder,inOrder,0,postOrder.length-1,0,inOrder.length-1);
	}
    
    public static BinaryTreeNode<Integer> helper(int[] po,int in[],int siPo,int eiPo, int siIn,int eiIn)
    {
        if(siIn>eiIn)
        {
            return null;
        }
        
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(po[eiPo]);
        
        int position = -1;
        for(int i =siIn;i<=eiIn;i++)
        {
            if(in[i]==root.data)
            {
                position=i;
                break;
            }
        }
        
        
        root.left= helper(po,in,siPo,siPo+(position-1-siIn),siIn,position-1);
        root.right = helper(po,in,siPo+(position-1-siIn)+1,eiPo-1,position+1,eiIn);
        
        return root;
        
	}

}
