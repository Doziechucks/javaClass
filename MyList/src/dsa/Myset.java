package dsa;

import org.junit.jupiter.api.BeforeEach;

public class Myset {
    MyList myList = new MyList();


    private int size;
    private int capacity;


    public void add(String value) {
        if (myList.contains(value) == false) {
            myList.add(value);
        }
    }

    public int size(){
        return myList.size();
    }
    public String toString(){
        return myList.toString();
    }

    public void remove(String item) {
        myList.remove(item);
    }

}
