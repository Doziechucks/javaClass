package diaryapp;

import java.util.ArrayList;

public class Diary {

    private ArrayList<Entry> entries;
    private String username;
    private String password;
    private boolean isLocked;
    private int id;


    public Diary(String username, String password) {
        setUserName(username);
        setPin(password);
        entries = new ArrayList<>();
        this.isLocked = true;
        this.id = 1;

    }

    private void setPin(String password) {
        if (password.isEmpty() == true) throw new IllegalArgumentException("invalid password");
        if (password.contains(" ") == true) throw new IllegalArgumentException("invalid password");
    }

    private void setUserName(String username) {
        if (username.isEmpty() == true) throw new IllegalArgumentException("invalid username");
        if (username.contains(" ") == true) throw new IllegalArgumentException("invalid username");
    }


    public void createEntry(String title, String body) {
        Entry entry = new Entry( id++, title, body);
        entries.add(entry);
    }

    public String getTitle(int id) {
        if(findEntryById(id) == -1) throw new IllegalArgumentException("invalid Id");
        int index = findEntryById(id);
        return entries.get(index).getTitle();
    }

    public int findEntryById(int id){
        validateId(id);
            for(Entry entry: this.entries)
                if (id == entry.getId()) return entries.indexOf(entry);
        return -1;
    }

    public void validateId(int id){
        if(id < 1 && String.valueOf(id).isEmpty()) throw new IllegalArgumentException("invalid Id");
    }

    public void unlockDiary() {
        this.isLocked = false;
    }

    public boolean isLocked(){
        return this.isLocked;
    }

    public void lockDiary(){
        this.isLocked = true;
    }

    public int getSize() {
        return this.entries.size();
    }

    public void deleteEntry(int id) {
        for(Entry entry: entries)
            if (id == entry.getId()) entries.remove(findEntryById(id));
    }
}
