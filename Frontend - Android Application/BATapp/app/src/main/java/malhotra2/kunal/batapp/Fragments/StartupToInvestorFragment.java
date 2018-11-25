package malhotra2.kunal.batapp.Fragments;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import malhotra2.kunal.batapp.Data.Model;
import malhotra2.kunal.batapp.R;
import malhotra2.kunal.batapp.Utils.CustomAdapter;

public class StartupToInvestorFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;

    public static StartupToInvestorFragment newInstance() {
        StartupToInvestorFragment fragment = new StartupToInvestorFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.activity_startup_to_investor_fragment, container, false);

        ArrayList<Model> list = new ArrayList();

        list.add(new Model("Mika Marjalaakso", "Mobile Social Online Scheduling Group SMS Location Based Services Indoor Positioning Consumer Internet Mobile Social Media SaaS E-Commerce Analytics Social Commerce Bridging Online and Offline Retail Technology", R.drawable.investor_one));
        list.add(new Model("Fredrik Kekalainen", "Clean Technology Enterprise Software Mobile Healthcare Waste Management Internet of Things Food Tech", R.drawable.investor_two));
        list.add(new Model("Mark Ollila","Consumer Internet Mobile SaaS Health Care Information Technology Mobile Health Online Scheduling Enterprise Software Development Platforms Aerospace Unmanned Air Systems", R.drawable.investor_three));

        CustomAdapter adapter = new CustomAdapter(list);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.rv_startup_to_investor);
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(adapter);
        return view;
    }
}
