
import com.sun.source.tree.BinaryTree;
import java.util.*;

class Node {
    int key;
    Node left, right;

    public Node(int value){
        key = value;
        left = right = null;
    }

    public BinaryTree(){
        Node root;

        BinaryTree(){
            root = null;
        }

        void inorder(Node current){
            if(node != null){
                inorder(current.left);
                System.out.println(current.key+" ");
                inorder(current.right);
            }
        }

        void preorder(Node current){
            if(node != null){
                System.out.println(current.key+" ");
                preorder(current.left);
                preorder(current.right);
            }
        }
        void postorder(Node current){
            if(node != null){
                postorder(current.left);
                postorder(current.right);
                System.out.println(current.key+" ");
            }
        }
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root(1);
        tree.root.left(2);
        tree.root.right(3);
        tree.root.left.left(4);
        tree.root.left.right(5);

        System.out.print("Inorder traversal: ");
        tree.inorder(tree.root);     
        System.out.println();

        System.out.print("Preorder traversal: ");
        tree.preorder(tree.root);    
        System.out.println();

        System.out.print("Postorder traversal: ");
        tree.postorder(tree.root);
    }
}
