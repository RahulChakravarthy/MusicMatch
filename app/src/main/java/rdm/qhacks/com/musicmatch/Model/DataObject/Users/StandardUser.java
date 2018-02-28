package rdm.qhacks.com.musicmatch.Model.DataObject.Users;

/**
 * Standard user
 */
public class StandardUser extends User {

    public StandardUser(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userType = UserType.STANDARD;
    }
}
