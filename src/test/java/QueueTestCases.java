import org.junit.Assert;
import org.junit.Test;

public class QueueTestCases {
    @Test
    public void given3Numbers_WhenAddedToQueue_ShouldPassResult() {
        MyQueue<Integer> myQueue = new MyQueue<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printStack();
        Integer peak = myQueue.peak();
        Assert.assertEquals(myFirstNode, peak);
    }

    @Test
    public void given3Numbers_WhenDequeue_ShouldPassResult() {
        MyQueue<Integer> myQueue = new MyQueue<>();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printStack();
        Integer dequeueNode = myQueue.dequeue();
        myQueue.printStack();
        Assert.assertEquals(myFirstNode, dequeueNode);
    }
}
