package HW7.proxyTest;

import HW7.proxy.Song;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SongTest {

    private Song song;

    @BeforeEach
    void setUp() {
        song = new Song("Title", "Artist", "Album", 240); // 240 seconds = 4 minutes
    }

    @Test
    void getTitle() {
        assertEquals("Title", song.getTitle());
    }

    @Test
    void getArtist() {
        assertEquals("Artist", song.getArtist());
    }

    @Test
    void getAlbum() {
        assertEquals("Album", song.getAlbum());
    }

    @Test
    void getDuration() {
        assertEquals(240, song.getDuration());
    }

    @Test
    void testToString() {
        assertEquals("Title - Artist - Album - 240", song.toString());
    }
}
