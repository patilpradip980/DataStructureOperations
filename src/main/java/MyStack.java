public class MyStack<T> {

    public final MyLinkedList<T> myLinkedList;

    public MyStack() {
        myLinkedList = new MyLinkedList();
    }

    public void push(INode<T> element) {
        myLinkedList.add(element);
    }

    public boolean isEmpty() {
        return myLinkedList.head == null;
    }

    public INode<T> peak() {
        if (!isEmpty()) {
            return myLinkedList.head;
        } else {
            System.out.println("Stack is empty");

        }
        return null;
    }

    public INode<T> pop() {
        INode<Integer> peak = (INode<Integer>) peak();
        while (peak != null) {
            myLinkedList.pop();
            peak = (INode<Integer>) peak();
        }
        return myLinkedList.head;
    }


    public void printStack() {
        myLinkedList.printMyNodes();
    }
}
