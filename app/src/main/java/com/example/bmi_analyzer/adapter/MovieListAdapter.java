package com.example.bmi_analyzer.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bmi_analyzer.R;

import java.util.ArrayList;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MovieViewHolder>{
private ArrayList<MovieModel> movielist = new ArrayList<>();
    @NonNull
    @Override
    public MovieListAdapter.MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MovieViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MovieListAdapter.MovieViewHolder holder, int position) {
holder.length.setText(movielist.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return movielist.size();
    }
    public void setList(ArrayList<MovieModel>movielist){
        this.movielist =  movielist;
        notifyDataSetChanged();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {
         TextView length;
         TextView weight;
         TextView status;
         TextView Date;
        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            length = itemView.findViewById(R.id.tv_length);
            weight = itemView.findViewById(R.id.tv_weight);
            status = itemView.findViewById(R.id.tv_status);
            Date = itemView.findViewById(R.id.tv_history_status);
        }
    }
}
