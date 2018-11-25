package malhotra2.kunal.batapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivityTwo extends AppCompatActivity {

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);
        register_btn_click();
    }

    private void register_btn_click(){
        mTextView = (TextView) findViewById(R.id.tv_register_activity_two);
        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivityTwo.this, MainActivityFive.class));
            }
        });
    }
}
