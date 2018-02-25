package rdm.qhacks.com.musicmatch.Model.Requests;


import com.android.volley.Response;

/**
 * All MusicRequests including posting songs to microsofts AML servers are done using instances of this class
 */
public class MusicRequest extends MultipartRequest {
    public MusicRequest(int method, String url, Response.ErrorListener listener) {
        super(method, url, listener);
    }


}
