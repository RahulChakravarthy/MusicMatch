package rdm.qhacks.com.musicmatch.Activities;

import android.os.Bundle;
import android.view.Window;

import rdm.qhacks.com.musicmatch.R;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
    }

    @Override
    void setupView() {

    }

    @Override
    void initializeController() {

    }
}
