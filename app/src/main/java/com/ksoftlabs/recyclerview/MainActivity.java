package com.ksoftlabs.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initRecylerView();
    }

    private void initData() {
        userList = new ArrayList<>();
        userList.add(new ModelClass("Kavinda Athapaththu", "11:11","Lorem ipsum dolor sit amet"));
        userList.add(new ModelClass("Kavinda Athapaththu", "11:11","Lorem ipsum dolor sit amet"));
        userList.add(new ModelClass("Kavinda Athapaththu", "11:11","Lorem ipsum dolor sit amet"));
        userList.add(new ModelClass("Kavinda Athapaththu", "11:11","Lorem ipsum dolor sit amet"));
        userList.add(new ModelClass("Kavinda Athapaththu", "11:11","Lorem ipsum dolor sit amet"));
        userList.add(new ModelClass("Kavinda Athapaththu", "11:11","Lorem ipsum dolor sit amet"));
        userList.add(new ModelClass("Kavinda Athapaththu", "11:11","Lorem ipsum dolor sit amet"));
        userList.add(new ModelClass("Kavinda Athapaththu", "11:11","Lorem ipsum dolor sit amet"));
        userList.add(new ModelClass("Kavinda Athapaththu", "11:11","Lorem ipsum dolor sit amet"));
        userList.add(new ModelClass("Kavinda Athapaththu", "11:11","Lorem ipsum dolor sit amet"));
        userList.add(new ModelClass("Kavinda Athapaththu", "11:11","Lorem ipsum dolor sit amet"));
        userList.add(new ModelClass("Kavinda Athapaththu", "11:11","Lorem ipsum dolor sit amet"));
        userList.add(new ModelClass("Kavinda Athapaththu", "11:11","Lorem ipsum dolor sit amet"));
        userList.add(new ModelClass("Kavinda Athapaththu", "11:11","Lorem ipsum dolor sit amet"));
        userList.add(new ModelClass("Kavinda Athapaththu", "11:11","Lorem ipsum dolor sit amet"));
        userList.add(new ModelClass("Kavinda Athapaththu", "11:11","Lorem ipsum dolor sit amet"));
        userList.add(new ModelClass("Kavinda Athapaththu", "11:11","Lorem ipsum dolor sit amet"));
    }

    private void initRecylerView() {
        recyclerView =findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}