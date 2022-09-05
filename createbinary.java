//Create & Travers Binary Tree Using Java
import java.util.Scanner;
//create Node class to add left right and root node
class Node {
Node left , right;
int data;
public Node (int data) {
  this.data = data;
  left = null;
  right = null;
   }
}

public class createbinary {
// create create() method to create a binary tree
static Node create () {
  Scanner sc = new Scanner(System.in);
  //initialise Node root = null;
  Node root = null;
  int data = sc.nextInt();
  
  // wright base condition to recursive function
// that is if data == -1 simply return null to left or right child of a node
  if (data == -1) {
   return null;
  } else {
  root = new Node(data);
  System.out.println("Enter Left Child");
  
  // apply create function to the left node
  root.left = create();
  
  //apply create function to the right node
  System.out.println("Enter Right Child");
  root.right = create();
  
  //return root ie. every child node is considered as root node
  return root;
  }
}

// Inorder follows frist left node then root and then right node
static void inorder ( Node root ) {
    if (root == null) {
      return ;
    } else {
    inorder(root.left);
    System.out.println(root.data);
    inorder(root.right);
    }
  }
  
  // preorder follows frist root node then left and then right node
static void preorder ( Node root ) {
    if (root == null) {
      return ;
    } else {
    System.out.println(root.data);
    preorder(root.left);
    preorder(root.right);
    }
  }
  
 // Postorder Follows Frist left node then right andas root node
static void postorder ( Node root ) {
    if (root == null) {
      return ;
    } else {
    postorder(root.left);
    postorder(root.right);
    System.out.println(root.data);
    }
  }
  public static void main(String[] args) {
    System.out.println("Enter -1 for null Node");
    System.out.println("Enter Root Node");
    
    //call create() function to add nodes in our 🎄
  Node root = create();
  
  System.out.println("Inorder Traversal :- ");
  inorder(root);
  System.out.println("Preorder Traversal :- ");
  preorder(root);
  System.out.println("Postorder Travarsal :- ");
  postorder(root);
  
  }
}

//created by Rohit Tippe
