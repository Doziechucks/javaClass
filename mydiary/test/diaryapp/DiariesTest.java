package diaryapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiariesTest {
    Diaries diaries;

    @BeforeEach
    public void setUp() {
        diaries = new Diaries();
    }

    @Test
    public void test_ifADiaryIsCreated() {
       diaries.add("omachoko", "1234");
       assertEquals(1, diaries.getSize());

    }

    @Test
    public void test_toDeleteDiary(){
        diaries.add("omachoko", "1234");
        diaries.add("omacho", "1244");
        diaries.delete("omachoko", "1234");
        assertEquals(1, diaries.getSize());
    }
}
