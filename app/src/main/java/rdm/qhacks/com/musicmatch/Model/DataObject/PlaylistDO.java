package rdm.qhacks.com.musicmatch.Model.DataObject;


import java.util.ArrayList;
import java.util.List;

public class PlaylistDO extends DataObject {

    private List<SongDO> setOfSongs = new ArrayList<>();
    private String title;

    public PlaylistDO(String title){
        this.title = title;
    }

    public PlaylistDO(ArrayList<SongDO> setOfSongs, String title){
        this.setOfSongs = setOfSongs;
        this.title = title;
    }

    public void addSong(SongDO songDO){
        this.setOfSongs.add(songDO);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public List<SongDO> getSetOfSongs() {
        return setOfSongs;
    }

    public void setSetOfSongs(List<SongDO> setOfSongs) {
        this.setOfSongs = setOfSongs;
    }
}
