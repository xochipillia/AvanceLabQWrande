package wrande.cecyt9.pt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Xochipilli on 23/04/2017.
 */

public class Teoria extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teoria);
    }

    public void teoria1(View v){
        Intent envia = new Intent(this, Teoria1.class);
        finish();
        startActivity(envia);
    }
    public void teoria7(View v){
        Intent envia = new Intent(this, Teoria7.class);
        finish();
        startActivity(envia);
    }
}
