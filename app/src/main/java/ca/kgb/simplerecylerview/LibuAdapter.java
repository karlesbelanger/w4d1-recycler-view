package ca.kgb.simplerecylerview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by admin on 8/8/2016.
 */
public class LibuAdapter extends RecyclerView.Adapter<LibuAdapter.ViewHolder> {

    private ArrayList<String> mString;
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewName;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewName = (TextView)itemView.findViewById(R.id.r_list_text);
        }
    }

    public LibuAdapter(ArrayList<String> strings){
        this.mString = strings;
    }
    @Override
    public LibuAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LibuAdapter.ViewHolder holder, int position) {
        String string = mString.get(position);

        TextView textView = holder.textViewName;
        textView.setText(string);
    }

    @Override
    public int getItemCount() {
        return mString == null
                ? 0
                : mString.size();
    }
}
