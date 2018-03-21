package rdm.qhacks.com.musicmatch.View;


import android.content.Context;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.Spinner;
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
        setupDropDownOptions();
        setUserSelectedOptions();
        
    }
    private void setupDropDownOptions() {
        //Setup the time spinner
        Spinner timeDropDown = (Spinner) this.getViewByName("");
        ArrayAdapter<String> amountOptions = new ArrayAdapter<>(this.context, android.R.layout.simple_dropdown_item_1line);
        amountOptions.addAll("5", "10", "20", "30","60");
        timeDropDown.setAdapter(amountOptions);

        //Setup the Unit dropdown
        Spinner timeUnitDropDown = (Spinner) this.getViewByName("");
        ArrayAdapter<String> unitOptions = new ArrayAdapter<String>(this.context, android.R.layout.simple_expandable_list_item_1);
        unitOptions.addAll("Minutes", "Hours");
        timeUnitDropDown.setAdapter(unitOptions);

    }

    /**
     * Fetch and preset all original options the user has on
     */
    private void setUserSelectedOptions() {

    }

}
