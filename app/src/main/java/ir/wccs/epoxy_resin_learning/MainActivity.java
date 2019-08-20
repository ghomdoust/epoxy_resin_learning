package ir.wccs.epoxy_resin_learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

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


        ibtn1.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animation7);
            }

            });

    }
}
