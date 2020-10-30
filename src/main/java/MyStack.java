public class MyStack<T> {

    public final MyLinkedList<T> myLinkedList;

    public MyStack() {
        myLinkedList = new MyLinkedList();
    }

    public void push(INode<T> element) {
        myLinkedList.add(element);
    }
    public INode<T> peak()
    {
        return myLinkedList.head;
    }
    public void printStack()
    {
        myLinkedList.printMyNodes();
    }
}
