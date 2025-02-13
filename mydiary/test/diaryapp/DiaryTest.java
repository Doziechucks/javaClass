package diaryapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary diary;

    @BeforeEach
    public void setUp() {
        diary = new Diary("Dozie_Money", "1234");
    }

    @Test
    public void test_ifTitleWithId(){
        diary.createEntry("my Title", "my body of christ");
        String actual = diary.getTitle(1);
        String expected = "my Title";
        assertEquals(expected, actual);
    }

    @Test
    public void test_ifDiaryIsLocked(){
        diary.createEntry("my Title", "my body of christ");
        assertTrue(diary.isLocked());
        diary.unlockDiary();
        assertFalse(diary.isLocked());
        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test
    public void test_ifSizeIsReturned(){
        diary.createEntry("my Title", "my body of christ");
        diary.createEntry("Dozie", "must make money");
        assertEquals(2, diary.getSize());
    }

    @Test
    public void test_ifDeleteWorks(){
        diary.createEntry("my Title", "my body of christ");
        diary.createEntry("Dozie", "must make money");
        diary.deleteEntry(1);
        assertEquals(1, diary.getSize());
    }

    @Test
    public void test_ifIdReturnsEntry(){
        diary.createEntry("my Title", "my body of christ");
        diary.createEntry("Dozie", "must make money");
        String actual = diary.findEntryById(1).getBody();
        String expected = "my body of christ";
        assertEquals(expected, actual);
    }

    @Test
    public void test_ifEntryIsUpdated(){
        diary.createEntry("my Title", "my body of christ");
        diary.createEntry("Dozie", "must make money");
        diary.updateEntry(2, " no sleeping");
        String actual = diary.findEntryById(2).getBody();
        String expected = "must make money no sleeping";
        assertEquals(expected, actual);
    }



}
