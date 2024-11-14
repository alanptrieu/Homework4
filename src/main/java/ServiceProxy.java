import java.util.*;

public class ServiceProxy implements SongService {
    private Service service;
    private Map<Integer, Song> songCacheId;
    private Map<String, List<Song>> songCacheTitle;
    private Map<String, List<Song>> songCacheAlbum;

    public ServiceProxy(List<Song> songs) {
        service = new Service(songs);
        songCacheId = new HashMap<>();
        songCacheTitle = new HashMap<>();
        songCacheAlbum = new HashMap<>();
    }

    @Override
    public Song searchById(Integer songId){
        if (songCacheId.containsKey(songId)){
            return songCacheId.get(songId);
        }
        Song song = service.searchById(songId);
        if (song != null){
            songCacheId.put(songId, song);
        } return song;
    }

    @Override
    public List<Song> searchByTitle(String title){
        if (songCacheTitle.containsKey(title)){
            return songCacheTitle.get(title);
        }
        List<Song> songs = service.searchByTitle(title);
        if (songs != null){
            songCacheTitle.put(title, songs);
        } return songs;
    }

    @Override
    public List<Song> searchByAlbum(String album){
        if (songCacheAlbum.containsKey(album)){
            return songCacheAlbum.get(album);
        }
        List<Song> songs = service.searchByAlbum(album);
        if (songs != null){
            songCacheAlbum.put(album, songs);
        } return songs;
    }
}
