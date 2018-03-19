package rdm.qhacks.com.musicmatch.Model.DataObject.Music.MusicModel;

import org.json.JSONObject;

import rdm.qhacks.com.musicmatch.Model.DataObject.DataObject;

/**
 * Base model of pattern generation of a song
 */
public abstract class BaseMusicModel extends DataObject {
    public abstract JSONObject getProcessedContents();
}
