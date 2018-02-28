package rdm.qhacks.com.musicmatch.Controllers;


import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;

import rdm.qhacks.com.musicmatch.Activities.MusicMatch;

public class SignUpController extends BaseController {

    FirebaseAuth currentUser;
    Context context;

    public SignUpController(FirebaseAuth currentUser, Context context){
        this.currentUser = currentUser;
        this.context = context;
    }

    public void signUpUser(String email, String password){
       this.currentUser.createUserWithEmailAndPassword(email, password).addOnCompleteListener( task -> {
           if (task.isSuccessful()){
               addUserToDatabase();
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
     */
    private void emailVerifyUser(){
    }

    /**
     * @Method addUserToDatabase : adds a user to the User database
     */
    private void addUserToDatabase() {
        //add user based on what type they are (teacher or student)

    }


}
