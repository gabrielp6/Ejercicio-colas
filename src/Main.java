public class Main {
    public static void main(String[] args) throws FullQueueException, EmptyQueueException {
        Queue<String> queue = new QueueImplementation<>(5);
        queue.push("A1");
        queue.push("B2");
        queue.push("C3");
        queue.push("D4");
        queue.push("E5");
    }
}
