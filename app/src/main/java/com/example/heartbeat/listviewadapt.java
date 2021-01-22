package com.example.heartbeat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class listviewadapt extends RecyclerView.Adapter<listviewadapt.MatchViewHolder>{

    private ArrayList<MatchItem> matchlist;
    private listviewadapt.OnItemClickListener Listener2;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(OnItemClickListener listener) {
        Listener2 = listener;
    }

    public static class MatchViewHolder extends RecyclerView.ViewHolder{

        public ImageView profilbild;
        public TextView nameTxt;
        public TextView matchabilityTxt;
        public ImageView herz;


        public MatchViewHolder(View itemView, final OnItemClickListener listener){
            super(itemView);
            profilbild = itemView.findViewById(R.id. profilbild);
            nameTxt = itemView.findViewById(R.id.nameTxt);
            matchabilityTxt = itemView.findViewById(R.id.matchabilityTxt);
            herz = itemView.findViewById(R.id.herz);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onItemClick(position);
                        }
                    }
                }
            });

        }

    }
    public listviewadapt (ArrayList<MatchItem> Matchlist)
    {
        matchlist = Matchlist;
    }

    @Override
    public MatchViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listviewadapt, parent, false);
        MatchViewHolder e = new MatchViewHolder(v, Listener2);
        return e;
    }

    @Override
    public void onBindViewHolder(@NonNull MatchViewHolder holder, int position)
    {
        MatchItem currentItem = matchlist.get(position);
        holder.profilbild.setImageResource(currentItem.getSimageresource());
        holder.nameTxt.setText(currentItem.getStext1());
        holder.matchabilityTxt.setText(currentItem.getStext2());
        holder.herz.setImageResource(currentItem.getSimageresource2());

    }

    @Override
    public int getItemCount() {
        return matchlist.size();
    }
}

