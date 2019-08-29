package ir.wccs.epoxy_resin_learning;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;



public class s1p1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s1p1);

        VideoView videoView;
        final String VIDEO_PATH = "https://wccs.ir/download/season1/intro1.mp4";
        MediaController mediaController;
        videoView = (VideoView)findViewById(R.id.video_View);
        videoView.setVideoPath(VIDEO_PATH);
        mediaController = new MediaController(s1p1.this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();


    }
}
