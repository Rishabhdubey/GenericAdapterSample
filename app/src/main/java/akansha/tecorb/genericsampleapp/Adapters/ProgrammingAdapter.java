package akansha.tecorb.genericsampleapp.Adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import akansha.tecorb.genericsampleapp.Model.ProgrammingModel;
import akansha.tecorb.genericsampleapp.R;
import akansha.tecorb.genericsampleapp.databinding.CustomProgrammingViewBinding;

/**
 * Created by tecorb on 25/5/18.
 */

public class ProgrammingAdapter extends GenericCommonAdapter<ProgrammingModel> {


    public ProgrammingAdapter(ArrayList<ProgrammingModel> programmingItem) {
        super(programmingItem);// this method is used to call Generic Common adapter where we are passing diffrent arrayList data
    }

    // with below buildView method we are inflating the custom view of movie this method is overridden method
    // of Generic Common Adapter with the help of which we can create custom views according to our need


    @Override
    public View buildView(int position, View view, ViewGroup parent) {
        CustomProgrammingViewBinding customBinding ;
        if(view == null){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_programming_view, null);
            customBinding = DataBindingUtil.bind(view);
            view.setTag(customBinding);
        }else{
            customBinding = (CustomProgrammingViewBinding) view.getTag();
        }

        customBinding.programmingName.setText(getItem(position).getLanguageName());
        customBinding.programmingYear.setText(getItem(position).getYear());


        return customBinding.getRoot();
    }

    @Override
    public ProgrammingModel getItem(int position) {
        return super.getItem(position);
    }
}

