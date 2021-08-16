package com.sparta.nirel.tree;

public class BinaryTreeSort implements Sortable {
    private final Node node;
    private boolean leftChildEmpty;

    public BinaryTreeSort(int elements) {
        node = new Node(elements);
    }

    @Override
    public int getRootElement() {

        return node.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return numOfNodes(node);
    }

    private int numOfNodes(Node nodeCount) {
        if (node == null) {
            return 0;
        } else {

            return 1 + numOfNodes(nodeCount.getLeftChild())
                    + numOfNodes(nodeCount.getRightChild());
        }

    }

    @Override
    public void addElement(int elements) {
        addValuesToTree(node, elements);
    }

    private void addValuesToTree(Node node, int elements) {
        if (elements == node.getValue()) return;
        if (elements < node.getValue()) {
            if (node.isLeftChildEmpty()) {

                node.setLeftChild(new Node(elements));

            } else {
                addValuesToTree(node.getLeftChild(), elements);

            }
        } else {
            if (node.isRightChildEmpty()) {
                node.setRightChild(new Node(elements));
            } else {
                addValuesToTree(node.getRightChild(), elements);
            }

        }
    }

    @Override
    public void addElements(int[] elements) {
        for (int i : elements) {
            addValuesToTree(node, i);

        }
    }

    @Override
    public boolean findElement(int value) {
        Node node = findNode(value);
        if (node != null) {
            return true;
        }
        return false;
    }

    private Node findNode(int searchedItem) {
        Node newnode = node;

        while (newnode != null) {
            if (searchedItem == newnode.getValue()) {
                return newnode;
            }

            if (searchedItem < newnode.getValue()) {

                newnode = newnode.getLeftChild();
            } else {
                newnode = newnode.getLeftChild();
            }
        }
        return null;
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        Node newNode = findNode(element);
        if (newNode.getLeftChild() == null) {
            throw new ChildNotFoundException("this node is null therefore it does not exist");
        } else {
            return newNode.getLeftChild().getValue();
        }
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        Node newNode = findNode(element);
        if (newNode.getRightChild() == null) {
            throw new ChildNotFoundException("this node is null therefore it does not exist");
        } else {
            return newNode.getRightChild().getValue();
        }
    }

    @Override
    public int[] getSortedTreeAsc() {
       return sortTree(node);
    }

    private int[] sortTree(Node node) {

        int [] array =new int[10];
        if (node.getLeftChild() != null) {
            sortTree(node);

        } else {

        }
        return array;
    }

    @Override
    public int[] getSortedTreeDesc() {
        return new int[0];
    }
}
