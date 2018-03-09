package rdm.qhacks.com.musicmatch.Model.DataAccessObject.Users;


import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;

import java.util.Arrays;
import java.util.List;

import rdm.qhacks.com.musicmatch.Controllers.CallBack.StringCallBack;
import rdm.qhacks.com.musicmatch.Model.DataAccessObject.DAO;
import rdm.qhacks.com.musicmatch.Model.DataObject.Users.User;

/**
 * Data access object for users in MusicMatch
 */
public abstract class UserDAO extends DAO {


    /**
     * Initialize the the connection
     *
     * @param listName : name of list to be listening
     */
    public UserDAO(List<String> listName) {
        super(Arrays.asList("Users", listName));
    }

    /**
     *  Get a Music Match user by first name
     * @param stringCallBack call back that is applied on
     */
    public void getUserByFirstName(StringCallBack stringCallBack){
        this.databaseReference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    public void addUser(User user){
        String key = this.databaseReference.push().getKey();
        this.databaseReference.child(key).setValue(user);
    }

}
