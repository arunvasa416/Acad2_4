package com.example.hello.acad2_4;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=(ImageView) findViewById(R.id.imageAndroid);
        btn=(Button)findViewById(R.id.btnSH);
        btn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v)
            {
                String btntext=btn.getText().toString()=="Show"? "Hide" : "Show";
                btn.setText(btntext);
                if(btntext.equals("Hide"))
                img.setVisibility(View.VISIBLE);
                else
                    img.setVisibility(View.INVISIBLE);
            }

        });

    }
}
