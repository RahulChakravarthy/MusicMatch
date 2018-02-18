package rdm.qhacks.com.musicmatch.Model.Requests;


import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;

public class MusicFetchRequest<T>  extends Request<T> {

    public MusicFetchRequest(int method, String url, Response.ErrorListener listener) {
        super(method, url, listener);
    }

    @Override
    protected Response<T> parseNetworkResponse(NetworkResponse response) {
        return null;
    }

    @Override
    protected void deliverResponse(T response) {

    }
}
