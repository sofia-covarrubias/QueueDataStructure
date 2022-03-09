import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest
{
    @Test
    public void removeEmptySize ()
    {
        Queue q = new Queue();
        q.dequeue();
        q.dequeue();
        int expected = 0;
        int actual = q.getSize();
        assertEquals(expected, actual);
    }
    @Test
    public void removeEmptyHead ()
    {
        Queue q = new Queue();
        q.dequeue();
        q.dequeue();
        String expected = null;
        String actual = q.peekHead();
        assertEquals(expected, actual);
    }
    @Test
    public void addRemoveSize ()
    {
        Queue q = new Queue();
        q.enqueue("Sofia");
        q.dequeue();
        q.enqueue("John");
        int expected = 1;
        int actual = q.getSize();
        assertEquals(expected, actual);
    }
}