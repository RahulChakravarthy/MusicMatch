package rdm.qhacks.com.musicmatch.Model.Requests;


import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;

/**
 * This class handles multipart requests
 */
public class MultipartRequest extends Request<NetworkResponse> {

    public MultipartRequest(int method, String url, Response.ErrorListener listener) {
        super(method, url, listener);
    }

    @Override
    protected Response<NetworkResponse> parseNetworkResponse(NetworkResponse response) {
        return null;
    }

    @Override
    protected void deliverResponse(NetworkResponse response) {

    }
}
