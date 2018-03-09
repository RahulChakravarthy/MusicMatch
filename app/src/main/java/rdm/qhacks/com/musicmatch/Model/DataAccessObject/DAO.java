package rdm.qhacks.com.musicmatch.Model.DataAccessObject;


import java.util.List;

/**
 * Base DAO Class
 */
public abstract class DAO extends FirebaseBackendAPI {

    /**
     * Initialize the the connection
     *
     * @param listName : name of list to be listening
     */
    public DAO(List<String> listName) {
        super(listName);
    }
}
