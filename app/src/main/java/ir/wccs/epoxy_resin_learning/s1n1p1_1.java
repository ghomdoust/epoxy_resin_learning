package ir.wccs.epoxy_resin_learning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class s1n1p1_1 extends AppCompatActivity {




/*
    final Button btns1p1 = (Button) findViewById(R.id.btns1p1);
    final Button btns1p2 = (Button) findViewById(R.id.btns1p2);
    final Button btns1p3 = (Button) findViewById(R.id.btns1p3);
    final Button btns1p4 = (Button) findViewById(R.id.btns1p4);
    final Button btns1p5 = (Button) findViewById(R.id.btns1p5);
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s1n1p1_1);




        final Button s1n1 = (Button) findViewById(R.id.btns1n1);
        final Button s1n2 = (Button) findViewById(R.id.btns1n2);
        final Button s1n3 = (Button) findViewById(R.id.btns1n3);
        final Button s1n4 = (Button) findViewById(R.id.btns1n4);
        final Button s1n5 = (Button) findViewById(R.id.btns1n5);
        final Button s1n6 = (Button) findViewById(R.id.btns1n6);
        final Button s1n7 = (Button) findViewById(R.id.btns1n7);
        final Button s1n8 = (Button) findViewById(R.id.btns1n8);
        final Button s1n9 = (Button) findViewById(R.id.btns1n9);
        final Button s1n10 = (Button) findViewById(R.id.btns1n10);
        final Button s1n11 = (Button) findViewById(R.id.btns1n11);



        s1n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(s1n1p1_1.this,s1n1p1_2.class);
                startActivity(intent);
            }
        });

    }
}
