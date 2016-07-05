package com.trickyandroid.itemdecor;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by paveldudka on 6/5/16.
 */
public class MyAdapter extends RecyclerView.Adapter {
    private int pos;

    @Override public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false));
    }

    @Override public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((TextView)holder.itemView).setText(String.valueOf(position));
        if(pos != 0 && position == pos) {
            ((MyViewHolder)holder).offset = 50;
        } else {
            ((MyViewHolder)holder).offset = 0;
        }
    }

    @Override public long getItemId(int position) {
        return position;
    }

    @Override public int getItemCount() {
        return 40;
    }

    public void setOffsetPos(int pos) {
        this.pos = pos;
    }
}
