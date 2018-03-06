package rdm.qhacks.com.musicmatch.Model.DataAccessObject.Settings;

import java.util.concurrent.TimeUnit;

/**
 * Settings superclass for all users
 */
public abstract class Settings {
    //Default wait time for music fetch is 5 minutes
    protected TimeUnit timeUnit = TimeUnit.MINUTES;
    protected Long musicSearchTime = 5L;

    public TimeUnit getTimeUnit(){
        return timeUnit;
    }

    public void setTimeUnit(TimeUnit timeUnit){
        this.timeUnit = timeUnit;
    }

    public Long getMusicSearchTime(){
        return this.musicSearchTime;
    }

    public void setMusicSearchTime(Long musicSearchTime){
        this.musicSearchTime = musicSearchTime;
    }
}
