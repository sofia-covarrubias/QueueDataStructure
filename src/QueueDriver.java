public class QueueDriver
{
    public static void main (String[] args)
    {
//        Queue q = new Queue ();
//        q.enqueue("Sofia");
//        q.dequeue();
//        q.enqueue("Bro");
//        System.out.println(q.peekTail() + " " + q.peekHead());
        Queue q = new Queue();
        q.dequeue();
        System.out.println(q.peekTail() + " " + q.peekHead());

    } // end main method

} // end main class