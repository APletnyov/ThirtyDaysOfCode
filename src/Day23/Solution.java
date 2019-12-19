package Day23;

import java.io.*;
import java.util.*;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

    static LinkedList<Node> linkedList = new LinkedList<>();

    static void levelOrder(Node root){

//        System.out.println();

        if (!(root == null)) {

            // enqueue current root
            linkedList.addLast(root);

            // while there are nodes to process
            while( linkedList.size()>0 ) {
                // dequeue next node
                Node currentNode = linkedList.getFirst();

                System.out.print("" + currentNode.data + " ");

                linkedList.removeFirst();
                //process tree's root;
                // enqueue child elements from next level in order

                if (!(currentNode.left == null)) {
                    linkedList.addLast(currentNode.left);
                }
                if (!(currentNode.right == null)) {
                    linkedList.addLast(currentNode.right);
                }

            }
        }

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
        levelOrder(root);
    }
}