public class Queue
{
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
