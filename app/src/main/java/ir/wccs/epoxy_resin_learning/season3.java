package ir.wccs.epoxy_resin_learning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class season3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.season3);




        final Button s1n1 = (Button) findViewById(R.id.btns1n1);
        final Button s1n2 = (Button) findViewById(R.id.btns1n2);
        final Button s1n3 = (Button) findViewById(R.id.btns1n3);
        final Button s1n4 = (Button) findViewById(R.id.btns1n4);
        final Button s1n5 = (Button) findViewById(R.id.btns1n5);
        final Button s1n6 = (Button) findViewById(R.id.btns1n6);
        final Button s1n7 = (Button) findViewById(R.id.btns1n7);
        final Button s1n8 = (Button) findViewById(R.id.btns1n8);


        s1n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(season3.this,s3n1p1_1.class);
                startActivity(intent);
            }
        });

        s1n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(season3.this,s3n1p1_2.class);
                startActivity(intent);
            }
        });

        s1n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(season3.this,s3n1p1_3.class);
                startActivity(intent);
            }
        });

        s1n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(season3.this,s3n1p1_4.class);
                startActivity(intent);
            }
        });

        s1n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(season3.this,s3n1p1_5.class);
                startActivity(intent);
            }
        });

        s1n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(season3.this,s3n1p1_6.class);
                startActivity(intent);
            }
        });

        s1n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(season3.this,s3n1p1_7.class);
                startActivity(intent);
            }
        });

        s1n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(season3.this,s3n1p1_8.class);
                startActivity(intent);
            }
        });


    }
}
