package malhotra2.kunal.batapp.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import malhotra2.kunal.batapp.R;

public class MainActivityFive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_five);
        btn_startup();
        btn_corp();
        btn_investor();
    }

    private void btn_startup(){
        Button button = (Button) findViewById(R.id.btn_startup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivityFive.this, MainActivityThree.class));
            }
        });

    }

    private void btn_corp(){
        Button button = (Button) findViewById(R.id.btn_corp);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void btn_investor(){
        Button button = (Button) findViewById(R.id.btn_investor);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
