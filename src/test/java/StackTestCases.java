import org.junit.Assert;
import org.junit.Test;

public class StackTestCases {
    @Test
    public void given3Numbers_WhenAddedToStack_ShouldPassResult() {
        MyStack<Integer> myStack = new MyStack<>();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        Integer peak = myStack.peak();
        myStack.printStack();
        Assert.assertEquals(myThirdNode, peak);
    }

    @Test
    public void given3Numbers_WhenPopFromStack_ShouldPassResult() {
        MyStack<Integer> myStack = new MyStack<>();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        Integer popNode = myStack.pop();
        myStack.printStack();
        Assert.assertEquals(myThirdNode,popNode);
    }

}
