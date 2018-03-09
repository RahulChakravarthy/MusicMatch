package rdm.qhacks.com.musicmatch.Model.Requests;


import com.android.volley.NetworkResponse;
import com.android.volley.Response;

import java.util.Map;

/**
 * All MusicRequests including posting songs to microsoft AML servers are done using instances of this class
 */
public class MusicRequest extends MultipartRequest {
    public MusicRequest(int method, String url, Response.Listener<NetworkResponse> mListener, Response.ErrorListener mErrorListener, Map<String, String> mHeaders, String mMimeType, byte[] mMultipartBody) {
        super(method, url, mListener, mErrorListener, mHeaders, mMimeType, mMultipartBody);

    }

    @Override
    protected Response<NetworkResponse> parseNetworkResponse(NetworkResponse response) {
        return null;
    }


}
