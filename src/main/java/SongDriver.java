import java.util.*;

public class SongDriver {
    public static void main(String[] args) {
        List<Song> songs = Arrays.asList(
                new Song("Title1","Artist1","Album1",60, 1),
                new Song("Title2","Artist1","Album1",120, 2),
                new Song("Title3","Artist2","Album2",120, 3),
                new Song("Title3","Artist3","Album3",120, 3),
                new Song("Title4","Artist2","Album2",120, 4),
                new Song("Title5","Artist2","Album2",90, 5)
        );
        SongService service = new ServiceProxy(songs);

        System.out.println(service.searchById(1));
        System.out.println(service.searchByTitle("Title2"));
        System.out.println(service.searchById(1));
        System.out.println(service.searchByTitle("Title3"));
        System.out.println(service.searchByAlbum("Album2"));

    }
}
