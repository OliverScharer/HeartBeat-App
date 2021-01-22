package com.example.heartbeat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//Adapter, der die ListView generiert und mit den Daten aus matches über ViewHolder und matches verbindet, befüllt die Cardview(listviewadapt)
public class listviewadapt extends RecyclerView.Adapter<listviewadapt.ViewHolder>{
    private ArrayList<String[]>matchliste;
private OnItemClickListener listener;
public listviewadapt (ArrayList<String[]> matchliste) //Konstruktor, der adapter mit übergebenen Daten baut
{
    this.matchliste = matchliste;
}
public interface OnItemClickListener{                       //eigener OnClickListener um eigene elemente anwählen zu können
    void OnItemClick(int position);
}
public void setOnItemClickListener(OnItemClickListener listener) { //Setmethode für OnCLickListener ^
    this.listener = listener;
}
    @NonNull
    @Override
    public listviewadapt.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {                       //Zeigt an um welches Layout es geht, legt viewholder an
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listviewadapt,parent,false);
        ViewHolder viewholder = new ViewHolder(view, listener);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull listviewadapt.ViewHolder holder, int position) {                              //Zeigt dann die tatsächlichen Items an, "befüllt" die Liste
        holder.profilName.setText(matchliste.get(position)[0]);
        holder.profilbild.setImageResource(Integer.parseInt(matchliste.get(position)[1]));
        holder.matchability.setText(matchliste.get(position)[2]);
    }

    @Override                                                                                                           //Ist halt drin
    public int getItemCount() {
        return matchliste.size();
    }

    //personalisierte Verbindung von Layoutelementen mit adapter
    class ViewHolder extends RecyclerView.ViewHolder {
        public TextView profilName;
        public TextView matchability;
        public de.hdodenhof.circleimageview.CircleImageView profilbild;
        public ImageView herz;
        public ViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);
            profilName = itemView.findViewById(R.id.nameTxt);
            matchability = itemView.findViewById(R.id.matchabilityTxt);
            profilbild = itemView.findViewById(R.id.profilbild);
            herz = itemView.findViewById(R.id.herz);
            herz.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   herz.setImageResource(R.drawable.heart_red);
                }
            });
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
}
