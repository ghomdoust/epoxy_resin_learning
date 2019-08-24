package ir.wccs.epoxy_resin_learning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class season5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.season5);


        final ImageButton back = (ImageButton) findViewById(R.id.ibtnback);



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(season5.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
