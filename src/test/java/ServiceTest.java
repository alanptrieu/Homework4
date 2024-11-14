import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    private SongService songService;

    @BeforeEach
    void setUp() {
        List<Song> songs = Arrays.asList(
                new Song("Test", "Test", "Test", 100, 1)
        );

        songService = new ServiceProxy(songs);
    }

    @Test
    void searchById() {
        Song song = songService.searchById(1);
        assertNotNull(song);
        assertEquals("Test", song.getTitle());
        assertEquals("Test", song.getArtist());
        assertEquals(100, song.getDuration());
        assertEquals(1, song.getId());
    }

    @Test
    void searchByTitle() {
        List<Song> songs = songService.searchByTitle("Test");
        assertNotNull(songs);
        Song song = songs.get(0);
        assertEquals("Test", song.getTitle());
    }

    @Test
    void searchByAlbum() {
        List<Song> songs = songService.searchByAlbum("Test");
        assertNotNull(songs);
        Song song = songs.get(0);
        assertEquals("Test", song.getAlbum());
    }
}