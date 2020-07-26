package com.example.google;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.google.fragmens.destacado;
import com.example.google.fragmens.inicio;
import com.google.android.material.navigation.NavigationView;

public class Drive extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drive);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        navigationView=(NavigationView)findViewById(R.id.nav_view);
        setToolbar();
        setFragmetDefault();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                navigationView.getMenu().getItem(0).setChecked(false);
                boolean Transaccion=false;
                Fragment fragment=null;
                switch (menuItem.getItemId())
                {
                    case R.id.menu_recientes:
                        fragment= new inicio();
                        Transaccion=true;
                        break;
                    case R.id.menu_destacado:
                        fragment= new destacado();
                        Transaccion=true;
                        break;
                    case R.id.menu_configuracion:
                        menuItem.setChecked(false);
                        break;
                    case R.id.menu_papelera:
                        menuItem.setChecked(false);
                        break;
                    case R.id.menu_sinconexion:
                        menuItem.setChecked(false);
                        break;
                    case R.id.menu_ayuda:
                        break;
                    case R.id.menu_notificaciones:
                        menuItem.setChecked(false);
                        break;
                }
                if(Transaccion)
                {
                    cambiarfradmento(fragment,menuItem);
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                return true;
            }
        });
    }
    public void setFragmetDefault(){
        cambiarfradmento(new inicio(),navigationView.getMenu().findItem(R.id.menu_recientes));
    }
    public void cambiarfradmento(Fragment fragment,MenuItem item){
        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame,fragment).commit();
        item.setChecked(true);
        getSupportActionBar().setTitle(item.getTitle());
    }

    public void setToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                //abrir el menu lateral
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);

        MenuItem menuItem=menu.findItem(R.id.action_buscar);
        SearchView searchView=(SearchView) menuItem.getActionView();
        searchView.setQueryHint("Buscar en Drive");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}