package rdm.qhacks.com.musicmatch.Model.DataObject.Music.MusicModel;


import org.json.JSONObject;

import java.util.HashMap;

/**
 * Basic Music model data object
 */
public class MusicModelDO extends BaseMusicModel {

    private int tempoBeatsPerMinute;
    private GENRE genre;

    //Interface for indicating what genre of music this is
    interface GENRE {
        enum INSTRUMENTAL implements GENRE {
            RENAISSANCE, BAROQUE, CLASSICAL, ROMANTIC, CONTEMPORARY, MODERN
        }
        enum LYRICAL  implements  GENRE {
            JAZZ, POP, RAP
        }

        enum ELECTRONIC implements  GENRE {
            EDM, TRAP, DUBSTEP
        }
    }


    public MusicModelDO(int tempoBeatsPerMinute){
        this.tempoBeatsPerMinute = tempoBeatsPerMinute;


    }



    @Override
    public JSONObject getProcessedContents() {

        return this.buildSongProperties();
    }

    private JSONObject buildSongProperties() {

        return new JSONObject(new HashMap());
    }
}
