package dsa;

public class MyMap {
    MyList list = new MyList();
    Myset set = new Myset();
    private int size = 0;


    public int isEmpty() {
        return size;
    }

    public void add(String key, String value) {
        list.add(value);
        set.add(key);
        size ++;
    }

    public int size(){
        return  size;
    }

    public String keys() {
        return set.toString();
    }

    public String values() {
        return list.toString();
    }

   public String mapPrint(){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for(int number = 0; number < size -1; number++){
            sb.append("\"");
            sb.append(set.myList.getList()[number]);
            sb.append("\": \"");
            sb.append(list.getList()[number]);
            sb.append("\", ");
        }
        sb.append("\"");
        sb.append(set.myList.getList()[size - 1]);
        sb.append("\": \"");
        sb.append(list.getList()[size - 1]);
        sb.append("\"");
        sb.append("}");
        return sb.toString();
    }

    public void changeValue(String key, String newValue) {
        for(int number = 0; number < size; number++){
            if(set.myList.getList()[number].equals(key)){
                list.getList()[number] = newValue;
            }
        }

    }

    public void remove(String key) {
        for(int number = 0; number < size; number++){
            if(set.myList.getList()[number].equals(key)){
                set.remove(key);
                list.remove(list.getList()[number]);
                break;

            }

        }
        size--;
    }
}
