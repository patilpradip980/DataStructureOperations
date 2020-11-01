public class MyStack<T> {

    public final MyLinkedList myLinkedList;

    public MyStack() {
        myLinkedList = new MyLinkedList();
    }

    public void push(Integer<T> element) {
        myLinkedList.add(element);
    }

    public boolean isEmpty() {
        return myLinkedList.head == null;
    }

    public Integer peak() {
        if (!isEmpty()) {
            return myLinkedList.head;
        } else {
            System.out.println("Stack is empty");

        }
        return null;
    }

    public Integer pop() {
      /*  INode<Integer> peak = (INode<Integer>) peak();
        while (peak != null) {
            myLinkedList.popLast();
            peak = (INode<Integer>) peak();
        }*/
        return myLinkedList.pop();
    }


    public void printStack() {
        myLinkedList.printMyNodes();
    }
}
