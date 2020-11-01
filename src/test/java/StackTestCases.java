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
        INode peak = myStack.peak();
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
        myStack.pop();
        myStack.printStack();
        INode popNode1 = myStack.pop();
        myStack.printStack();
        Assert.assertEquals(mySecondNode,popNode1);
    }

}
