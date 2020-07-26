package com.example.google.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.google.R;
import com.example.google.clases.Archivo;

import java.util.ArrayList;

public class MyAdapter  extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList<Archivo> names;
    public MyAdapter(ArrayList<Archivo> names)
    {
        this.names=names;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recicler_view_item,null,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.titulo.setText(names.get(position).getTitulo());
        holder.textofinal.setText(names.get(position).getTextofinal());
        holder.imagentexto.setImageResource(names.get(position).getImagentexto());
        holder.imagentrespuntos.setImageResource(names.get(position).getImagentrespuntos());
        holder.imagencuerpo.setImageResource(names.get(position).getImagencuerpo());
        holder.imagenlogo.setImageResource(names.get(position).getImagenlogo());
    }
    public int getItemCount() {
        return names.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView titulo;
        TextView textofinal;
        ImageView imagentexto;
        ImageView imagentrespuntos;
        ImageView imagencuerpo;
        ImageView imagenlogo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo=(TextView) itemView.findViewById(R.id.titulotexto);
            textofinal=(TextView) itemView.findViewById(R.id.fintexto);
            imagentexto=(ImageView) itemView.findViewById(R.id.imagentexto);
            imagentrespuntos=(ImageView) itemView.findViewById(R.id.imagetrespuntos);
            imagencuerpo=(ImageView) itemView.findViewById(R.id.imagecuerpo);
            imagenlogo=(ImageView) itemView.findViewById(R.id.imagenperfil);
        }

    }


}
