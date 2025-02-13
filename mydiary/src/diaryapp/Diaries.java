package diaryapp;

import java.util.ArrayList;

public class Diaries {
    private ArrayList<Diary> diaries;

    public Diaries(){
        diaries = new ArrayList<>();
    }

    public void add(String userName, String password){
        Diary diary = new Diary(userName, password);
        diaries.add(diary);
    }


    public Diary findByUserName(String userName){
        return diaries.stream()
                .filter((diary) -> diary.isUsername(userName))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);

//        for(Diary diary: diaries) {
//            if (diary.isUsername(userName)) {
//                return diary;
//            }
//        }
//        throw new IllegalArgumentException("Invalid username");
    }

    public int getSize(){
        return diaries.size();
    }

    public void delete(String userName, String password){
        Diary diary = findByUserName(userName);
        if (diary.validatePassword(password) == true) diaries.remove(diary);
        else throw new IllegalArgumentException("invalid password");
        }

    public static void main(String[] args){
        Diary diary = new Diary("userName", "password");
        System.out.println(diary.getUsername());
    }
}
