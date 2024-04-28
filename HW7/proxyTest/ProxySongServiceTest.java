package HW7.proxyTest;

import HW7.proxy.ProxySongService;
import HW7.proxy.RealSongService;
import HW7.proxy.Song;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProxySongServiceTest {

    private ProxySongService proxySongService;

    @BeforeEach
    void setUp() {
        proxySongService = new ProxySongService();
    }

    @Test
    void searchById() {
        // Test searching by ID for an existing song
        Song song = proxySongService.searchById(1);
        assertNotNull(song);
        assertEquals("Song1", song.getTitle());
    }

    @Test
    void searchByTitle() {
        // Test searching by title for existing songs
        List<Song> songs = proxySongService.searchByTitle("Song1");
        assertNotNull(songs);
        assertEquals(1, songs.size());
        assertEquals("Song1", songs.get(0).getTitle());
    }

    @Test
    void searchByAlbum() {
        // Test searching by album for existing songs
        List<Song> songs = proxySongService.searchByAlbum("Album1");
        assertNotNull(songs);
        assertEquals(2, songs.size());
        assertEquals("Album1", songs.get(0).getAlbum());
        assertEquals("Album1", songs.get(1).getAlbum());
    }
}
