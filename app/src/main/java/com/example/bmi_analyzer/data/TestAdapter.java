package com.example.bmi_analyzer.data;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bmi_analyzer.R;
import com.example.bmi_analyzer.adapter.MovieModel;

import java.util.ArrayList;
import java.util.List;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.MovieModelViewHolder> {

    private List<MovieModel> MovieModelList = new ArrayList<>();

    public void setList(List<MovieModel> MovieModelList) {
        this.MovieModelList = MovieModelList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MovieModelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MovieModelViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MovieModelViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return MovieModelList.size();
    }

    class MovieModelViewHolder extends RecyclerView.ViewHolder {

        // Declare your views
        private TextView textView;

        public MovieModelViewHolder(@NonNull View itemView) {
            super(itemView);

            // inflate the view
            textView = itemView.findViewById(R.id.tv_status);

        }

        private void bind(int position) {
            // Bind data
            textView.setText(MovieModelList.get(position).getName());

        }
    }
}