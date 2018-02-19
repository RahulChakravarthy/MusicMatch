package rdm.qhacks.com.musicmatch.Activities;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.Window;

import rdm.qhacks.com.musicmatch.Controllers.SettingsController;
import rdm.qhacks.com.musicmatch.R;
import rdm.qhacks.com.musicmatch.View.ParentView;
import rdm.qhacks.com.musicmatch.View.SettingsView;

public class Settings extends BaseActivity {

    private ParentView settingsView; //View for this activity
    private SettingsController settingsController; //Controller for this activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_settings);

        setupView();
        initializeController();
    }

    @Override
    void setupView() {
        ConstraintLayout activityLayout = findViewById(R.id.SettingsActivity);
        this.settingsView = new SettingsView(activityLayout, getApplicationContext());
        this.settingsView.setupLayout();
    }

    @Override
    void initializeController() {
        this.settingsController = new SettingsController();
    }
}
