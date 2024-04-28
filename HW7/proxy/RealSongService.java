package HW7.proxy;

import java.util.ArrayList;
import java.util.List;

public class RealSongService implements SongService {
    private List<Song> songs = new ArrayList<>();

    public RealSongService() {
        songs.add(new Song("Song1", "Artist1", "Album1", 240));
        songs.add(new Song("Song2", "Artist2", "Album2", 180));
        songs.add(new Song("Song3", "Artist1", "Album1", 300));
        songs.add(new Song("Song4", "Artist3", "Album3", 124));
        songs.add(new Song("Song5", "Artist3", "Album4", 321));
    }

    @Override
    public Song searchById(Integer songID) {
        simulateServerDelay();
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

