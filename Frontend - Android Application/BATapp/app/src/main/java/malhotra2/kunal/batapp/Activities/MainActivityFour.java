package malhotra2.kunal.batapp.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import malhotra2.kunal.batapp.R;

public class MainActivityFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_four);
        display_name();
        shift_to_sign_in();
    }

    private void display_name(){
        String startup_name_intent = getIntent().getStringExtra("startupName");
        Log.d("Startup Name Verified", startup_name_intent);
        TextView textView = (TextView) findViewById(R.id.tv_intent_name);
        textView.setText(startup_name_intent);

    }

    private void shift_to_sign_in(){
        Button button = (Button) findViewById(R.id.btn_ready_for_the_journey);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivityFour.this, MainActivityTwo.class));
            }
        });
    }
}
