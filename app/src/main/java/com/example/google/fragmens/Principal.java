package com.example.google.fragmens;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.google.R;
import com.example.google.adaptadores.AdaptadorGmail;
import com.example.google.adaptadores.MyAdapter;
import com.example.google.clases.Archivo;
import com.example.google.clases.Mensaje;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Principal#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Principal extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Principal() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Principal.
     */
    // TODO: Rename and change types and number of parameters
    public static Principal newInstance(String param1, String param2) {
        Principal fragment = new Principal();
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
    ArrayList<Mensaje> msm;
    RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista=inflater.inflate(R.layout.fragment_principal, container, false);
        recyclerView=(RecyclerView) vista.findViewById(R.id.Recyclerviewgmail);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        msm=new ArrayList<>();
        agregardatos();
        AdaptadorGmail adapter=new AdaptadorGmail(msm);
        recyclerView.setAdapter(adapter);
        return vista;
    }
    public  void  agregardatos(){
     //int etiqueta, int perfil, int destacado, String titulo, String subtitulo, String cuerpo, String hora
        msm.add( new Mensaje(R.drawable.etiquetasms,R.drawable.sga,R.drawable.ic_destacadogmail,"SGA","Login exitoso", "Mensaje del sistema de gestión Acad..." ,"19:10"));
        msm.add( new Mensaje(R.drawable.etiquetasms,R.drawable.juan,R.drawable.ic_destacadogmail,"Juan Carlos","Informe horas","Horas de las correras de la f....","13:43" ));
        msm.add( new Mensaje(R.drawable.etiquetasms,R.drawable.sga,R.drawable.ic_destacadogmail,"SGA3","Login exitoso","Mensaje del sistema de gestión Acad...","18:20" ));
        msm.add( new Mensaje(R.drawable.etiquetasms,R.drawable.sga,R.drawable.ic_destacadogmail,"SGA4","Login exitoso","Mensaje del sistema de gestión Acad...","17:55" ));
        msm.add( new Mensaje(R.drawable.etiquetasms,R.drawable.juan,R.drawable.ic_destacadogmail,"Juan Carlos","Horas complementarias","Horas Complementarias de la c...","13:43" ));
        msm.add( new Mensaje(R.drawable.etiquetasms,R.drawable.carlos,R.drawable.ic_destacadogmail,"Pedro Mendoza","Informe Pasentias","Envio de Pasentias en la Uni....","13:00" ));
        msm.add( new Mensaje(R.drawable.etiquetasms,R.drawable.ris,R.drawable.ic_destacadogmail,"Enrique Ortega","Justificación de faltas","Justificacion de faltas por h...","14:43" ));
        msm.add( new Mensaje(R.drawable.etiquetasms,R.drawable.ris,R.drawable.ic_destacadogmail,"Fabricio Baño","Solicitud de Cambio","Solicitud de cambio de carrer....","20:43" ));
    }
}