package rdm.qhacks.com.musicmatch.Model.DataObject;

import java.io.File;

/**
 * This is the SongDO class which encapsulates all the fields relating to a song
 */
public class SongDO extends DataObject {
    private File songFile;
    private String filePath;
    private String songName;
    private Long fileSize;

    public SongDO(String filePath) {
        this.filePath = filePath;
        this.songFile = new File(filePath);
        this.songName = this.songFile.getName();
        this.fileSize = this.songFile.length();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }
}
