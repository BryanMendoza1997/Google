package com.example.google.fragmens;

import android.content.res.ColorStateList;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.google.R;
import com.example.google.adaptadores.MyAdapter;
import com.example.google.clases.Archivo;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link inicio#newInstance} factory method to
 * create an instance of this fragment.
 */
public class inicio extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;



    public inicio() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment inicio.
     */
    // TODO: Rename and change types and number of parameters
    public static inicio newInstance(String param1, String param2) {
        inicio fragment = new inicio();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    ArrayList<Archivo> products;
    RecyclerView recyclerView;
    FloatingActionButton botoncito;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista=inflater.inflate(R.layout.fragment_inicio, container, false);
        recyclerView=(RecyclerView) vista.findViewById(R.id.Recyclerview);
        botoncito=(FloatingActionButton)vista.findViewById(R.id.floating_action_button);
        ColorStateList colorcito1=new ColorStateList(new int[][]{ new int [0]},new int[]{0xff008F39});
        botoncito.setBackgroundTintList(colorcito1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        products=new ArrayList<>();
        agregardatos();
        MyAdapter adapter=new MyAdapter(products);
        recyclerView.setAdapter(adapter);
        return vista;
    }

    public  void  agregardatos(){
        products.add( new Archivo(R.drawable.powerpoint,R.drawable.ic_puntos,R.drawable.cuerpodiapositiva,R.drawable.userm,"Practica 7 UI ToolBar Menu Floting","Abierto hoy" ));
        products.add( new Archivo(R.drawable.word,R.drawable.ic_puntos,R.drawable.wordtext,R.drawable.userm,"Fundamentos de Redes","Lo subiste ayer" ));
        products.add( new Archivo(R.drawable.pdf,R.drawable.ic_puntos,R.drawable.pdftext,R.drawable.userm,"Aplicaciones Distribuidas","Abierto por ti la semana pasada" ));
        products.add( new Archivo(R.drawable.word,R.drawable.ic_puntos,R.drawable.wordtext,R.drawable.userm,"Modelo TCP/IP","Lo has subido hoy" ));
    }
}