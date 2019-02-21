package com.example.c7_ong.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder>{
    @NonNull
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class WordViewHolder extends RecyclerView.ViewHolder
    {
        public final TextView wordItemView;
        final WordListAdapter mAdapter;
        public WordViewHolder(View itemView, WordListAdapter adapter)
        {
            super(itemView);
            {
                wordItemView = itemView.findViewById(R.id.word);
                this.mAdapter = adapter;
            }
        }
    }
}
