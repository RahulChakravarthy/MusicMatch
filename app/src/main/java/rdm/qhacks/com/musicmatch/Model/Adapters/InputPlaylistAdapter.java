package rdm.qhacks.com.musicmatch.Model.Adapters;


import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import rdm.qhacks.com.musicmatch.Model.DataObject.Music.InputPlaylistDO;
import rdm.qhacks.com.musicmatch.Model.DataObject.Music.SongDO;
import rdm.qhacks.com.musicmatch.R;

public class InputPlaylistAdapter extends RecyclerView.Adapter<InputPlaylistAdapter.InputSongDOViewHolder> {

    private InputPlaylistDO inputPlaylistDO = new InputPlaylistDO();

    // Nested class to initialize the views of rows
    static class InputSongDOViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView songName;
        TextView fileSize;
        ImageView removeButton;

        public InputSongDOViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            songName = itemView.findViewById(R.id.Title);
            fileSize = itemView.findViewById(R.id.Size);
            removeButton = itemView.findViewById(R.id.RemoveButton);

        }
        @Override
        public void onClick(View view) {
            //do nothing
        }

        @SuppressLint("DefaultLocale")
        public void bindData(SongDO songDO){
            this.songName.setText(songDO.getSongName());
            this.fileSize.setText(String.format("%d", songDO.getFileSize()));
        }
    }


    @Override
    public InputSongDOViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(parent.getContext()).inflate(R.layout.input_song_item, parent, false);
        return new InputSongDOViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(InputSongDOViewHolder holder, int position) {
        SongDO songDO = inputPlaylistDO.getSetOfSongs().get(position);
        holder.bindData(songDO);
    }

    @Override
    public int getItemCount() {
        return this.inputPlaylistDO.getSetOfSongs().size();
    }

    /**
     * Updates the current selection of SongDO's with a new one
     */
    public void swapData(){

    }
}
