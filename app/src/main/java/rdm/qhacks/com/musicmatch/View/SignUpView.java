package rdm.qhacks.com.musicmatch.View;


import android.content.Context;
import android.view.ViewGroup;

import java.util.stream.IntStream;

import rdm.qhacks.com.musicmatch.R;

/**
 * View class for the sign up activity
 */
public class SignUpView extends ParentView {

    public SignUpView(ViewGroup viewGroup, Context context){
        this.viewGroup = viewGroup;
        this.context = context;

        //Set up HashMap to hold all views pertaining to this activity
        final int childCount = this.viewGroup.getChildCount();
        IntStream.range(0, childCount).forEachOrdered(n -> this.activityViews.put(this.context.getResources().getResourceEntryName(this.viewGroup.getChildAt(n).getId()), this.viewGroup.getChildAt(n)));
    }

    @Override
    public void setupLayout() {
        this.viewGroup.setBackground(this.viewGroup.getResources().getDrawable(R.drawable.background, this.context.getTheme()));


    }
}
