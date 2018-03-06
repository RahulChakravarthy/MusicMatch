package rdm.qhacks.com.musicmatch.Model.DataAccessObject.Users;


/**
 * Standard user data access object
 */
public class StandardUserDAO extends UserDAO {
    /**
     * Initialize the the connection
     *
     */
    public StandardUserDAO() {
        super("StandardUsers");
    }


}
