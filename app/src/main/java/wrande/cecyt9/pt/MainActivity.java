package wrande.cecyt9.pt;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void practicas(View v){
            Intent envia = new Intent(this, Practicas.class);
            finish();
            startActivity(envia);
    }
    public void teoria(View v){
        Intent envia = new Intent(this, Teoria.class);
        finish();
        startActivity(envia);
    }
}
