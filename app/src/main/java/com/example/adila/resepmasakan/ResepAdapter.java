package com.example.adila.resepmasakan;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Adila on 03-Oct-17.
 */

public class ResepAdapter extends RecyclerView.Adapter <ResepAdapter.ResepViewHolder> {

    private Context context;
    private ArrayList<Resep> resepList;


    public ResepAdapter(Context context, ArrayList<Resep> resepList){
        this.context = context;
        this.resepList = resepList;
}

    public class ResepViewHolder extends RecyclerView.ViewHolder{

        ImageView gambarResep;
        TextView judulResep;
        TextView deskripsiResep;

        public ResepViewHolder(View itemView){
            super(itemView);
            gambarResep = (ImageView)itemView.findViewById(R.id.gambar);
            judulResep = (TextView)itemView.findViewById(R.id.judul);
            deskripsiResep = (TextView)itemView.findViewById(R.id.deskripsi);
        }
    }

    @Override
    public ResepAdapter.ResepViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                    .from(parent.getContext())
                    .inflate(R.layout.list_resep, parent, false);
        return new ResepViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ResepAdapter.ResepViewHolder holder, final int position) {
        holder.gambarResep.setImageResource(resepList.get(position).getGambarResep());
        holder.judulResep.setText(resepList.get(position).getJudulResep());
        holder.deskripsiResep.setText(resepList.get(position).getDeskripsiResep());



        holder.judulResep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailResep.class);

                intent.putExtra("gambar_resep",resepList.get(position).getGambarResep());
                intent.putExtra("text_judul",resepList.get(position).getJudulResep());
                intent.putExtra("text_bahan",resepList.get(position).getBahanResep());
                intent.putExtra("text_pembuatan",resepList.get(position).getPembuatanResep());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return resepList.size();
    }

}
