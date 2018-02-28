package rdm.qhacks.com.musicmatch.Activities;

import android.os.Bundle;

import rdm.qhacks.com.musicmatch.Controllers.SignUpController;
import rdm.qhacks.com.musicmatch.R;

public class SignUp extends BaseActivity {

    SignUpController signUpController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    @Override
    void setupView() {

    }

    @Override
    void initializeController() {
        this.signUpController = new SignUpController(this.currentUser, this.getApplicationContext());
    }
}
