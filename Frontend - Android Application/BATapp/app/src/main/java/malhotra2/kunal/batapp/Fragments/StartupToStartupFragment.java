package malhotra2.kunal.batapp.Fragments;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import malhotra2.kunal.batapp.R;

public class StartupToStartupFragment extends Fragment {

    public static StartupToStartupFragment newInstance() {
        StartupToStartupFragment fragment = new StartupToStartupFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.activity_startup_to_startup_fragment, container, false);
        return view;
    }
}
