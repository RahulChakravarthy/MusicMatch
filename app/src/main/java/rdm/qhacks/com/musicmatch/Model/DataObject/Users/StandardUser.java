package rdm.qhacks.com.musicmatch.Model.DataObject.Users;

import rdm.qhacks.com.musicmatch.Model.DataAccessObject.Settings.StandardSettings;

/**
 * Standard user
 */
public class StandardUser extends User {

    public StandardUser(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userType = UserType.STANDARD;
        this.settings = new StandardSettings();
    }
}
