package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SearchTree {

    public SearchTree() {

    }

    private class Node {

        private String key;
        private Integer value;

//        List<Node> nodes;

        private Node left;
        private Node right;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node root;

    public SearchTree(Node root) {
        this.root = root;
        root = null;

    }

    public Integer find(String key) {
        Node tmp = root;
        while (tmp != null) {
            if (key.compareTo(tmp.key) == 0) return tmp.value;
            if (key.compareTo(tmp.key) < 0) tmp = tmp.left;
            if (key.compareTo(tmp.key) > 0) tmp = tmp.right;
        }
        return null;
    }

    public void add(String key, Integer value) {
        root = add(root, key, value);

    }

    private Node add(Node node, String key, Integer value) {
        if (node == null) return new Node(key, value);
        if (key.compareTo(node.key) == 0) {
            node.value = value;
            return node;
        }

        if (key.compareTo(node.key) < 0) node.left = add(node.left, key, value);
        if (key.compareTo(node.key) > 0) node.right = add(node.right, key, value);
        return node;
    }

    public Iterable<String> getKeys() {
        Queue<String> queue = new LinkedList<>();
        inorder(queue, root);
        return queue;


    }

    private void inorder(Queue<String> queue, Node root) {


    }

    public static void main(String[] args) {
        SearchTree tree = new SearchTree();
        tree.add("C", 10);
        tree.add("A", 5);
        tree.add("B", 2);

        System.out.println(tree.find("A"));
        System.out.println(tree.find("B"));
        System.out.println(tree.find("C"));
        System.out.println(tree.find("D"));
    }
}
