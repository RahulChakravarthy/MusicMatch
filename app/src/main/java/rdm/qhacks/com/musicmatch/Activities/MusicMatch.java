package rdm.qhacks.com.musicmatch.Activities;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.ActivityCompat;
import android.view.Window;
import android.widget.Toast;

import java.io.File;

import rdm.qhacks.com.musicmatch.Controllers.MediaFileVerifierController;
import rdm.qhacks.com.musicmatch.Controllers.MusicMatchController;
import rdm.qhacks.com.musicmatch.Model.DataObject.SongDO;
import rdm.qhacks.com.musicmatch.R;
import rdm.qhacks.com.musicmatch.Services.NetworkService;
import rdm.qhacks.com.musicmatch.Utility.FileManagerUtils;
import rdm.qhacks.com.musicmatch.View.MusicMatchView;
import rdm.qhacks.com.musicmatch.View.ParentView;

public class MusicMatch extends BaseActivity {

    private ParentView musicMatchView; //View for this activity
    private MusicMatchController musicMatchController; //Controller for this activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_music_match);

        startNetworkService(); //set up netowork service
        setupView(); //set up view
        initializeController(); //initialize activity controllers
        getAccessFilePermission(); //Request permissions

    }

    /**
     * Helper method to start the Network service
     * To-do try to abstract this code
     */
    private void startNetworkService() {
        Intent intent = new Intent(this, NetworkService.class);
        startService(intent);
    }

    /**
     *  Get permission from the user to acceess storage files
     */
    public void getAccessFilePermission() {
        ActivityCompat.requestPermissions(MusicMatch.this,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},1);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String permissions[], @NonNull int[] grantResults) {
        switch (requestCode) {
            case 1: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // permission granted and now can proceed
                    // Enable the file access button
                    this.musicMatchView.getViewByName("FileFetchButton").setEnabled(true);

                } else {
                    // permission denied,
                    // disable the file access button and send toast
                    Toast.makeText(MusicMatch.this, "Permission denied to read your External storage", Toast.LENGTH_SHORT).show();
                    this.musicMatchView.getViewByName("FileFetchButton").setEnabled(false);
                }
            }
        }
    }

    /**
     * Setup view and all view related listeners
     */
    @Override
    protected void setupView(){
        ConstraintLayout activityLayout = findViewById(R.id.MusicMatchLayout);
        this.musicMatchView = new MusicMatchView(activityLayout, getApplicationContext());
        this.musicMatchView.setupLayout();
        accessFiles();
        sendMusicToServer();
    }

    /**
     *  Setup controller if need be
     */
    @Override
    protected void initializeController() {
        this.musicMatchController = new MusicMatchController();
    }

    /* Business Logic Here*/

    /**
     * Set up file fetch button
     */
    protected void accessFiles(){
        this.musicMatchView.getViewByName("FileFetchButton").setOnClickListener(view -> {
            Intent fileFetchIntent = new Intent();
            fileFetchIntent.setType("*/*");
            fileFetchIntent.setAction(Intent.ACTION_GET_CONTENT);
            startActivityForResult(fileFetchIntent, 7);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 7:
                try{
                    File songFile = new File(FileManagerUtils.getPath(this, data.getData()));
                    if (!MediaFileVerifierController.isFileValid(songFile)){
                        Toast.makeText(MusicMatch.this,"This file is not the correct file format", Toast.LENGTH_LONG).show();
                    } else {
                        this.musicMatchController.addSongtoInputPlaylist(new SongDO(songFile.getAbsolutePath())); //Add song to list
                        //Update recyclerview with new inputted song
                    }

                } catch (NullPointerException e){
                    //do nothing
                }
                break;
        }
    }

    protected void sendMusicToServer(){
        this.musicMatchView.getViewByName("FetchMusicButton").setOnClickListener(view -> {
            this.musicMatchController.sendPlaylistToServer();
        });
    }

}
