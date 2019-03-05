package com.example.c7_ong.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder>{
    private final LinkedList<String> mWordList;
    private LayoutInflater mInflater;
    private final Context mContext;
    //constructor to initialize the word list from the data
    public WordListAdapter(Context context ,LinkedList<String> wordList) {
        this.mContext = context;
        mInflater = LayoutInflater.from(context);
        this.mWordList = wordList;
    }

    @NonNull

    //Inflates the item layout, then returns the ViewHolder with the layout and the adapter
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.wordlist_item, parent, false);
        return new WordViewHolder(mItemView, this);
    }

    //connects your data to the view holder
    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder holder, int position) {
        String mCurrent = mWordList.get(position);
        holder.wordItemView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }

    class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        public final TextView wordItemView;
        final WordListAdapter mAdapter;
        public WordViewHolder(View itemView, WordListAdapter adapter)
        {
            super(itemView);
            {
                wordItemView = itemView.findViewById(R.id.word);
                this.mAdapter = adapter;
                itemView.setOnClickListener(this);
            }
        }

        @Override
        public void onClick(View v) {
            int mPosition = getLayoutPosition();
            String element = mWordList.get(mPosition);
            Toast.makeText(mContext, element + " Clicked!", Toast.LENGTH_SHORT).show();
            //mWordList.set(mPosition, "Clicked" + element);
            //mAdapter.notifyDataSetChanged();
        }
    }
}
