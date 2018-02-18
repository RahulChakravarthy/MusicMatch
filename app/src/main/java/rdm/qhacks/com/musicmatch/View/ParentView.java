package rdm.qhacks.com.musicmatch.View;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import java.util.HashMap;

/**
 * This class is the parent class to all views in the app
 */
public abstract class ParentView {

    protected ViewGroup viewGroup;
    protected Context context;
    protected HashMap<String, View> activityViews = new HashMap<>();

    abstract public void setupLayout();

    public View getViewByName(String viewName){
        return this.activityViews.get(viewName);
    }
}
