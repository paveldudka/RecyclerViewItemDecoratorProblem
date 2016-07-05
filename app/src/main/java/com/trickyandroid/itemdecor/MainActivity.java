package com.trickyandroid.itemdecor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        Button button = (Button)findViewById(R.id.btn);

        final MyDecor decor = new MyDecor();

        recyclerView.addItemDecoration(decor);
        LinearLayoutManager llm = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        llm.setStackFromEnd(true);
        recyclerView.setLayoutManager(llm);
        final MyAdapter adapter = new MyAdapter();
        adapter.setHasStableIds(true);
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new MyAnimator());

        button.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                adapter.setOffsetPos(37);
                adapter.notifyItemChanged(37);
            }
        });
    }
}
