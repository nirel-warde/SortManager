package com.sparta.nirel.tree;

public class BinaryTree {
    private final Node rootNode;
    private boolean leftChildEmpty;

    public BinaryTree(int elements) {
        rootNode = new Node(elements);
    }


    public void AddElement(int rootNode, int elements) {
//        addNodeToTree(rootNode ,element);
    }

    private boolean findElement(int searchedItem) {

        Node node = findNode(searchedItem);
        if (node != null) {
            return true;
        }
        return false;
    }

    private Node findNode(int searchedItem) {
        Node node = rootNode;
        while (node != null) {
            if (searchedItem == node.getValue()) {
                return node;
            }

            if (searchedItem < node.getValue()) {

                node = node.getLeftChild();
            }
            else{
            node = node.getLeftChild();
            }
        }
        return null;
        }


        public void addValuesToTree (Node node,int elements){
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
//public void
    }
