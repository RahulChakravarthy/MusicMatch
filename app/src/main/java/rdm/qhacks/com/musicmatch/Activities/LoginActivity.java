package rdm.qhacks.com.musicmatch.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

import rdm.qhacks.com.musicmatch.Controllers.LoginController;
import rdm.qhacks.com.musicmatch.R;
import rdm.qhacks.com.musicmatch.View.LoginView;

public class LoginActivity extends BaseActivity {

    private LoginView loginView;
    private LoginController loginController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
    }

    @Override
    void setupView() {
        ConstraintLayout constraintLayout = findViewById(R.id.loginActivity);
        this.loginView = new LoginView(getApplicationContext(), constraintLayout);
        this.loginView.setupLayout();
        setupLoginButton();
        setupSignUpButton();
        setupForgotPasswordButton();
    }

    @Override
    void initializeController() {
        this.loginController = new LoginController(this.currentUser, this);
    }


    /**
     * Log user in handler
     */
    private void setupLoginButton() {
        findViewById(R.id.loginActivityLoginButton).setOnClickListener(view -> {
            switch (
            this.loginController.verifyUserCredentials(
                    ((TextView)findViewById(R.id.loginActivityEmailInput)).getText().toString().trim(),
                    ((TextView)findViewById(R.id.loginActivityPasswordInput)).getText().toString().trim()
            )){
                case CORRECT_CREDENTIALS:
                    Intent intent = new Intent(LoginActivity.this, MusicMatch.class);
                    startActivity(intent);
                    break;
                case INCORRECT_CREDENTIALS:
                    Toast.makeText(getApplicationContext(), "Error: Invalid Credentials", Toast.LENGTH_LONG).show();
                    break;
                default:
                    Toast.makeText(getApplicationContext(), "Network unavailable please try again later", Toast.LENGTH_LONG).show();
                    break;
            }
        });
    }

    /**
     * Sign up handler
     */
    private void setupSignUpButton() {
        findViewById(R.id.loginActivitySignUpButton).setOnClickListener(view -> {
            startActivity(new Intent(LoginActivity.this, SignUp.class));
        });
    }

    private void setupForgotPasswordButton() {
        //implement later
    }
}
