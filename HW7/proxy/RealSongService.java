package HW7.proxy;

import java.util.ArrayList;
import java.util.List;

public class RealSongService implements SongService {
    // Simulate a database of songs
    private List<Song> songs = new ArrayList<>();

    public RealSongService() {
        // Initialize songs (you can add more)
        songs.add(new Song("Song1", "Artist1", "Album1", 240));
        songs.add(new Song("Song2", "Artist2", "Album2", 180));
        songs.add(new Song("Song3", "Artist1", "Album3", 300));
    }

    @Override
    public Song searchById(Integer songID) {
        simulateServerDelay();
        // Simulate searching by ID
        for (Song song : songs) {
            if (song.getTitle().equals("Song" + songID)) {
                return song;
            }
        }
        return null;
    }

    @Override
    public List<Song> searchByTitle(String title) {
        simulateServerDelay();
        // Simulate searching by title
        List<Song> result = new ArrayList<>();
        for (Song song : songs) {
            if (song.getTitle().toLowerCase().contains(title.toLowerCase())) {
                result.add(song);
            }
        }
        return result;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        simulateServerDelay();
        // Simulate searching by album
        List<Song> result = new ArrayList<>();
        for (Song song : songs) {
            if (song.getAlbum().toLowerCase().contains(album.toLowerCase())) {
                result.add(song);
            }
        }
        return result;
    }

    private void simulateServerDelay() {
        try {
            Thread.sleep(1000); // Simulate 1 second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

