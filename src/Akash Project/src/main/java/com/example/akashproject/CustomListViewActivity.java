package com.example.akashproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class CustomListViewActivity extends AppCompatActivity {

    private ListView listView;
    private int image[] = {R.drawable.apple,R.drawable.asus,R.drawable.mi,R.drawable.oneplus,
            R.drawable.oppo,R.drawable.samsung,R.drawable.vivo};
    private String []name = {"Apple", "Asus", "MI", "OnePlus", "Oppo", "Samsung", "Vivo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        listView=findViewById(R.id.clview);
        MyAdapter myAdapter = new MyAdapter(CustomListViewActivity.this,image,name);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(CustomListViewActivity.this, DetailedListViewActivity.class);
            intent.putExtra("image",image[position]);
            intent.putExtra("name",name[position]);
            startActivity(intent);
        });
    }
}