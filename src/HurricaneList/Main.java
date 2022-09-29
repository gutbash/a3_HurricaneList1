//// HurricaneList
// program for instantiating Linked Lists with nodes and traversal/read/write methods for CSCI 211
// last edited Sep. 28, 2022 by S. Gutierrez

package HurricaneList; // includes project package

/**

 * Main
 * driver code for HurricaneList operations
 */
public class Main {

    /**

     * MAIN METHOD / DRIVER CODE
     */
    public static void main(String[] args) {

        // inits HurricaneList linked list
        HurricaneList HurAtl1986 = new HurricaneList();

        // inits Storm data objects with info
        Storm andrew = new Storm("Andrew", "June", 50, 0);
        Storm bonnie = new Storm("Bonnie", "June", 85, 1);
        Storm charley = new Storm("Charley", "August", 80, 1);
        Storm danielle = new Storm("Danielle", "September", 60, 0);
        Storm earl = new Storm("Earl", "September", 105, 2);
        Storm frances = new Storm("Frances", "November", 85, 1);

        // pushes Storm object data onto HurricaneList linked list
        HurAtl1986.push_back(andrew);
        HurAtl1986.push_back(bonnie);
        HurAtl1986.push_back(charley);
        HurAtl1986.push_back(danielle);
        HurAtl1986.push_back(earl);

        // inserts Storm object data into HurricaneList linked list
        HurAtl1986.insert(frances, 2);

        // prints formatted every storm in the HurricaneList linked list
        HurAtl1986.print();

    } // ends main method
} // ends Main class
