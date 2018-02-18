package rdm.qhacks.com.musicmatch.Controllers;


import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Helper Class to verify whether file chosen is of correct file type
 */
public class MediaFileVerifierController {

    private final static ArrayList<String> validFileTypes = new ArrayList<>(Arrays.asList("mp3", "wav")); //All supported file formats

    public static boolean isFileValid(File file){
        return validFileTypes.contains(FilenameUtils.getExtension(file.getAbsolutePath()).toLowerCase());
    }

    public static boolean isFilePathValid(String filePath){
        return validFileTypes.contains(FilenameUtils.getExtension(filePath).toLowerCase());
    }
}
