import java.util.*;

public class Service implements SongService {
    private List<Song> songs;

    public Service(List<Song> songs){
        this.songs = songs;
    }

    @Override
    public Song searchById(Integer songId){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (Song song : songs){
            if (song.getId() == songId){
                return song;
            }
        }
        return null;
    }

    @Override
    public List<Song> searchByTitle(String title){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Song> result = new ArrayList<>();
        for (Song song : songs){
            if (song.getTitle().equals(title)){
                result.add(song);
            }
        }
        return result;
    }

    @Override
    public List<Song> searchByAlbum(String album){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Song> result = new ArrayList<>();
        for (Song song : songs){
            if (song.getAlbum().equals(album)){
                result.add(song);
            }
        }
        return result;
    }
}
