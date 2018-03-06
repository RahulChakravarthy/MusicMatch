package rdm.qhacks.com.musicmatch.Model.Adapters;


import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import rdm.qhacks.com.musicmatch.Model.DataObject.Music.ReturnPlaylistDO;
import rdm.qhacks.com.musicmatch.Model.DataObject.Music.SongDO;
import rdm.qhacks.com.musicmatch.R;

public class ReturnPlaylistAdapater extends RecyclerView.Adapter<ReturnPlaylistAdapater.ReturnSongDOViewHolder>{

    private ReturnPlaylistDO returnPlaylistDO = new ReturnPlaylistDO();

    public static class ReturnSongDOViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView songName;
        TextView fileSize;
        ImageView removeButton;

        public ReturnSongDOViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            songName = itemView.findViewById(R.id.return_song_title);
            fileSize = itemView.findViewById(R.id.return_file_size);
            removeButton = itemView.findViewById(R.id.return_remove_button);
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
    public ReturnSongDOViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflatedView = LayoutInflater.from(parent.getContext()).inflate(R.layout.input_song_item, parent, false);
        return new ReturnSongDOViewHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder(ReturnSongDOViewHolder holder, int position) {
        SongDO songDO = returnPlaylistDO.getSetOfSongs().get(position);
        holder.bindData(songDO);
    }

    @Override
    public int getItemCount() {
        return returnPlaylistDO.getSetOfSongs().size();
    }

    /**
     * Updates the current selection of SongDO's with a new one
     */
    public void swapData(){

    }
}
