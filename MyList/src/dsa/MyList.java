package dsa;
import java.lang.StringBuilder;
public class MyList {
    private int size;
    private int capacity;
    private String[] words = new String[3];

    public String[] add(String word) {
        words[size++] = word;
        if (size == capacity) increaseCapacity(size);

        return words;
    }

    public String[] increaseCapacity(int size) {
        String[] elements = new String[size * 2];
        for (int number = 0; number < size; number++) {
            elements[number] = words[number];
        }
        words = elements;
        return words;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append("\"");
        for (int number = 0; number < size; number++) {
            if (number < size) {
                sb.append(words[number]);
                sb.append("\", \"");
            } else sb.append(words[number]);
        }
        sb.append("]");

        return sb.toString();
    }

    public boolean contains(String word) {
        for (int number = 0; number < size; number++) {
            if (word.equals(words[number])) return true;
            else return false;
        }
        return false;
    }
}

   /*** public String[] remove(String item) {
        if (words.contains() == true) words[index()]) = null;
            for(int number = index; number < size){
                words[number] = words[number + 1]
            }

        return words;
        }

}
    ***/
