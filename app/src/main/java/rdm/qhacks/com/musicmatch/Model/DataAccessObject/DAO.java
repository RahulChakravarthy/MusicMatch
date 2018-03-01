package rdm.qhacks.com.musicmatch.Model.DataAccessObject;


/**
 * Base DAO Class
 */
public abstract class DAO extends FirebaseBackendAPI {

    /**
     * Initialize the the connection
     *
     * @param listName : name of list to be listening
     */
    public DAO(String listName) {
        super(listName);
    }
}
