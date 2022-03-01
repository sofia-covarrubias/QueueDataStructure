public class QueueDriver
{
    public static void main (String[] args)
    {
        // ROUND 1
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(10);

        System.out.println("Head and Tail: ");
        q.peekHead();
        q.peekTail();

        System.out.println("Showing all two items:");
        q.show();

        // ROUND 2
        q.enqueue(3);

        System.out.println("Head and Tail: ");
        q.peekHead();
        q.peekTail();

        System.out.println("Showing all two items:");
        q.show();

        System.out.println("Size:\n" + q.getSize());

        // ROUND 3
        q.dequeue();

        System.out.println("Head and Tail: ");
        q.peekHead();
        q.peekTail();

        System.out.println("Showing all two items:");
        q.show();
    } // end main method

} // end main class
