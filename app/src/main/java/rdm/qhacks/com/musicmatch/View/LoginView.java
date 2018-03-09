package rdm.qhacks.com.musicmatch.View;

import android.content.Context;
import android.view.ViewGroup;

import java.util.stream.IntStream;

import rdm.qhacks.com.musicmatch.R;

/**
 * View class for the login activity
 */
public class LoginView extends ParentView {

    public LoginView(Context context, ViewGroup viewGroup){
        this.context = context;
        this.viewGroup = viewGroup;

        //Set up HashMap to hold all views pertaining to this activity
        final int childCount = this.viewGroup.getChildCount();
        IntStream.range(0, childCount).forEachOrdered(n -> this.activityViews.put(this.context.getResources().getResourceEntryName(this.viewGroup.getChildAt(n).getId()), this.viewGroup.getChildAt(n)));
    }

    @Override
    public void setupLayout() {
        this.viewGroup.setBackgroundResource(R.drawable.background);
    }
}
