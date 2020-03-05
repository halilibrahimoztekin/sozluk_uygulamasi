package com.example.denemeszlkuygulamas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class KelimelerAdapter extends RecyclerView.Adapter<KelimelerAdapter.CardNesneleriniTutucu> {
    public Context mContext;
    private List<Kelimeler>kelimelerListe;

    public KelimelerAdapter(Context mContext, List<Kelimeler> kelimelerListe) {
        this.mContext = mContext;
        this.kelimelerListe = kelimelerListe;
    }

    @NonNull
    @Override
    public CardNesneleriniTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_tasarimi,parent,false);
        return new CardNesneleriniTutucu(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardNesneleriniTutucu holder, int position) {
        Kelimeler kelime = kelimelerListe.get(position);
        holder.textViewEn.setText(kelime.getIngilizce());
        holder.textViewTR.setText(kelime.getTurkce());
        holder.cr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return kelimelerListe.size();
    }

    public class CardNesneleriniTutucu extends RecyclerView.ViewHolder{
        private CardView cr;
        private TextView  textViewTR,textViewEn;

        public CardNesneleriniTutucu(@NonNull View itemView) {
            super(itemView);
            cr = itemView.findViewById(R.id.cr);
            textViewEn = itemView.findViewById(R.id.textViewEn);
            textViewTR = itemView.findViewById(R.id.textViewTR);
        }


    }
}
