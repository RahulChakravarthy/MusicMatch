package rdm.qhacks.com.musicmatch.Model.DataAccessObject.Users;


import java.util.Arrays;
import java.util.Collections;

import rdm.qhacks.com.musicmatch.Controllers.CallBack.StringCallBack;

/**
 * Standard user data access object
 */
public class StandardUserDAO extends UserDAO {

    /**
     * Initialize the the connection
     *
     */
    public StandardUserDAO() {
        super(Collections.singletonList("StandardUser"));
    }

    public void getStandardUserByFirstName(StringCallBack stringCallBack){
        super.getUserByFirstName(stringCallBack);
    }
}
