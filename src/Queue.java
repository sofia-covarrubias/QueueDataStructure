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
        Node position = tail;
        if (size != 0)
        {
            for (int i = 0; i < size-2; i++)
            {
                position.getLink();
            }
            temp = position.getLink();
            head = temp;
        }
    }


    public void show ()
    {
        Node position = tail;
        int count = 0;
        while (position != null && count < size-1)
        {
            System.out.println(position.getData());
            position = position.getLink();
            // position = position.getLink();
            count++;
        }
    }

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