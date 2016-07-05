package com.trickyandroid.itemdecor;

import android.support.annotation.NonNull;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

/**
 * Created by paveldudka on 6/5/16.
 */
public class MyAnimator extends DefaultItemAnimator {
    @Override public boolean animateChange(@NonNull RecyclerView.ViewHolder oldHolder, @NonNull RecyclerView.ViewHolder newHolder, @NonNull ItemHolderInfo preInfo, @NonNull ItemHolderInfo postInfo) {
        Log.d("pasha", "animateChange: "+newHolder.getAdapterPosition());
        return super.animateChange(oldHolder, newHolder, preInfo, postInfo);
    }

    @Override public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.ViewHolder viewHolder) {
        return true;
    }

    @Override public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull List<Object> payloads) {
        return true;
    }
}
