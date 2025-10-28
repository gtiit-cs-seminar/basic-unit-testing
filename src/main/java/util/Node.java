package util;

/**
 * Class that represents a node in a linked list.
 */
public class Node {

    /**
     * The item stored in the node.
     */
    private Object item;

    /**
     * Reference to the next node in the list.
     */
    private Node next;

    /**
     * Constructor of the Node class. Sets item and next to null.
     */
    public Node() {
        item = null;
        next = null;
    }

    /**
     * Constructor of the Node class. Sets the item to newItem and next to null.
     * @param newItem is the item used to modify the item field.
     */
    public Node(Object newItem) {
        item = newItem;
        next = null;
    }

    /**
     * Constructor of the Node class. It sets both the item and the next node.
     * @param newItem is the item used to modify the item field.
     * @param nextNode is the reference used to modify the next field.
     */
    public Node(Object newItem, Node nextNode) {
        item = newItem;
        next = nextNode;
    }

    /**
     * Sets the item attribute of the node.
     * @param newItem is the item used to modify the item field.
     */
    public void setItem(Object newItem) {
        item = newItem;
    }

    /**
     * Sets the next attribute of the node.
     * @param nextNode is the reference used to modify the next field.
     */
    public void setNext(Node nextNode) {
        next = nextNode;
    }

    /**
     * Gets the item stored in the node.
     * @return the item stored in the node.
     */
    public Object getItem() {
        return item;
    }

    /**
     * Gets the reference to the next node.
     * @return the reference to the next node.
     */
    public Node getNext() {
        return next;
    }

}
