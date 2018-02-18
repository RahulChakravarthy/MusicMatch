package rdm.qhacks.com.musicmatch.Model.DataObject;

import java.util.ArrayList;

/**
 * This is the InputPlaylistDO DataObject which is a group of songs
 */
public class InputPlaylistDO extends PlaylistDO {
    public InputPlaylistDO(String title) {
        super(title);
    }

    public InputPlaylistDO(ArrayList<SongDO> setOfSongs, String title) {
        super(setOfSongs, title);
    }
}
