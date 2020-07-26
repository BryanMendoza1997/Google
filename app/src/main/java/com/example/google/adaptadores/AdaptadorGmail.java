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
import com.example.google.clases.Mensaje;

import java.util.ArrayList;

public class AdaptadorGmail  extends RecyclerView.Adapter<AdaptadorGmail.ViewHolder>{
    private ArrayList<Mensaje> names;
    public AdaptadorGmail(ArrayList<Mensaje> names)
    {
        this.names=names;
    }
    @NonNull
    @Override
    public AdaptadorGmail.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recicler_view_item_gmail,null,false);
        return new AdaptadorGmail.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.titulo.setText(names.get(position).getTitulo());
        holder.subtitulo.setText(names.get(position).getSubtitulo());
        holder.mensaje.setText(names.get(position).getCuerpo());
        holder.hora.setText(names.get(position).getHora());
        holder.imagenetiquetasms.setImageResource(names.get(position).getEtiqueta());
        holder.imagenperfil.setImageResource(names.get(position).getPerfil());
        holder.imagendestacados.setImageResource(names.get(position).getDestacado());
    }

    public int getItemCount() {
        return names.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView titulo;
        TextView subtitulo;
        TextView mensaje;
        TextView hora;
        ImageView imagenperfil;
        ImageView imagendestacados;
        ImageView imagenetiquetasms;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo=(TextView) itemView.findViewById(R.id.titulogmail);
            subtitulo=(TextView) itemView.findViewById(R.id.subtitulogmail);
            mensaje=(TextView) itemView.findViewById(R.id.cuerpogmail);
            hora=(TextView) itemView.findViewById(R.id.horagmail);
            imagenperfil=(ImageView) itemView.findViewById(R.id.imagenpergmail);
            imagendestacados=(ImageView) itemView.findViewById(R.id.destacadosgmail);
            imagenetiquetasms=(ImageView) itemView.findViewById(R.id.imagemsmgmail);
        }

    }

}
