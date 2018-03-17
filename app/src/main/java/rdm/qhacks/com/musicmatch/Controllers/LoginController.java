package rdm.qhacks.com.musicmatch.Controllers;


import android.app.Activity;
import android.support.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import rdm.qhacks.com.musicmatch.Controllers.States.LoginStates;

/**
 * Base login controller class
 */
public class LoginController extends BaseController {

    private FirebaseAuth currentUser;
    private Activity loginActivity;
    private LoginStates[] loginStates = {LoginStates.CORRECT_CREDENTIALS};

    public LoginController(FirebaseAuth currentUser, Activity loginActivity) {
        this.currentUser = currentUser;
        this.loginActivity = loginActivity;
    }

    /**
     * Verifies user credentials after they request to login
     * @param email : string email input
     * @param password : string password input
     * @return state code
     */
    public LoginStates verifyUserCredentials(String email, String password){
        //Make call to DAO and firebase api to verify user credentials
        this.currentUser.signInWithEmailAndPassword(email, password).addOnCompleteListener(this.loginActivity, task -> {
            if (task.isSuccessful()){
                loginStates[0] = LoginStates.CORRECT_CREDENTIALS;
            } else {
                loginStates[0] = LoginStates.INCORRECT_CREDENTIALS;
            }
        });
        return loginStates[0];
    }
}
