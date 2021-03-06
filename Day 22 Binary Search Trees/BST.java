import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

	public static int getHeight(Node root){
      //Write your code here
      int leftHeight = 0;
      int rightHeight = 0 ;
      int height =0;
      Node curr = root;
      if (curr.left != null){
          leftHeight = getHeight(curr.left)+1;
      }
      if (curr.right != null){
          rightHeight = getHeight(curr.right)+1;
      }
      //System.out.println("leftHeight: "+leftHeight);
      //System.out.println("rightHeight: "+rightHeight);
      height = leftHeight> rightHeight ? leftHeight:rightHeight;
      return (height);
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}