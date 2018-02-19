package rdm.qhacks.com.musicmatch.View;


import android.content.Context;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.stream.IntStream;

import rdm.qhacks.com.musicmatch.R;

public class SettingsView extends ParentView{

    public SettingsView(ViewGroup viewGroup, Context context){
        this.context = context;
        this.viewGroup = viewGroup;

        //Set up HashMap to hold all views pertaining to this activity
        final int childCount = this.viewGroup.getChildCount();
        IntStream.range(0, childCount).forEachOrdered(n -> this.activityViews.put(this.context.getResources().getResourceEntryName(this.viewGroup.getChildAt(n).getId()), this.viewGroup.getChildAt(n)));
    }

    @Override
    public void setupLayout() {
        this.viewGroup.setBackground(this.viewGroup.getResources().getDrawable(R.drawable.background, this.context.getTheme()));

        TextView title = (TextView) this.activityViews.get("SettingsTitle");
        title.setText(R.string.settings_title);
        title.setTextSize(TypedValue.COMPLEX_UNIT_PX, 135);
    }
}
