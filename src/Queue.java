public class Queue
{
    // variables
    private Node head;
    private Node tail;

    // constructor
    public Queue ()
    {
        head = null;
        tail = null;
    } // end constructor

    // populate list and insertion of nodes
    public void addToTail (int newNode)
    {
        tail = new Node(newNode, tail);
    } // end addNodeToTail method

    public void deleteFromHead ()
    {
        if (head != null)
        {
            head.getLink();
        }
        else
        {
            System.out.println("Do you want to delete this from an empty list? ");
            System.exit(0); // We can pass any integer as an argument to the method
        }
    }



    // ---------------------------------------------------------
    // PRIVATE CLASS
    private class Node
    {
        // instance variables
        private int data;
        private Node link; // self-reference

        // constructor
        public Node (int data, Node link)
        {
            this.data = data;
            this.link = link;
        }

        // getter methods
        public int getData ()
        {
            return data;
        }
        public Node getLink ()
        {
            return link;
        }

        // to string method
        public String toString ()
        {
            return "Data: " + data + " is linked to " + link;
        }
    } // end Node class

} // end main Queue class
