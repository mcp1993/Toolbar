package com.mcp1993.toolbardemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        toolbar= (Toolbar) findViewById(R.id.toolbar);
//
//        //左边图标点击
//        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "返回", Toast.LENGTH_SHORT).show();
//            }
//        });


        final CNToolbar toolbar = (CNToolbar) findViewById(R.id.toolbar);

        toolbar.setOnLeftButtonClickListener(new CNToolbar.OnLeftButtonClickListener() {
            @Override
            public void onClick() {
                Toast.makeText(MainActivity.this, "返回", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
