package malhotra2.kunal.batapp.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import malhotra2.kunal.batapp.R;

public class MainActivityThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_three);
        register_btn_clicled();
    }

    private String get_text_et(){
        EditText editText = (EditText) findViewById(R.id.et_startup_name);
        String startupName = editText.getText().toString();
        return startupName;
    }

    private void register_btn_clicled(){
        Button button = (Button) findViewById(R.id.btn_register);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityThree.this, MainActivityFour.class);
                intent.putExtra("startupName", get_text_et());
                Log.d("Startup Name", get_text_et());
                startActivity(intent);
            }
        });
    }


}
