package ir.wccs.epoxy_resin_learning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;


public class season1 extends AppCompatActivity {




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
        setContentView(R.layout.season1);


        final ImageButton back = (ImageButton) findViewById(R.id.ibtnback);
        final Button btns1p1 = (Button) findViewById(R.id.btns1p1);


        btns1p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(season1.this,s1p1.class);
                startActivity(intent);
                finish();
            }
        });



    }
}
