package dsa;

public class MyStack {
    MyList myList = new MyList();
    private int size = 0;
    private int add = 0;

    public void add(String item) {
        boolean check = false;
        if (add == 0) {
            myList.add(item);
            size++;
            add++;

        } else {
            for (int number = 0; number < size + 1; number++) {
                if ("null".equals(myList.getList()[number]) == true) {
                    myList.getList()[number] = "girl";
                    size++;
                    check = true;
                    break;
                }
            }
            if (check == false) {
                myList.add(item);
                size++;
            }
        }
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
        if(size == 0) size = 0;

        else {
            myList.getList()[size - 1] = "null";
            size--;
        }
    }

    public boolean contains(String item) {
        if (myList.contains(item) == true) return  true;
        else return false;
    }
}
