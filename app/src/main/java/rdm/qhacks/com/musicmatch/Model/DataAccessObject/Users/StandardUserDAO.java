package rdm.qhacks.com.musicmatch.Model.DataAccessObject.Users;


/**
 * Standard user data access object
 */
public class StandardUserDAO extends UserDAO {
    /**
     * Initialize the the connection
     *
     * @param listName : name of list to be listening
     */
    public StandardUserDAO() {
        super("StandardUsers");
    }
}
