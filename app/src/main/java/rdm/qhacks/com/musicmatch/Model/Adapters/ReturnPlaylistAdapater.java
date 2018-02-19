package rdm.qhacks.com.musicmatch.Model.Adapters;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class ReturnPlaylistAdapater extends RecyclerView.Adapter<ReturnPlaylistAdapater.ReturnSongDOViewHolder>{

    public static class ReturnSongDOViewHolder extends RecyclerView.ViewHolder {
        public ReturnSongDOViewHolder(View itemView) {
            super(itemView);
        }
    }

    @Override
    public ReturnSongDOViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ReturnSongDOViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
