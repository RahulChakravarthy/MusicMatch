package rdm.qhacks.com.musicmatch.Controllers;


import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;

import rdm.qhacks.com.musicmatch.Activities.MusicMatch;
import rdm.qhacks.com.musicmatch.Model.DataAccessObject.Users.StandardUserDAO;
import rdm.qhacks.com.musicmatch.Model.DataAccessObject.Users.UserDAO;
import rdm.qhacks.com.musicmatch.Model.DataObject.Users.StandardUser;

public class SignUpController extends BaseController {

    private FirebaseAuth currentUser;
    private Context context;

    public SignUpController(FirebaseAuth currentUser, Context context){
        this.currentUser = currentUser;
        this.context = context;
    }

    public void signUpUser(final String email, final String password, final String firstName, final String lastName){
       this.currentUser.createUserWithEmailAndPassword(email, password).addOnCompleteListener( task -> {
           if (task.isSuccessful()){
               addUserToDatabase(email, firstName, lastName);
               emailVerifyUser();
               Toast.makeText(context, "User successfully registered", Toast.LENGTH_LONG).show();
               context.startActivity(new Intent(context, MusicMatch.class));
           } else {
               FirebaseAuthException e = (FirebaseAuthException )task.getException();
               Toast.makeText(context, "Failed Registration: "+e.getMessage(), Toast.LENGTH_SHORT).show();
           }
       });
    }


    /**
     * @Method emailVerifyUser : sends and email to the user to verify their account
     * @To-do implement this feature in the future
     */
    private void emailVerifyUser(){
    }

    /**
     * @Method addUserToDatabase : adds a user to the User database
     */
    private void addUserToDatabase(String email, String firstName, String lastName) {
        //For now we will only deal with standard users
        StandardUser standardUser = new StandardUser(firstName, lastName, email);
        StandardUserDAO standardUserDAO = new StandardUserDAO();
        standardUserDAO.addUser(standardUser);

    }


}
