package com.example.duolingo_cover;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Them_or_they extends AppCompatActivity {
    Button check;
    Button option1;
    Button option2;
    int choose=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml_them_or_they);

        check = findViewById(R.id.ktra);
        option1 = findViewById(R.id.btn_them);
        option2 = findViewById(R.id.btn_they);

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                option1.setBackgroundColor(Color.parseColor("#92ebff"));
                option2.setBackgroundColor(Color.parseColor("white"));
                choose = 1;
            }
        });
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                option2.setBackgroundColor(Color.parseColor("#92ebff"));
                option1.setBackgroundColor(Color.parseColor("white"));
                choose = 2;
            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(choose !=0){
                    AlertDialog.Builder builder = new AlertDialog.Builder(Them_or_they.this);
                    if(choose==1){
                        builder.setMessage("Congratulation! That's a correct answer");
                    }else{
                        builder.setMessage("Wrong answer :((");
                    }

                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int i) {
                            startActivity(new Intent(Them_or_they.this, Vocabulary.class));
                        }
                    });
                    builder.show();
                }
            }
        });
    }
}