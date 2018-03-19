package rdm.qhacks.com.musicmatch.Model.DataObject.Users;

import rdm.qhacks.com.musicmatch.Model.DataAccessObject.Settings.StandardSettings;
import rdm.qhacks.com.musicmatch.Model.DataObject.Music.PlaylistDO;

/**
 * Standard user
 */
public class StandardUser extends User {

    public StandardUser(String lastName, String email, String firstName, PlaylistDO playlistDO){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userType = UserType.STANDARD;
        this.settings = new StandardSettings();
        this.playlistDO = playlistDO;
    }
}
