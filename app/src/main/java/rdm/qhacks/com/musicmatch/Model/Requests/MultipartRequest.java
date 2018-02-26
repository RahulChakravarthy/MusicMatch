package rdm.qhacks.com.musicmatch.Model.Requests;


import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;

import java.util.Map;

/**
 * This class handles multipart requests
 */
public abstract class MultipartRequest extends Request<NetworkResponse> {

    private final Response.Listener<NetworkResponse> mListener;
    private final Response.ErrorListener mErrorListener;
    private final Map<String, String> mHeaders;
    private final String mMimeType;
    private final byte[] mMultipartBody;

    public MultipartRequest(int method, String url, Response.Listener<NetworkResponse> mListener, Response.ErrorListener mErrorListener, Map<String, String> mHeaders, String mMimeType, byte[] mMultipartBody) {
        super(method, url, mErrorListener);
        this.mListener = mListener;
        this.mErrorListener = mErrorListener;
        this.mHeaders = mHeaders;
        this.mMimeType = mMimeType;
        this.mMultipartBody = mMultipartBody;
    }

    @Override
    public Map<String, String> getHeaders() throws AuthFailureError {
        return (mHeaders != null) ? mHeaders : super.getHeaders();
    }

    @Override
    public String getBodyContentType() {
        return mMimeType;
    }

    @Override
    public byte[] getBody() throws AuthFailureError {
        return mMultipartBody;
    }

    @Override
    protected void deliverResponse(NetworkResponse response) {
        mListener.onResponse(response);
    }

    @Override
    public void deliverError(VolleyError error) {
        mErrorListener.onErrorResponse(error);
    }
}
