package rdm.qhacks.com.musicmatch.Model.Requests;


import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;

import java.io.UnsupportedEncodingException;

public class MusicFetchRequest<T>  extends Request<T> {

    public MusicFetchRequest(int method, String url, Response.ErrorListener listener) {
        super(method, url, listener);
        
    }

    @Override
    protected Response<T> parseNetworkResponse(NetworkResponse response) {
        try {
            String responseString = new String(response.data, HttpHeaderParser.parseCharset(response.headers));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void deliverResponse(T response) {

    }
}
