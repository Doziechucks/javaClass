package dsa;
import java.lang.StringBuilder;
public class MyList {

    private int size;
    private int capacity = 3;
    private String[] words = new String[capacity];

    public void add(String word) {
        words[size++] = word;
        if (size == capacity) increaseCapacity(size);

    }

    public String[] getList(){
        return words;
    }

    public String[] increaseCapacity(int size) {
        String[] elements = new String[capacity * 2];
        System.arraycopy(words, 0, elements, 0, size);
        words = elements;
        capacity = words.length;
        return words;
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
                sb.append(words[number]);
                sb.append("\", ");
            } else {
                sb.append("\"");
                sb.append(words[number]);
                sb.append("\"");
            }
        }
        sb.append("]");

        return sb.toString();
    }

    public boolean contains(String word) {
        for (int number = 0; number < size; number++) {
            if (word.equals(words[number])) return true;

        }
        return false;
    }

    public int index(String item) {

        if(contains(item)){
            for(int number = 0; number < size; number++) if(words[number].equals(item)) return number;

        }

    return 0;
    }


    public String[] remove(String item) {
        int number ;
        if (contains(item)) {
            for (number = index(item); number < size; number++) {
                words[number] = words[number + 1];
            }
            words[number + 1] = null;
            size--;
        }
        return words;
    }

}

