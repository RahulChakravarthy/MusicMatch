package rdm.qhacks.com.musicmatch.Controllers;

import java.util.ArrayList;
import java.util.List;

/**
 * This controller handles all requests made to Youtube's data service api in order to request audio songs
 */
public class YoutubeRequestController extends BaseController {

    public YoutubeRequestController(){

    }

    /**
     * Takes in the appropriate query parameters and makes a youtube search to find similar songs,
     * For copyright reasons we do not download the song, but rather send as much meta data back to the user's phone
     * so they can research it themselves
     * @return
     */
    public List<String> fetchSimilarMusic(){
        return new ArrayList<>();
    }


}
