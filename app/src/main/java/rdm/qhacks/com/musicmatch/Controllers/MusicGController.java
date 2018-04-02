package rdm.qhacks.com.musicmatch.Controllers;


import com.musicg.wave.Wave;
import com.musicg.wave.WaveFileManager;

import java.io.File;

import rdm.qhacks.com.musicmatch.Model.DataObject.Music.MusicModel.BaseMusicModel;

/**
 * Main controller for initialization and setup of MusicG api
 */
public class MusicGController extends BaseController {

    public MusicGController(){
    }

    public BaseMusicModel processSong(File file){
        Wave wave = new Wave(file.getAbsolutePath());
        wave.leftTrim(1);
        wave.rightTrim(0.5D);
        return null;
    }

}
