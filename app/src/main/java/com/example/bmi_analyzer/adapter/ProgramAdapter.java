package com.example.bmi_analyzer.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.bmi_analyzer.R;
import com.example.bmi_analyzer.data.ProgramViewHolder;

public class ProgramAdapter extends ArrayAdapter{

    Context context;
    int[] length;
    int[] weight;
    String[] historyDate;
    String[] theStatus;

    public ProgramAdapter(Context context, String[] historyDate, int[] length, int[] weight, String[] theStatus) {
        super(context, R.layout.list_item, R.id.tv_history_status, historyDate);
        this.context = context;
        this.length = length;
        this.weight = weight;
        this.historyDate = historyDate;
        this.theStatus = theStatus;
    }
    @Override
    public View getView (int position, View convertView, ViewGroup parent){
        View singleItem = convertView;
        ProgramViewHolder holder = null;
        if(singleItem == null ){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            singleItem = layoutInflater.inflate(R.layout.list_item, parent, false);
            holder = new ProgramViewHolder(singleItem);
            singleItem.setTag(holder);
       }else {
            holder = (ProgramViewHolder) singleItem.getTag();
        }
        holder.length.setText(length[position]);
        holder.weight.setText(weight[position]);
        holder.historyDate.setText(historyDate[position]);
        holder.theStatus.setText(theStatus[position]);
        singleItem.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"You clicked: "+ theStatus[position],Toast.LENGTH_SHORT).show();
            }
        });
        return singleItem;
    }
}
