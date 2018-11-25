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

public class StartupToCorporatesFragments extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;

    public static StartupToCorporatesFragments newInstance() {
        StartupToCorporatesFragments fragment = new StartupToCorporatesFragments();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.activity_startup_to_corporates_fragments, container, false);

        ArrayList<Model> list = new ArrayList();

        list.add(new Model("Ncrypted Technologies Oy", "Entertainment and media\n" +
                "Education\n" +
                "Digital health (health IT)\n" +
                "On-demand services\n" +
                "Automotive and transportation\n" +
                "Impact\n" +
                "Logistics\n" +
                "Social entrepreneurship\n" +
                "Cybersecurity\n" +
                "Retail\n" +
                "Hospitality and travel\n" +
                "Financial and insurance\n" +
                "E-Commerce\n" +
                "Travel", R.drawable.companies_image_one));
        list.add(new Model("Yousician", "Music, AI, Cloud", R.drawable.company_image_two));
        list.add(new Model("Walkbase","Retail analytics", R.drawable.company_name_three));


        CustomAdapter adapter = new CustomAdapter(list);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.rv_startup_to_corporates);
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(adapter);

        return view;
    }
}
