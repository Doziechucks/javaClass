package dsa;

public class MyStack {
    MyList myList = new MyList();
    private int size = 0;

    public void add(String item){
        myList.add(item);
        size++;
    }


    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
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
        sb.append("]");
        return sb.toString();
    }

    public void remove() {
        size--;
    }
}
