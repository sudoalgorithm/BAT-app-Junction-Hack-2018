package malhotra2.kunal.batapp.Activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import malhotra2.kunal.batapp.Fragments.StartupToCorporatesFragments;
import malhotra2.kunal.batapp.Fragments.StartupToInvestorFragment;
import malhotra2.kunal.batapp.Fragments.StartupToStartupFragment;
import malhotra2.kunal.batapp.R;

public class MainActivitySix extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.startup_to_investor:
                    selectedFragment = StartupToInvestorFragment.newInstance();
                    break;
                case R.id.startup_to_corporate:
                    selectedFragment = StartupToCorporatesFragments.newInstance();
                    break;
                case R.id.startup_to_startup:
                    selectedFragment = StartupToStartupFragment.newInstance();
                    break;
            }
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frame_layout, selectedFragment);
            transaction.commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_six);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(false);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, StartupToInvestorFragment.newInstance());
        fragmentTransaction.commit();
    }

}
