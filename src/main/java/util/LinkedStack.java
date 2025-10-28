package util;

/**
 * Class that represents a stack data structure using linked nodes.
 */
public class LinkedStack {

    /**
     * Reference to the top node of the stack.
     */
    private Node top;

    /**
     * Number of items in the stack.
     */
    private int numItems;

    /**
     * Constructor of the LinkedStack class. Initializes an empty stack.
     */
    public LinkedStack() {
        top = null;
        numItems = 0;

    }

    /**
     * Checks if the stack is empty.
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return (top == null);
    }

    /**
     * Returns the number of items in the stack.
     * @return the number of items in the stack.
     */
    public int size() {
        return numItems;
    }

    /**
     * Empties the stack.
     */
    public void makeEmpty() {
        top = null;
        numItems = 0;
    }

    /**
     * Pushes an item onto the stack.
     * @param item the item to be pushed onto the stack.
     * @throws RuntimeException if there is no memory left to create a new node.
     */
    public void push(Object item) throws RuntimeException {
        try {
            Node newNode = new Node();
            newNode.setItem(item);
            newNode.setNext(top);
            top = newNode;
        }
        catch (Exception err){
            throw new
                    RuntimeException("No memory left to create new node");
        }

    }

    /**
     * Pops the top item off the stack.
     * @throws IllegalArgumentException if the stack is empty.
     */
    public void pop() {
        if (top == null) throw new IllegalArgumentException();
        top = top.getNext();
        numItems--;
    }

    /**
     * Returns the top item of the stack without removing it.
     * @return the top item of the stack.
     * @throws IllegalStateException if the stack is empty.
     */
    public Object top() throws IllegalStateException {
        if (this.top == null) throw new IllegalArgumentException();
        return top.getNext();
    }


}
