package wrande.cecyt9.pt;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

/**
 * Created by Xochipilli on 23/04/2017.
 */

public class Teoria1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teoria1);
    }

    public class videoView extends Activity {
        private VideoView mVideoView;
        @Override public void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            mVideoView =(VideoView)findViewById(R.id.surface_view);
            //de forma alternativa si queremos un streaming usar
            //mVideoView.setVideoURI(Uri.parse(URLstring));
            mVideoView.setVideoPath("G:\\5IM7 Wrande\\PT\\app\\src\\main\\res\\drawable\\carbono.mp4");
            mVideoView.start();
            mVideoView.requestFocus();
        }
    }

}
