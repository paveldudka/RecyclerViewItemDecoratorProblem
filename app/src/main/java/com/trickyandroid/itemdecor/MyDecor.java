package com.trickyandroid.itemdecor;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

public class MyDecor extends RecyclerView.ItemDecoration {
    @Override public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int p = parent.getChildAdapterPosition(view);
        MyViewHolder viewHolder = (MyViewHolder)parent.getChildViewHolder(view);
        outRect.set(0, viewHolder.offset, 0, viewHolder.offset);
    }
}
