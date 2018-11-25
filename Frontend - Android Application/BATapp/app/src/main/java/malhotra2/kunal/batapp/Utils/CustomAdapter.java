package malhotra2.kunal.batapp.Utils;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import malhotra2.kunal.batapp.Data.Model;
import malhotra2.kunal.batapp.R;

public class CustomAdapter extends RecyclerView.Adapter<ViewHolder> {

    private ArrayList<Model> data;

    public CustomAdapter(ArrayList<Model> data){
        this.data = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_rv_layout,viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        TextView textViewName = viewHolder.mTextView1;
        TextView textViewVersion = viewHolder.mTextView2;
        ImageView imageView = viewHolder.mImageView;

        textViewName.setText(data.get(i).getNames());
        textViewVersion.setText(data.get(i).getIndustry());
        imageView.setImageResource(data.get(i).getImages());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
