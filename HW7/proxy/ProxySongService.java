package HW7.proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProxySongService implements SongService {
    private RealSongService realSongService;
    private Map<Integer, Song> cache;

    public ProxySongService() {
        this.realSongService = new RealSongService();
        this.cache = new HashMap<>();
    }

    @Override
    public Song searchById(Integer songID) {
        Song cachedSong = cache.get(songID);
        if (cachedSong != null) {
            System.out.println("Song found in cache:");
            return cachedSong;
        }

        Song song = realSongService.searchById(songID);
        if (song != null) {
            cache.put(songID, song);
            System.out.println("Song fetched from server and cached:");
        }
        return song;
    }

    @Override
    public List<Song> searchByTitle(String title) {
        return realSongService.searchByTitle(title);
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        return realSongService.searchByAlbum(album);
    }
}

