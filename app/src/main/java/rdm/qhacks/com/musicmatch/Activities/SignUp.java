package rdm.qhacks.com.musicmatch.Activities;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.Window;
import android.widget.TextView;

import rdm.qhacks.com.musicmatch.Controllers.SignUpController;
import rdm.qhacks.com.musicmatch.R;
import rdm.qhacks.com.musicmatch.View.SignUpView;

public class SignUp extends BaseActivity {

    SignUpController signUpController;
    private SignUpView signUpView; //View for this activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_sign_up);

        setupView();
        initializeController();
    }

    @Override
    public void setupView() {
        ConstraintLayout activityLayout = findViewById(R.id.signUp);
        this.signUpView = new SignUpView(activityLayout, getApplicationContext());
        this.signUpView.setupLayout();
    }

    @Override
    public void initializeController() {
        this.signUpController = new SignUpController(this.currentUser, this.getApplicationContext());
    }


    public void signUp(){
        this.signUpView.getViewByName("").setOnClickListener(view ->
            this.signUpController.signUpUser(
                    ((TextView)this.signUpView.getViewByName("")).getText().toString().trim(),
                    ((TextView) this.signUpView.getViewByName("")).getText().toString().trim(),
                    ((TextView) this.signUpView.getViewByName("")).getText().toString().trim(),
                    ((TextView) this.signUpView.getViewByName("")).getText().toString().trim())

        );
    }
}
