package rdm.qhacks.com.musicmatch.Controllers;


import com.android.volley.Request;

import rdm.qhacks.com.musicmatch.Controllers.CallBack.StringCallBack;
import rdm.qhacks.com.musicmatch.Model.DataObject.InputPlaylistDO;
import rdm.qhacks.com.musicmatch.Model.DataObject.PlaylistDO;
import rdm.qhacks.com.musicmatch.Model.DataObject.SongDO;
import rdm.qhacks.com.musicmatch.Model.Requests.MusicFetchRequest;

/**
 * This controller handles the request and recieving of music
 */
public class MusicMatchController extends BaseController {

    final private String WebRestEndpoint = "http://www.google.com";
    private PlaylistDO playlistDO = new InputPlaylistDO();

    public MusicMatchController(){}

    /**
     * This method sends the appropriate request containing all the data to the Azure ML endpoint for processing
     * @return response of the request
     */
    public void sendFetchAndGetStringResponse(StringCallBack stringCallBack){
        RequestController.getInstance().newStringGetRequest(WebRestEndpoint, stringCallBack);
    }

    /**
     * This method sends a post request to the Microsoft Azure Servers along with the Music files to be parsed, utilizes custom request
     */
    public void sendPlaylistToServer(){
        MusicFetchRequest<PlaylistDO> requet = new MusicFetchRequest<>(Request.Method.POST, WebRestEndpoint, Throwable::printStackTrace);
    }

    public void addSongtoInputPlaylist(SongDO songDO){
        this.playlistDO.addSong(songDO);
    }

    public PlaylistDO getPlaylistDO(){
        return this.playlistDO;
    }
}
