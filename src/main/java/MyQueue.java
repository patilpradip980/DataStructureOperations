public class MyQueue<T> {
    public final MyLinkedList myLinkedList;

    public MyQueue() {
        myLinkedList = new MyLinkedList();
    }

    public void enqueue(MyNode<T> element) {
        myLinkedList.append(element);
    }

    public void printStack() {
        myLinkedList.printMyNodes();
    }
    public boolean isEmpty() {
        return myLinkedList.head == null;
    }

    public INode peak() {
        if (!isEmpty()) {
            return myLinkedList.head;
        } else {
            System.out.println("Queue is empty");

        }
        return null;
    }

    public INode dequeue() {
        return myLinkedList.pop();
    }
}
