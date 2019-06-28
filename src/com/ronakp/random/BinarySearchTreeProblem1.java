package com.ronakp.random;

import com.ronakp.random.helper.TreeNode;
import javafx.geometry.Pos;

public class BinarySearchTreeProblem1 {
    public TreeNode root;

    public BinarySearchTreeProblem1(int data) {
        root = new TreeNode(data);
    }

    private TreeNode insertRecursive(TreeNode current, int data) {
        if(current == null) {
            return new TreeNode(data);
        }
        if(data <= current.data) {
            current.left = insertRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = insertRecursive(current.right, data);
        } else {
            return current;
        }
        return current;
    }

    public void inset(int data) {
        root = insertRecursive(root, data);
    }

    private TreeNode deleteRecursive(TreeNode current, int data) {
        if(current == null) {
            return null;
        }
        if(data <= current.data) {
            current.left = deleteRecursive(current.left, data);
        }
        else if (data > current.data) {
            current.right = deleteRecursive(current.right, data);
        } else {
            if (current.left == null && current.right == null) {
                return null;
            } else {
                if (current.right == null) {
                    return current.left;
                } else if (current.left == null) {
                    return current.right;
                } else {
                    int smallestVaule = findSmallestValue(current.right);
                    current.data = smallestVaule;
                    current.right = deleteRecursive(current.right, smallestVaule);
                    return current;
                }
            }
        }
        return current;
    }

    private int findSmallestValue(TreeNode current) {
        return current.left == null ? current.data : findSmallestValue(current.left);
    }

    public void delete(int data) {
        root = deleteRecursive(root, data);
    }

    private void InOrder(TreeNode current) {
        if(current != null) {
            InOrder(current.left);
            System.out.println(" " + current.data);
            InOrder(current.right);
        }
    }

    public void printInOrder() {
        InOrder(root);
    }

    private void PreOrder(TreeNode current) {
        if(current != null) {
            System.out.println(" " + current.data);
            PreOrder(current.left);
            PreOrder(current.right);
        }
    }

    public void printPreOrder() {
        PreOrder(root);
    }

    private void PostOrder(TreeNode current) {
        if(current != null) {
            PreOrder(current.left);
            PreOrder(current.right);
            System.out.println(" " + current.data);
        }
    }

    public void printPostOrder() {
        PostOrder(root);
    }
}
