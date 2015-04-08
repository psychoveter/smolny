package tree.binary;

import tree.Tree;
import tree.Comparable;

/**
 * Created by veter on 04.04.15.
 */
public class BinaryTree implements Tree {

    private Node head;

    @Override
    public boolean add(Comparable node) {
        Node wrapper = new Node();
        wrapper.value = node;

        if(head == null) {
            head = wrapper;
            return true;
        } else {
            Node pointer = head;
            while(true) {
                if(wrapper.compareTo(pointer) == 0)
                    return false;
                if(wrapper.compareTo(pointer) < 0) {
                    if(pointer.left == null) {
                        pointer.left = wrapper;
                        wrapper.parent = pointer;
                        return true;
                    } else {
                        pointer = pointer.left;
                    }
                } else {
                    if(pointer.right == null) {
                        pointer.right = wrapper;
                        wrapper.parent = pointer;
                        return true;
                    } else {
                        pointer = pointer.right;
                    }
                }
            }
        }
    }

    @Override
    public boolean remove(Comparable node) {
        return false;
    }

    @Override
    public int height() {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(Comparable node) {
        return false;
    }

    public String toString() {
        if(head == null)
            return "{}";
        else
            return head.toString();
    }

}

class Node implements Comparable {

    Node parent;
    Node left;
    Node right;

    Comparable value;

    @Override
    public int compareTo(Comparable other) {
        if(other instanceof Node) {
            Node otherNode = (Node)other;
            return value.compareTo(otherNode.value);
        } else
            throw new RuntimeException("Unexpected state");
    }

    @Override
    public String toString() {
        return "{" + value.toString() +
                ": l: " + (left == null ? "null" : left.toString()) +
                ", r: " + (right == null ? "null" : right.toString())
                + "}";

    }

}