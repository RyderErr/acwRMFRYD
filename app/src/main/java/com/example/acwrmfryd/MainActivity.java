package com.example.acwrmfryd;

import androidx.appcompat.app.AppCompatActivity;

import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView buttonfish;
    private ImageView buttonbug;
    private ImageView buttonfossil;
    private ImageView buttonarts;
    private ImageView buttonpeople;
    private ImageView buttonbook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonfish =(ImageView)findViewById(R.id.btnfish);
        buttonfish.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,fish.class);
                startActivity(intent);
            }
        });
        buttonbug =(ImageView)findViewById(R.id.btnbug);
        buttonbug.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,bug.class);
                startActivity(intent);
            }
        });
        buttonfossil =(ImageView)findViewById(R.id.btnfossil);
        buttonfossil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,fossil.class);
                startActivity(intent);
            }
        });
        buttonarts =(ImageView)findViewById(R.id.btnarts);
        buttonarts.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,arts.class);
                startActivity(intent);
            }
        });
        buttonpeople =(ImageView)findViewById(R.id.btnpeople);
        buttonpeople.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,people.class);
                startActivity(intent);
            }
        });
        buttonbook =(ImageView)findViewById(R.id.btnbook);
        buttonbook.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,book.class);
                startActivity(intent);
            }
        });
    }
}
