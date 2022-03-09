public class Queue
{
    private Node head;
    private Node tail;
    private int size;

    public Queue ()
    {
        head = null;
        tail = null;
        size = 0;
    } // end Queue constructor

    public void enqueue (String newData)
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
        // if size == 0, do nothing to remove
        if (size > 0)
        {
            for (int i = 0; i < size-2; i++)
            {
                position.getLink();
            }
            temp = position.getLink();
            head = temp;
        }
        size--;
        if (size < 0)
        {
            size = 0;
        }
        if (size == 0)
        {
            head = null;
            tail = null;
        }
    }


    public void show ()
    {
        Node position = tail;
        int count = 0;
        while (position != null && count < size)
        {
            System.out.println(position.getData());
            position = position.getLink();
            count++;
        }
    }

    public int getSize ()
    {
        return size;
    } // end getSize

    public String peekHead ()
    {
        if (head == null)
        {
            return null;
        }
        else
        {
            return head.getData();
        }
    } // end peekHead

    public String peekTail ()
    {
        if (tail == null)
        {
            return null;
        }
        else
        {
            return tail.getData();
        }
    } // end peekTail

//    public boolean hasNext ()
//    {
//        Node pos = tail;
//        if (pos.getLink() == null)
//        {
//            return false;
//        }
//        else
//        {
//            return true;
//        }
//    } // end hasNext




    private class Node
    {
        private String data;
        private Node link;

        public Node (String data, Node link)
        {
            this.data = data;
            this.link = link;
        } // end Node constructor

        public String getData ()
        {
            return data;
        } // end getter
        public Node getLink ()
        {
            return link;
        } // end getter
        public void setData(String data)
        {
            this.data = data;
        }

        public String toString ()
        {
            return "Data: " + data + " is linked to " + link;
        } // end toString
    } // end Node class
} // end Queue class