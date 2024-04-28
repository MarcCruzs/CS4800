package HW7.proxyTest;

import HW7.proxy.RealSongService;
import HW7.proxy.Song;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RealSongServiceTest {

    private RealSongService realSongService;

    @BeforeEach
    void setUp() {
        realSongService = new RealSongService();
    }

    @Test
    void searchById() {
        // Test searching by ID for an existing song
        Song song1 = realSongService.searchById(1);
        assertNotNull(song1);
        assertEquals("Song1", song1.getTitle());
        assertEquals("Artist1", song1.getArtist());
        assertEquals("Album1", song1.getAlbum());
        assertEquals(240, song1.getDuration());

        // Test searching by ID for a non-existing song
        Song nonExistingSong = realSongService.searchById(100);
        assertNull(nonExistingSong);
    }

    @Test
    void searchByTitle() {
        // Test searching by title for existing songs
        List<Song> songs1 = realSongService.searchByTitle("Song");
        assertNotNull(songs1);
        assertEquals(5, songs1.size());

        List<Song> songs2 = realSongService.searchByTitle("Song3");
        assertNotNull(songs2);
        assertEquals(1, songs2.size());
        assertEquals("Song3", songs2.get(0).getTitle());

        // Test searching by title for a non-existing song
        List<Song> nonExistingSongs = realSongService.searchByTitle("Non-existing title");
        assertNotNull(nonExistingSongs);
        assertEquals(0, nonExistingSongs.size());
    }

    @Test
    void searchByAlbum() {
        // Test searching by album for existing songs
        List<Song> songs1 = realSongService.searchByAlbum("Album1");
        assertNotNull(songs1);
        assertEquals(2, songs1.size());

        List<Song> songs2 = realSongService.searchByAlbum("Album3");
        assertNotNull(songs2);
        assertEquals(1, songs2.size());
        assertEquals("Album3", songs2.get(0).getAlbum());

        // Test searching by album for a non-existing album
        List<Song> nonExistingAlbumSongs = realSongService.searchByAlbum("Non-existing album");
        assertNotNull(nonExistingAlbumSongs);
        assertEquals(0, nonExistingAlbumSongs.size());
    }
}
