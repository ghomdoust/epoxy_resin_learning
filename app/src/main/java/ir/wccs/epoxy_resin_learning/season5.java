package ir.wccs.epoxy_resin_learning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class season5 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.season5);




        final Button s1n1 = (Button) findViewById(R.id.btns1n1);
        final Button s1n2 = (Button) findViewById(R.id.btns1n2);
        final Button s1n3 = (Button) findViewById(R.id.btns1n3);
        final Button s1n4 = (Button) findViewById(R.id.btns1n4);
        final Button s1n5 = (Button) findViewById(R.id.btns1n5);




        s1n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(season5.this,s5n1p1_1.class);
                startActivity(intent);
            }
        });

        s1n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(season5.this,s5n1p1_2.class);
                startActivity(intent);
            }
        });

        s1n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(season5.this,s5n1p1_3.class);
                startActivity(intent);
            }
        });

        s1n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(season5.this,s5n1p1_4.class);
                startActivity(intent);
            }
        });

        s1n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(season5.this,s1n1p1_5.class);
                startActivity(intent);
            }
        });




    }
}
