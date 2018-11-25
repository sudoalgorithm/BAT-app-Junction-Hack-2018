package malhotra2.kunal.batapp.Utils;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import malhotra2.kunal.batapp.R;

public class ViewHolder extends RecyclerView.ViewHolder {
    ImageView mImageView;
    TextView mTextView1, mTextView2;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        mImageView = (ImageView) itemView.findViewById(R.id.iv_part);
        mTextView1 = (TextView) itemView.findViewById(R.id.tv_part_name);
        mTextView2 = (TextView) itemView.findViewById(R.id.tv_part_price);
    }
}