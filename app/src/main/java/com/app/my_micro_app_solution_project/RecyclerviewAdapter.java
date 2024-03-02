package com.app.my_micro_app_solution_project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.Holder> {
    MainActivity mainActivity;
    ArrayList<Pro_Model> productModellist;

    public RecyclerviewAdapter(MainActivity mainActivity, ArrayList<Pro_Model> productModellist) {
        this.mainActivity=mainActivity;
        this.productModellist=productModellist;
    }

    @NonNull
    @Override
    public RecyclerviewAdapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(mainActivity).inflate(R.layout.layout_item_file,parent,false);
        Holder holder=new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewAdapter.Holder holder, int position) {
   holder.name.setText(""+productModellist.get(position).getAppname());
   holder.link.setText(""+productModellist.get(position).getApplink());
   holder.packagename.setText(""+productModellist.get(position).getPackagename());
        Glide
                .with(mainActivity)
                .load(productModellist.get(position).getApplogo())
                .centerCrop()
                .placeholder(R.drawable.rotation)
                .into(holder.img);

    }

    @Override
    public int getItemCount() {
        return productModellist.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView name,link,packagename;
        public Holder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img);
            name=itemView.findViewById(R.id.name);
            link=itemView.findViewById(R.id.link);
            packagename=itemView.findViewById(R.id.packagename);

        }
    }
}
