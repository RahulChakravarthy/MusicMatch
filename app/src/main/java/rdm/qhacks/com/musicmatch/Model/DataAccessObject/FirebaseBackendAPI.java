package rdm.qhacks.com.musicmatch.Model.DataAccessObject;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

/**
 *  This interface class interacts with Firebase's real time database
 */
public class FirebaseBackendAPI {

    protected DatabaseReference databaseReference;
    protected FirebaseDatabase firebaseDatabase;


    /**
     * Initialize the the connection
     * @param listName : name of list to be listening
     */
    public FirebaseBackendAPI(List<String> listName){
        this.firebaseDatabase = FirebaseDatabase.getInstance();
        this.databaseReference = this.firebaseDatabase.getReference("MusicMatchData");
        for (String subTable : listName){
            this.databaseReference = this.databaseReference.child(subTable);
        }

    }
}
