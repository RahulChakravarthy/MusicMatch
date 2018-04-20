package rdm.qhacks.com.musicmatch.Model.DataObject.Music.MusicModel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import rdm.qhacks.com.musicmatch.Model.DataObject.DataObject;


/**
 * This data object handles conversion to and from pitches
 */
public class PitchDO extends DataObject {
    //All pitches and their corresponding amplitudes
    public enum PitchName {
        AFLAT, A, ASHarp, BFlat, B, C, CSHARP, DFLAT, D, DSHARP, EFLAT, E, F, FSHARP, GFLAT, G, GSHARP
    }

    private double AFLAT = 390.39;
    private double A = 440;
    private double ASharp = 466.16;
    private double BFLAT = 466.16;
    private double B = 493.88;
    private double C = 523.25;
    private double CSHARP = 554.37;
    private double DFLAT = 554.37;
    private double D  = 587.33;
    private double DSHARP = 622.25;
    private double EFLAT = 622.25;
    private double E = 659.25;
    private double F = 698.46;
    private double FSHARP = 739.99;
    private double GFLAT = 739.99;
    private double G = 783.99;
    private double GSHARP = 830.61;

    private HashMap<PitchName, Double> pitchNameKeyFrequencyValue = new HashMap<>();
    public PitchDO(){
        //Contruct the forward pitch map
        pitchNameKeyFrequencyValue.put(PitchName.AFLAT, this.AFLAT);
        pitchNameKeyFrequencyValue.put(PitchName.A, this.A);
        pitchNameKeyFrequencyValue.put(PitchName.ASHarp, this.ASharp);
        pitchNameKeyFrequencyValue.put(PitchName.BFlat, this.BFLAT);
        pitchNameKeyFrequencyValue.put(PitchName.B, this.B);
        pitchNameKeyFrequencyValue.put(PitchName.C, this.C);
        pitchNameKeyFrequencyValue.put(PitchName.CSHARP, this.CSHARP);
        pitchNameKeyFrequencyValue.put(PitchName.DFLAT, this.DFLAT);
        pitchNameKeyFrequencyValue.put(PitchName.D, this.D);
        pitchNameKeyFrequencyValue.put(PitchName.DSHARP, this.DSHARP);
        pitchNameKeyFrequencyValue.put(PitchName.EFLAT, this.EFLAT);
        pitchNameKeyFrequencyValue.put(PitchName.E, this.E);
        pitchNameKeyFrequencyValue.put(PitchName.F, this.F);
        pitchNameKeyFrequencyValue.put(PitchName.FSHARP, this.FSHARP);
        pitchNameKeyFrequencyValue.put(PitchName.GFLAT, this.GFLAT);
        pitchNameKeyFrequencyValue.put(PitchName.G, this.G);
        pitchNameKeyFrequencyValue.put(PitchName.GSHARP, this.GSHARP);

    }

    public PitchName getPitchName(final double frequency){
        //Compare passed in frequency to list of pitches to find which one it is closest to
        Map<PitchName, Double> delta = new HashMap<>();
        Map<Double, PitchName> pitchLoopUpTable = new HashMap<>();

        pitchNameKeyFrequencyValue.keySet().forEach(key -> {
            delta.put(key, Math.abs(pitchNameKeyFrequencyValue.get(key) - frequency));
            pitchLoopUpTable.put(Math.abs(pitchNameKeyFrequencyValue.get(key) - frequency), key);
        });

        double minDelta = Integer.MAX_VALUE;
        for (double deltaValue : delta.values()) {
            if (deltaValue < minDelta) {
                minDelta = deltaValue;
            }
        }
        return pitchLoopUpTable.get(minDelta);
    }
}
