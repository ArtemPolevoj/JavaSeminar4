import java.util.LinkedList;

public class MyList {
    LinkedList<Integer> myList;
    public MyList(LinkedList<Integer> listInt) {
        this.myList = listInt;
    }
    public LinkedList<Integer> reverse(LinkedList<Integer> listInt){
        LinkedList<Integer> temp = new LinkedList<>();
        for (Integer i: listInt) {
            temp.addFirst(i);
        }
        return temp;
    }
    void enqueue(int value){
        this.myList.add(value);
    }
    int dequeue(){
        return  myList.removeFirst();
    }
    int first(){
        return myList.getFirst();
    }

    public LinkedList<Integer> getMyList() {
        return myList;
    }
}
