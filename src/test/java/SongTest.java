import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SongTest {

    private Song song;

    @BeforeEach
    void setUp() {
        song = new Song("Test", "Test", "Test", 60, 1);
    }

    @Test
    void getTitle() {
        assertEquals("Test", song.getTitle());
    }

    @Test
    void getArtist() {
        assertEquals("Test", song.getArtist());
    }

    @Test
    void getAlbum() {
        assertEquals("Test", song.getAlbum());
    }

    @Test
    void getDuration() {
        assertEquals(60, song.getDuration());
    }

    @Test
    void getId() {
        assertEquals(1, song.getId());
    }
}