package rdm.qhacks.com.musicmatch.Model.Adapters;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class InputPlaylistAdapter extends RecyclerView.Adapter<InputPlaylistAdapter.InputSongDOViewHolder>{

    // Nested class to initialize the views of rows
    static class InputSongDOViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public InputSongDOViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View view) {

        }
    }

    @Override
    public InputSongDOViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(InputSongDOViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
