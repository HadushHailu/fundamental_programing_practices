package simple_formal_data_structure;

import com.sun.source.tree.Tree;

import javax.swing.*;

public class BinarySearchTree {
    TreeNode root;

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString(){
            return val + " ";
        }
    }

    BinarySearchTree(){
        root = null;
    }
    BinarySearchTree(int val){
        root = new TreeNode(val);
    }

    public TreeNode search(TreeNode node, int target){

        if(node == null){
            return null;
        }else if(node.val == target){
            return node;
        }
        System.out.println("searching: " + node.val);
        if(target < node.val){
            return search(node.left, target);
        }
        return search(node.right, target);
    }

    public void insert(int val){
        if(root == null){
            root = new TreeNode(val);
        }else{
            insertRec(root, val);
        }
    }

    public TreeNode insertRec(TreeNode node, int val){
        if(node == null){
            return new TreeNode(val);
        }

        if(node.val < val){
            node.right = insertRec(node.right, val);
        }else{
            node.left = insertRec(node.left, val);
        }
        return node;
    }

    public void inOrderTraverse(TreeNode node){
        if(node != null){
            inOrderTraverse(node.left);
            System.out.print(node.val + " ");
            inOrderTraverse(node.right);
        }
    }

    public void preOrderTraverse(TreeNode node){
        if(node != null){
            System.out.print(node.val + " ");
            preOrderTraverse(node.left);
            preOrderTraverse(node.right);
        }
    }

    public void postOrderTraverse(TreeNode node){
        if(node != null){
            preOrderTraverse(node.left);
            preOrderTraverse(node.right);
            System.out.print(node.val + " ");
        }
    }

    public TreeNode deleteNode(TreeNode node, int key){
        if(node == null){
            return node;
        }

        //Delete current node, if this node is a target node
        if(node.val == key){
            if(node.left == null){
                return node.right;
            }

            if(node.right == null){
                return node.left;
            }

            // Replace node with its successor
            // If node has two children
            TreeNode p = findSuccesssor(node);
            node.val = p.val;
            node.right = deleteNode(node.right, p.val);
            return node;
        }

        if(node.val < key){
            //find target in the right subtree
            node.right = deleteNode(node.left, key);
        }else{
            //find target in the left
            node.left = deleteNode(node.left, key);
        }
        return node;
    }

    private TreeNode findSuccesssor(TreeNode node){
        TreeNode curr = node.right;
        while(curr != null && curr.left != null){
            curr = curr.left;
        }
        return curr;
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root.val +
                '}';
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        // 25, 12, 36, 4, 15, 30, 45, 2, 10, 13, 16, 29, 34, 40, 65
        binarySearchTree.insert(25);
        binarySearchTree.insert(12);
        binarySearchTree.insert(36);
        binarySearchTree.insert(4);
        binarySearchTree.insert(15);
        binarySearchTree.insert(30);
        binarySearchTree.insert(45);
        binarySearchTree.insert(2);
        binarySearchTree.insert(10);
        binarySearchTree.insert(13);
        binarySearchTree.insert(16);
        binarySearchTree.insert(29);
        binarySearchTree.insert(34);
        binarySearchTree.insert(40);
        binarySearchTree.insert(65);

        System.out.println(binarySearchTree);
        System.out.println("[+] In order traverse!");
        binarySearchTree.inOrderTraverse(binarySearchTree.root);

        System.out.println("\n[+] pre order traverse!");
        binarySearchTree.preOrderTraverse(binarySearchTree.root);

        System.out.println("\n[+] post order traverse!");
        binarySearchTree.postOrderTraverse(binarySearchTree.root);

        //System.out.println(binarySearchTree.search(binarySearchTree.root, 3));

        //System.out.println("Delete 25: " + binarySearchTree.deleteNode(binarySearchTree.root, 45));
        //System.out.println("[+] In order traverse!");
        System.out.println("\n");
        binarySearchTree.deleteNode(binarySearchTree.root, 25);
        System.out.println("Delete 45: ");
        System.out.println("[+] In order traverse!");
        binarySearchTree.inOrderTraverse(binarySearchTree.root);
    }
}
