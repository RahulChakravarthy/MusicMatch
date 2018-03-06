package rdm.qhacks.com.musicmatch.Model.DataObject.Users;


import rdm.qhacks.com.musicmatch.Model.DataAccessObject.Settings.Settings;
import rdm.qhacks.com.musicmatch.Model.DataObject.DataObject;

/**
 * User superclass
 */
public abstract class User extends DataObject {

    protected String userId;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected UserType userType;
    protected Settings settings;

    /**
     *Getters and Setters for the user class
     */
    public String getUserId() {return userId;}

    public void setUserId(String userId) {this.userId = userId;}

    public String getFirstName(){return this.firstName;}

    public void setFirstName(String firstName){this.firstName = firstName;}

    public String getLastName(){return this.lastName;}

    public void setLastName(String lastName){this.lastName = lastName;}

    public String getEmail(){return this.email;}

    public void setEmail(String email){this.email = email;}

    public UserType getUserType(){return this.userType;}

    public void setUserType(UserType userType){ this.userType = userType;}

    public Settings getSettings(){return this.settings;}

    public void setSettings(Settings settings){this.settings = settings;}
}
