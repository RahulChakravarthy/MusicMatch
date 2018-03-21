package rdm.qhacks.com.musicmatch.Model.DataObject.Users;

import android.icu.util.TimeUnit;

import rdm.qhacks.com.musicmatch.Model.DataObject.DataObject;


/**
 * User settings data object
 */
public class UserSettings extends DataObject {

    private long parseTime;
    private TimeUnit parseTimeUnit;

    private float algComplexity;

    private boolean explicitSongs;
    private boolean longSongs;

    /**
     * Create default settings when user is created
     */
    public UserSettings(){
        this.parseTime = 5;
        this.parseTimeUnit = TimeUnit.MINUTE;
        this.algComplexity = 0.5f;
        this.explicitSongs = false;
        this.longSongs = false;
    }


    public long getParseTime() {
        return parseTime;
    }

    public void setParseTime(long parseTime) {
        this.parseTime = parseTime;
    }

    public TimeUnit getParseTimeUnit() {
        return parseTimeUnit;
    }

    public void setParseTimeUnit(TimeUnit parseTimeUnit) {
        this.parseTimeUnit = parseTimeUnit;
    }

    public float getAlgComplexity() {
        return algComplexity;
    }

    public void setAlgComplexity(float algComplexity) {
        this.algComplexity = algComplexity;
    }

    public boolean isExplicitSongs() {
        return explicitSongs;
    }

    public void setExplicitSongs(boolean explicitSongs) {
        this.explicitSongs = explicitSongs;
    }

    public boolean isLongSongs() {
        return longSongs;
    }

    public void setLongSongs(boolean longSongs) {
        this.longSongs = longSongs;
    }
}
