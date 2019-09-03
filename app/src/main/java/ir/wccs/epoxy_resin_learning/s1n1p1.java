package ir.wccs.epoxy_resin_learning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class s1n1p1 extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s1n1p1);

        final Button s1n1p1 = (Button) findViewById(R.id.btns1n1p1);
        final Button s1n1p2 = (Button) findViewById(R.id.btns1n1p2);
        final Button s1n1p3 = (Button) findViewById(R.id.btns1n1p3);
        final Button s1n1p4 = (Button) findViewById(R.id.btns1n1p4);
        final Button s1n1p5 = (Button) findViewById(R.id.btns1n1p5);
        final Button s1n1p6 = (Button) findViewById(R.id.btns1n1p6);



        s1n1p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(s1n1p1.this,s1n1p1_6.class);
                startActivity(intent);
            }
        });
        s1n1p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(s1n1p1.this,s1n1p1_1.class);
                startActivity(intent);
            }
        });
        s1n1p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(s1n1p1.this,s1n1p1_2.class);
                startActivity(intent);
            }
        });
        s1n1p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(s1n1p1.this,s1n1p1_3.class);
                startActivity(intent);
            }
        });
        s1n1p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(s1n1p1.this,s1n1p1_4.class);
                startActivity(intent);
            }
        });
        s1n1p6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(s1n1p1.this,s1n1p1_5.class);
                startActivity(intent);
            }
        });
    }
}
