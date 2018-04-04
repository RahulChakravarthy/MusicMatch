package rdm.qhacks.com.musicmatch.Controllers;


import com.musicg.wave.Wave;
import com.musicg.wave.WaveFileManager;
import com.musicg.wave.WaveHeader;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.util.Arrays;

import rdm.qhacks.com.musicmatch.Model.DataObject.Music.MusicModel.BaseMusicModel;
import rdm.qhacks.com.musicmatch.Model.DataObject.Music.MusicModel.MusicModelDO;

/**
 * Main controller for initialization and setup of MusicG api
 */
public class MusicGController extends BaseController {

    public MusicGController(){
    }

    public BaseMusicModel processSong(File file) throws JSONException {
        Wave wave = getFileAsWave(file);

        JSONObject waveHeaderJSON = processWaveHeader(wave.getWaveHeader());
        JSONObject amplitudesJSON = processAmplitudes(wave.getNormalizedAmplitudes());
        double[] tempFreq = {1.0d, 2.0d};
        JSONObject pitchesJSON = processPitches(tempFreq);

        MusicModelDO musicModelDO = new MusicModelDO(10);

        //Add all the additional data
        musicModelDO.getProcessedContents().put("Wave Header", waveHeaderJSON);
        musicModelDO.getProcessedContents().put("Amplitudes", amplitudesJSON);
        musicModelDO.getProcessedContents().put("Pitches", pitchesJSON);

        return musicModelDO;
    }

    private Wave getFileAsWave(File file) {
        //Do any file conversions here (i.e : MP3 -> WAV)
        return new Wave(file.getAbsolutePath());
    }


    private JSONObject processWaveHeader(WaveHeader waveHeader) throws JSONException {
        return new JSONObject("");
    }

    private JSONObject processAmplitudes(double[] amplitudes) throws JSONException {
        return new JSONObject("");
    }

    private JSONObject processPitches(double[] frequencies) throws JSONException {
        return new JSONObject("");
    }



}
