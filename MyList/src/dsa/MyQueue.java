package dsa;
import java.lang.StringBuilder;
public class MyQueue {

    MyList myList = new MyList();

    private int size = 0;
    private int capacity = 3;
    private String[] words = new String[capacity];


    public void add(String item){
        if (size > 0) {
            if (myList.getList()[size] == "null") myList.getList()[size] = item;
            else myList.add(item);
        }
        else myList.add(item);
        this.size = myList.size();
    }

    public int size() {
        return myList.size();

    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int number = 0; number < size; number++) {
            if (number < size - 1) {
                sb.append("\"");
                sb.append(myList.getList()[number]);
                sb.append("\", ");
            } else {
                sb.append("\"");
                sb.append(myList.getList()[number]);
                sb.append("\"");
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public void remove() {
        for (int number = 0; number < size - 1; number++) {
            myList.getList()[number] = myList.getList()[number + 1];
        }
        myList.getList()[size-1] = "null";
        size--;
    }


}
