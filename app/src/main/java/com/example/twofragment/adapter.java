package com.example.twofragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder>{
    ArrayList<String> data;
    Context context;
    public adapter( ArrayList<String> data, Context context)
    {
        this.data=data;
        this.context=context;
    }
TextView text;
    TextView t1;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View listItem= layoutInflater.inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.textView.setText(data.get(position));

        holder.relativeLayout.setOnClickListener(new View.OnClickListener()
                {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "click on item: " + data.get(position), Toast.LENGTH_SHORT).show();
                frag2 frag2 = new frag2();
                final Bundle bundle = new Bundle();
                bundle.putInt("hello",position);
                frag2.setArguments(bundle);
                ((MainActivity) context).getSupportFragmentManager().beginTransaction().replace(R.id.frame2, frag2, "OptionsFragment").addToBackStack(null).commit();

            }
              });
            }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;
        public RelativeLayout relativeLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.textView = (TextView) itemView.findViewById(R.id.textView);
            relativeLayout = (RelativeLayout)itemView.findViewById(R.id.relativeLayout);

        }
    }

}
