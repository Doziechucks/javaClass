package diaryapp;
import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEntry {
    Entry entry;

    @BeforeEach
    public void setDiary() {
        entry = new Entry(1,"sensational", "get this money");
    }
    @Test
    public void test_IfLocalDateIsReturned(){
        LocalDateTime actual = entry.getDateCreated();
        LocalDateTime expected = LocalDateTime.now().withSecond(0).withNano(0);
        assertEquals(expected, actual);
    }
    @Test
    public void test_ifItTitelIsNotNull(){
        String actual = entry.getTitle();
        String expected = "sensational";
        assertEquals(expected, actual);
    }
}
