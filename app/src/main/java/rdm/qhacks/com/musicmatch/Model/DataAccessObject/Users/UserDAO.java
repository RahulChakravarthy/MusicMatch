package rdm.qhacks.com.musicmatch.Model.DataAccessObject.Users;


import rdm.qhacks.com.musicmatch.Model.DataAccessObject.DAO;
import rdm.qhacks.com.musicmatch.Model.DataObject.Users.User;

/**
 * Data access object for users in MusicMatch
 */
public class UserDAO extends DAO {


    /**
     * Initialize the the connection
     *
     * @param listName : name of list to be listening
     */
    public UserDAO(String listName) {
        super(listName);
    }

    public User getUserByFirstName(){
        return null;
    }

    public void addUser(User user){
        String key = this.databaseReference.push().getKey();
        this.databaseReference.child(key).setValue(user);
    }
}
