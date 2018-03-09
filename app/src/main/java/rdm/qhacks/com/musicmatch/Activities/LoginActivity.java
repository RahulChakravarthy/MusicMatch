package rdm.qhacks.com.musicmatch.Activities;

import android.os.Bundle;
import android.view.Window;

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
        this.loginView = new LoginView();
    }

    @Override
    void initializeController() {

    }
}
