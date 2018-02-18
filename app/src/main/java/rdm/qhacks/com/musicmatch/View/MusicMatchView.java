package rdm.qhacks.com.musicmatch.View;

import android.content.Context;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.stream.IntStream;

import rdm.qhacks.com.musicmatch.R;

public class MusicMatchView extends ParentView {

    private final String activityBackGroundColor = "#66ccff";

    public MusicMatchView(ViewGroup viewGroup, Context context){
        this.viewGroup = viewGroup;
        this.context = context;

        //Set up HashMap to hold all views pertaining to this activity
        final int childCount = this.viewGroup.getChildCount();
        IntStream.range(0, childCount).forEachOrdered(n -> {
            this.activityViews.put(this.context.getResources().getResourceEntryName(this.viewGroup.getChildAt(n).getId()), this.viewGroup.getChildAt(n));
        });
    }

    /**
     * @Method setupLayout : Sets up the basic static UI that the MusicMatch activity will load
     *                       Initialize and create the fragments
     */
    @Override
    public void setupLayout() {
        //Set backgound image
        this.viewGroup.setBackground(this.viewGroup.getResources().getDrawable(R.drawable.background, this.context.getTheme()));

        //Set title attributes
        TextView title = (TextView) this.activityViews.get("MusicMatchTitle");
        title.setText(this.context.getString(R.string.app_name));
        title.setTextSize(TypedValue.COMPLEX_UNIT_PX, 135);

        this.activityViews.get("PlayListName").setAlpha(0.70f);
        this.activityViews.get("Settings").setAlpha(0.70f);
        this.activityViews.get("FileFetchButton").setAlpha(0.70f);
        this.activityViews.get("FetchMusicButton").setAlpha(0.70f);

        //Setup Recycler View

    }
}
