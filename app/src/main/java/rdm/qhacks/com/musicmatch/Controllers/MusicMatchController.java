package rdm.qhacks.com.musicmatch.Controllers;


import rdm.qhacks.com.musicmatch.Controllers.CallBack.StringCallBack;
import rdm.qhacks.com.musicmatch.Model.DataObject.PlaylistDO;

/**
 * This controller handles the request and recieving of music
 */
public class MusicMatchController extends BaseController {

    final private String WebRestEndpoint = "http://www.google.com";

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
    public void sendPlaylistToServer(PlaylistDO playlistDO){

    }
}
