package rdm.qhacks.com.musicmatch.Model.DataObject;

import org.apache.commons.io.FilenameUtils;

import java.io.File;

/**
 * This is the SongDO class which encapsulates all the fields relating to a song
 */
public class SongDO extends DataObject {
    private File songFile;
    private String filePath;
    private String songName;
    private Long fileSize;
    private String fileType;

    public SongDO(String filePath) {
        this.filePath = filePath;
        this.songFile = new File(filePath);
        this.songName = this.songFile.getName();
        this.fileSize = this.songFile.length();
        this.fileType = FilenameUtils.getExtension(this.songFile.getAbsolutePath()).toLowerCase();
    }

    public String getFilePath() {
        return filePath;
    }

    public String getSongName() {
        return songName;
    }

    public Long getFileSize() {
        return fileSize;
    }


    public String getFileType() {
        return fileType;
    }

    public File getSongFile(){
        return this.songFile;
    }
}
