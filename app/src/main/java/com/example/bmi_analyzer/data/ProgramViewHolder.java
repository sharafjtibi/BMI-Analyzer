package com.example.bmi_analyzer.data;

import android.view.View;
import android.widget.TextView;

import com.example.bmi_analyzer.R;

public class ProgramViewHolder {
    public TextView length;
    public TextView weight;
    public TextView historyDate;
    public TextView theStatus;

    public ProgramViewHolder(View v){
        length = v.findViewById(R.id.tv_length);
        weight = v.findViewById(R.id.tv_weight);
        historyDate = v.findViewById(R.id.tv_history_status);
        theStatus = v.findViewById(R.id.tv_status);

            }
}
