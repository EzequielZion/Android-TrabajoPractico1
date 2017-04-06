package zion.costa.trabajopractico1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActividadPrincipal extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_principal);
    }
    public void PresionarBoton1(View vista) //Lleva a la Activity del punto 1
    {
        Intent ActividadDeDestino;
        ActividadDeDestino = new Intent(ActividadPrincipal.this, Punto1.class);
        startActivity(ActividadDeDestino);
    }
    public void PresionarBoton2(View vista) //Lleva a la Activity del punto 2
    {
        Intent ActividadDeDestino;
        ActividadDeDestino = new Intent(ActividadPrincipal.this, Punto2.class);
        startActivity(ActividadDeDestino);
    }
    public void PresionarBoton3(View vista) //Lleva a la Activity del punto 3
    {
        Intent ActividadDeDestino;
        ActividadDeDestino = new Intent(ActividadPrincipal.this, Punto3.class);
        startActivity(ActividadDeDestino);
    }
    public void PresionarBoton4(View vista) //Lleva a la Activity del punto 4
    {
        Intent ActividadDeDestino;
        ActividadDeDestino = new Intent(ActividadPrincipal.this, Punto4.class);
        startActivity(ActividadDeDestino);
    }

}
