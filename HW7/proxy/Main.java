package HW7.proxy;

public class Main {
    public static void main(String[] args) {
        SongService songService = new ProxySongService();

        // Test searching for songs
        System.out.println("Searching by ID:");
        System.out.println(songService.searchById(1));
        System.out.println(songService.searchById(2));
        System.out.println(songService.searchById(1));

        // Test searching by title
        System.out.println("\nSearching by Title:");
        System.out.println(songService.searchByTitle("song1"));
        System.out.println(songService.searchByTitle("song3"));
        System.out.println(songService.searchByTitle("song1"));


        // Test searching by album
        System.out.println("\nSearching by Album:");
        System.out.println(songService.searchByAlbum("album2"));
        System.out.println(songService.searchByAlbum("album1"));
        System.out.println(songService.searchByAlbum("album2"));
    }
}

