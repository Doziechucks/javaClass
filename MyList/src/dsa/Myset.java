package dsa;



public class Myset {

    MyList myList = new MyList();

    private int size = 0;


    public void add(String value) {
        if (myList.contains(value) == false) {
            myList.add(value);
            this.size = myList.size();
        }
    }

    public int size(){
        return myList.size();
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("\"");
        for (int number = 0; number < size; number++) {
            if (number < size - 1) {
                sb.append(myList.getList()[number]);
                sb.append("\", \"");
            } else {
                sb.append(myList.getList()[number]);
                sb.append("\"");
            }
        }
        sb.append("}");
        return sb.toString();
    }


    public void remove(String item) {
        myList.remove(item);
        this.size = myList.size();
    }


}
