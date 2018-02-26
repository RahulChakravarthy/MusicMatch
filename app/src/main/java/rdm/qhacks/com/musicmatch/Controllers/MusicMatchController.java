package rdm.qhacks.com.musicmatch.Controllers;


import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import rdm.qhacks.com.musicmatch.Controllers.CallBack.StringCallBack;
import rdm.qhacks.com.musicmatch.Model.DataObject.InputPlaylistDO;
import rdm.qhacks.com.musicmatch.Model.DataObject.PlaylistDO;
import rdm.qhacks.com.musicmatch.Model.DataObject.SongDO;
import rdm.qhacks.com.musicmatch.Model.Requests.MusicRequest;

/**
 * This controller handles the request and recieving of music
 */
public class MusicMatchController extends BaseController {

    final private String WebRestEndpoint = "http://www.google.com";
    private PlaylistDO playlistDO = new InputPlaylistDO();

    public MusicMatchController(){}

    /**
     * This method sends the appropriate request containing all the data to the Azure ML endpoint for processing
     * @param stringCallBack callback response
     */
    public void sendFetchAndGetStringResponse(StringCallBack stringCallBack){
        RequestController.getInstance().newStringGetRequest(WebRestEndpoint, stringCallBack);
    }

    /**
     * This method sends a post request to the Microsoft Azure Servers along with the Music files to be parsed, utilizes custom request
     */
    public void sendPlaylistToServer(){
        playlistDO.getSetOfSongs().forEach(songDO -> {
            try {
                //custom response listener
                Response.Listener<NetworkResponse> responseListener = response -> {
                    // no response since it's a post request
                };

                //Add custom error handling
                Response.ErrorListener errorListener = Throwable::getLocalizedMessage;

                //headers
                Map<String, String> headers = new HashMap<>();

                MusicRequest request = new MusicRequest(Request.Method.POST, WebRestEndpoint, responseListener, errorListener,
                        headers, songDO.getFileType(), IOUtils.toByteArray(FileUtils.openInputStream(songDO.getSongFile())));

                RequestController.getInstance().newMusicPostRequest(request);
            } catch (IOException e){
                e.printStackTrace();
            }
        });
    }

    public void addSongtoInputPlaylist(SongDO songDO){
        this.playlistDO.addSong(songDO);
    }

    public PlaylistDO getPlaylistDO(){
        return this.playlistDO;
    }
}
