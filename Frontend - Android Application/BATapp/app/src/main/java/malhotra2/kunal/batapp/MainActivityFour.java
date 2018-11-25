package malhotra2.kunal.batapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivityFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_four);
        display_name();
    }

    private void display_name(){
        String startup_name_intent = getIntent().getStringExtra("startupName");
        Log.d("Startup Name Verified", startup_name_intent);
        TextView textView = (TextView) findViewById(R.id.tv_intent_name);
        textView.setText(startup_name_intent);

    }
}
