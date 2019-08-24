package ir.wccs.epoxy_resin_learning;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.content.Intent;





@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        final ImageButton ibtn1 = (ImageButton) findViewById(R.id.ibtn1);
        final ImageButton ibtn2 = (ImageButton) findViewById(R.id.ibtn2);
        final ImageButton ibtn3 = (ImageButton) findViewById(R.id.ibtn3);
        final ImageButton ibtn4 = (ImageButton) findViewById(R.id.ibtn4);
        final ImageButton ibtn5 = (ImageButton) findViewById(R.id.ibtn5);
        final ImageButton ibtn6 = (ImageButton) findViewById(R.id.ibtn6);



        ibtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,season1.class);
                startActivity(intent);
            }
        });

        ibtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,season2.class);
                startActivity(intent);
            }
        });

        ibtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,season3.class);
                startActivity(intent);
            }
        });

        ibtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,season4.class);
                startActivity(intent);
            }
        });

        ibtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,season5.class);
                startActivity(intent);
            }
        });

        ibtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,season6.class);
                startActivity(intent);
            }
        });






        final Animation animation1= AnimationUtils.loadAnimation(this,R.anim.main_move_right);
        ibtn1.setAnimation(animation1);

        final Animation animation2= AnimationUtils.loadAnimation(this,R.anim.main_move_right);
        ibtn2.setAnimation(animation2);

        final Animation animation3= AnimationUtils.loadAnimation(this,R.anim.main_move_right);
        ibtn3.setAnimation(animation3);

        final Animation animation4= AnimationUtils.loadAnimation(this,R.anim.main_move_left);
        ibtn4.setAnimation(animation4);

        final Animation animation5= AnimationUtils.loadAnimation(this,R.anim.main_move_left);
        ibtn5.setAnimation(animation5);

        final Animation animation6= AnimationUtils.loadAnimation(this,R.anim.main_move_left);
        ibtn6.setAnimation(animation6);

        final Animation animation7= AnimationUtils.loadAnimation(this,R.anim.alpha);


        /*
        ibtn1.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animation7);
            }

        });
        ibtn2.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animation7);
            }
        });
        ibtn3.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animation7);
            }
        });
        ibtn4.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animation7);
            }
        });
        ibtn5.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animation7);
            }
        });
        ibtn5.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animation7);
            }
        });
        ibtn6.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animation7);
            }
        });
        */




    }
}
