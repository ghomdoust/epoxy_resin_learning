package ir.wccs.epoxy_resin_learning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;





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



        ibtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,season1.class);
                startActivity(intent);
            }
        });

        ibtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,season2.class);
                startActivity(intent);
            }
        });

        ibtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,season3.class);
                startActivity(intent);
            }
        });

        ibtn4.setOnClickListener(new View.OnClickListener() {
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

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()== R.id.action_main_program){

            Intent intent = new Intent(MainActivity.this,main_program.class);
            startActivity(intent);
        }
        if (item.getItemId()== R.id.action_about_us){

            Intent intent = new Intent(MainActivity.this,about_us.class);
            startActivity(intent);
        }
        if (item.getItemId()== R.id.action_exit){

            System.exit(0);
        }
        return super.onOptionsItemSelected(item);
    }
}







