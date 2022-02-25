public class Queue
{
    private Node head;
    private Node tail;
    private static int size;

    public Queue ()
    {
        head = null;
        tail = null;
        size = 0;
    } // end Queue constructor

    public void enqueue (int newData)
    {
        tail = new Node(newData, tail);
        if (size == 0)
        {
            head = tail;
        } // end if
        size++;
    } // end enqueue

    public void dequeue ()
    {
        Node temp;
        if (size != 0)
        {
            temp = head;
        }
        head = head.getLink();
    } // end dequeue

    public static int getSize ()
    {
        return size;
    } // end getSize

    public void peekHead ()
    {
        if (head != null)
        {
            System.out.println(head.getData());
        }
    } // end peekHead

    public void peekTail ()
    {
        if (tail != null)
        {
            System.out.println(tail.getData());
        }
    } // end peekTail

    public boolean hasNext ()
    {
        Node pos = head;
        if (pos.getLink() == null)
        {
            return false;
        }
        else
        {
            return true;
        }
    } // end hasNext

    public void show ()
    {
        Node position  = head;
        while (position != null)
        {
            System.out.println(position.getData());
            position = position.getLink();
        }
    }



    private class Node
    {
        private int data;
        private Node link;

        public Node (int data, Node link)
        {
            this.data = data;
            this.link = link;
        } // end Node constuctor

        public int getData ()
        {
            return data;
        } // end getter
        public Node getLink ()
        {
            return link;
        } // end getter

        public String toString ()
        {
            return "Data: " + data + " is linked to " + link;
        } // end toString
    } // end Node calss
} // end Queue class
/*
public class Queue
{
    // variables
    private Node head;
    private Node tail;
    private static int size;

    // constructor
    public Queue ()
    {
        head = null;
        tail = null;
        this.size = 0;
    } // end constructor

    public void enqueue (int newNode) {
        if (size == 0)
        {

        }
        tail = new Node (newNode, tail);
    }

    public void dequeue ()
    {
        if (head != null)
        {
            head.getLink();
        }
        else
        {
            System.out.println("There is nothing to delete. This is an empty list.");
            System.exit(0);
        }
    }


    // MAIN BRAIN METHODS
    /*
    // populate list and insertion of nodes
    public void addToTail (int newNode) // you add to the tail / rear (first in, first out)
    {
        tail = new Node(newNode, tail);
    } // end addNodeToTail method

    public void deleteFromHead () // you delete from the head / front (first in, first out)
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
    } // end deleteFromHead method

    public boolean hasNext ()
    {
        Node index = head;
        if (index.getLink() != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    } // end hasNext method




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
*/