import org.junit.Assert;

public class QueueImplementationTest {

    Queue<String> queue;

    public void GetQueue() throws FullQueueException {
        this.queue=new QueueImplementation<String>(5);
        this.queue.push("A1");
        this.queue.push("B2");
        this.queue.push("C3");
        this.queue.push("D4");
        this.queue.push("E5");
    }

    public void testPush() throws FullQueueException {
        Assert.assertEquals(1, this.queue.size());
        this.queue.push("F6");
        Assert.assertEquals(2, this.queue.size());
        this.queue.push("G7");
    }

    public void testPop() throws EmptyQueueException {
        Assert.assertEquals(1, this.queue.size());
        Assert.assertEquals(2, this.queue.size());
        Assert.assertEquals("C3", this.queue.size());
    }
}
