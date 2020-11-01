public class MyLinkedList<K> {
    public Integer tail;
    public Integer head;
    public K key;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }



    public void add(Integer newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            Integer tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }

    }

    public void append(Integer myNode) {
        if (this.head == null) {
            this.head = myNode;
        }
        if (this.tail == null) {
            this.tail = myNode;
        } else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    public Integer pop() {
        Integer tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public Integer popLast() {
        Integer tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        tail.setNext(tempNode);
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }

    public Integer search(K key) {
        Integer tempNode = this.head;
        while (tempNode != null) {
            if (tempNode.equals(key)) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }

    public void insertMiddle(K key, Integer newNode) {
        insert(search(key), newNode);
    }

    public void insert(Integer myNode, Integer newNode) {
        Integer tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public void deleteInMiddle(MyNode<Integer> key) {
        Integer tempNode = this.head;
        while (!tempNode.getNext().equals(key)) {
            tempNode = tempNode.getNext();
        }
        tempNode.setNext(tempNode.getNext().getNext());
        System.out.println("size of linklist:" + size());
    }

    public int size() {
        Integer tempNode = this.head;
        int size = 0;
        while (tempNode != null) {
            size++;
            tempNode = tempNode.getNext();
        }
        return size;
    }


    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer(" Nodes:-> ");
        Integer tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);

    }


}
