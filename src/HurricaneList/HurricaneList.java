//// HurricaneList
// program for instantiating Linked Lists with nodes and traversal/read/write methods for CSCI 211
// last edited Sep. 28, 2022 by S. Gutierrez

package HurricaneList; // includes project package

/**

 * HurricaneList
 * linked list for hurricane data
 * contains head and tail tracker fields,
 * push and insert methods,
 * to string print method
 */
public class HurricaneList {

    // declares instance variables
    Node head; // starts Node in list
    Node tail; // ends Node in list

    // constructs instances
    public HurricaneList() {

        // sets to null to be replaced with Node
        head = null;
        tail = null;

    } // ends HurricaneList() constructor

    /**

     * push_back()
     * appends this Storm object h to a new node at the tail of the list
     */
    void push_back(Storm h) {

        Node new_node = new Node(); // inits new Node
        new_node.setStorm(h); // sets data in new Node

        // pushes Node at the end of the list
        if (head == null && tail == null) { // checks if list is empty

            head = new_node; // sets head to new Node

        } else {

            // sets start Node as head
            // aims to traverse for last Node
            Node last = head;

            // traverses list while there is a next Node
            while (last.getNext() != null) {

                // sets current last Node to next Node
                last = last.getNext();

            } // ends while loop list traversal

            // sets the current last Node's next Node to the new Node
            last.setNext(new_node);

        } // ends if/else logic

        // sets the tail to be the new Node
        tail = new_node;

    } // ends push_back() method

    /**

     * insert()
     * inserts this Storm object h to a new node and places it at position i
     * position index starts at 0
     */
    void insert(Storm h, int i) {

        Node new_node = new Node(); // inits new Node
        new_node.setStorm(h); // sets data in new Node

        // checks if position is at the start
        if (i == 0) {

            // sets current head of list as next Node
            new_node.setNext(head);
            // replaces current head with new Node as head
            head = new_node;

        // traverses list if position is not at the start
        } else {

            // inits current position at start, 0
            int position = 0;
            // inits previous Node tracker
            Node previous = null;
            // inits current Node tracker
            Node current = head; // sets current Node tracker to the head start

            // traverses list while the current position is not the target position, i
            while (position != i) {

                // checks if next Node is empty
                if (current.getNext() == null) {
                    // prints error for reaching end of list without finding position
                    System.out.println("ERROR: Out of Range");
                    return;
                } // ends if statement error checker

                // sets previous Node tracker to current Node
                previous = current;
                // sets current Node to its next Node
                current = current.getNext();
                // increases position counter
                position++;

            } // ends while loop traversal

            // finds position equal to target, i
            // sets current Node at target position as new Node's next Node
            new_node.setNext(current);
            // sets new Node as previous Node's next Node
            previous.setNext(new_node);

        } // ends if/else traversal logic

    } // ends insert() method

    /**

     * print()
     * Prints information about each storm from head to tail
     */
    void print() {

        // sets head as current Node at traversal start
        Node current = head;

        // checks for an empty list if there is a head start
        if (head == null) {

            System.out.println("ERROR: Empty List"); // prints error message

        } // ends if statement error checker

        // traverses list while haven't reached end, still current Node
        while (current != null) {

            // gets and stores Storm object data from current Node
            Storm storm = current.getStorm();
            // prints formatted Storm object data from current Node
            System.out.printf("Hurricane %s - Wind Speed: %d MPH; Month Formed: %s; Category %d%n", storm.getName(), storm.getMaxWind(), storm.getMonthFormed(), storm.getCategory());
            // moves current Node to current Node's next Node
            current = current.getNext();

        } // ends while loop traversal
    } // ends print() method
} // ends HurricaneList class
