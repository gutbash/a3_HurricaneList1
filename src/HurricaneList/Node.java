//// HurricaneList
// program for instantiating Linked Lists with nodes and traversal/read/write methods for CSCI 211
// last edited Sep. 28, 2022 by S. Gutierrez

package HurricaneList; // includes project package

/**

 * Node
 * contains Storm object data
 * part of HurricaneList linked list
 */
public class Node {

    // declares instance variables
    Storm s; // stores Storm object
    Node next; // keeps track of place in list in forward direction

    // constructs instance variables
    public Node() {

        s = null;
        next = null;

    } // ends Node() constructor method

    // getters //
    public Node getNext() { return next; }
    public Storm getStorm() { return s; }

    // setters //
    public void setNext(Node next) { this.next = next; }
    public void setStorm(Storm s) { this.s = s; }

} // ends Node class
