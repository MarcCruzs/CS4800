package HW7.proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProxySongService implements SongService {
    private RealSongService realSongService;
    private Map<Integer, Song> IDCache;
    private Map<String, List<Song>> titleCache;
    private Map<String, List<Song>> albumCache;

    public ProxySongService() {
        this.realSongService = new RealSongService();
        this.IDCache = new HashMap<>();
        this.titleCache = new HashMap<>();
        this.albumCache = new HashMap<>();
    }

    @Override
    public Song searchById(Integer songID) {
        Song cachedSong = IDCache.get(songID);
        if (cachedSong != null) {
            System.out.println("Song found in cache:");
            return cachedSong;
        }

        Song song = realSongService.searchById(songID);
        if (song != null) {
            IDCache.put(songID, song);
            System.out.println("Song fetched from server and cached:");
        }
        return song;
    }

    @Override
    public List<Song> searchByTitle(String title) {
        List<Song> cachedTitles = titleCache.get(title);
        if (cachedTitles != null) {
            System.out.println("Title found in cache:");
            return cachedTitles;
        }

        List<Song> songs = realSongService.searchByTitle(title);
        if (songs != null){
            titleCache.put(title, songs);
            System.out.println("Songs fetched from server and cached:");

        }
        return songs;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        List<Song> cachedAlbum = albumCache.get(album);
        if (cachedAlbum != null) {
            System.out.println("Album found in cache:");
            return cachedAlbum;
        }

        List<Song> songs = realSongService.searchByAlbum(album);
        if (songs != null){
            albumCache.put(album, songs);
            System.out.println("Songs fetched from server and cached:");

        }
        return songs;
    }
}

