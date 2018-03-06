package rdm.qhacks.com.musicmatch.Model.DataObject.Music;


import java.util.ArrayList;

public class ReturnPlaylistDO extends PlaylistDO {

    public ReturnPlaylistDO(String title) {
        super(title);
    }

    public ReturnPlaylistDO(ArrayList<SongDO> setOfSongs, String title) {
        super(setOfSongs, title);
    }

    public ReturnPlaylistDO(){}
}
