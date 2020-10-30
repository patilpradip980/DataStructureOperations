import org.junit.*;

public class LInkedListTestCases {

    @Test
    public void given3Numbers_WhenLinked_ShouldPassedLinkedList() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                mySecondNode.getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3Numbers_When70AddedFirstToLinkedList_ShouldPassResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myThirdNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3Numbers_When56AddedFirstToLinkedList_ShouldPassResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3Numbers_When30AddedBetweenToLinkedList_ShouldPassResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode, mySecondNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);

        Assert.assertTrue(result);

    }

    @Test
    public void given3Numbers_WhenDeleteFirst_ShouldPassResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.pop();
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(mySecondNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3Numbers_WhenDeleteLast_ShouldPassResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.popLast();
        boolean result = myLinkedList.tail.equals(mySecondNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3Number_searchForValue_shouldPassResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList<MyNode<Integer>> myLinkedList = new MyLinkedList<>();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();
        INode searchNode = myLinkedList.search(mySecondNode);
        Assert.assertEquals(mySecondNode, searchNode);
    }

    @Test
    public void providedLinkedList_WhenInsertProvidedNode_ShouldReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyNode<Integer> newNode = new MyNode<>(40);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.insert(mySecondNode, newNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myFirstNode) && mySecondNode.getNext().equals(newNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given4Numbers_WhenDeletingMiddle_shouldPassResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(40);
        MyNode<Integer> myFourthNode = new MyNode<>(70);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.append(myFourthNode);
        myLinkedList.deleteInMiddle(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode);
        myLinkedList.tail.equals(myFourthNode);
        Assert.assertTrue(result);

    }
}
