package diaryapp;

import java.util.ArrayList;

public class Diary {
    private static int currentId = 1;
    private final ArrayList<Entry> entries = new ArrayList<>();;
    private String username;
    private String password;
    private boolean isLocked;
    private int id;


    public Diary(String username, String password) {
        validateUsername(username);
        validatePin(password);
        this.username = username;
        this.password = password;
        this.isLocked = true;
        this.id = currentId++;

    }

    private void validatePin(String password) {
        if (password.isEmpty() == true) throw new IllegalArgumentException("invalid password");
        if (password.contains(" ") == true) throw new IllegalArgumentException("invalid password");
    }

    private void validateUsername(String username) {
        if (username.isEmpty() == true) throw new IllegalArgumentException("invalid username");
        if (username.contains(" ") == true) throw new IllegalArgumentException("invalid username");
    }


    public void createEntry(String title, String body) {
        Entry entry = new Entry( id++, title, body);
        entries.add(entry);
    }

    public String getTitle(int id) {
        if(getEntryById(id) == -1) throw new IllegalArgumentException("invalid Id");
        int index = getEntryById(id);
        return entries.get(index).getTitle();
    }

    public int getEntryById(int id){
        validateId(id);
            for(Entry entry: this.entries)
                if (id == entry.getId()) return entries.indexOf(entry);
        return -1;
    }

    public Entry findEntryById(int id){
        validateId(id);
        for(Entry entry: this.entries)
            if (id == entry.getId()) return entry;
        throw new IllegalArgumentException("Invalid id");
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
        validateId(id);
        for(Entry entry: entries)
            if (id == entry.getId()) entries.remove(findEntryById(id));
    }

    public void updateEntry(int id, String update) {
        StringBuilder sb = new StringBuilder();
        validateId(id);
        for(Entry entry: entries)
            if (id == entry.getId()) {
                 entry.setBody(entry.getBody().concat(update));

            }
    }
    public String getUsername(){
        return this.username;
    }

    public boolean validatePassword(String passwordInput){
        if(this.password.equals(passwordInput)) return true;
        else return false;
    }

    public boolean isUsername(String username){
        return this.username.equals(username);
    }

}
