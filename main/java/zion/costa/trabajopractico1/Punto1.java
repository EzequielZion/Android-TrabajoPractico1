package zion.costa.trabajopractico1;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Punto1 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.punto_1);
    }

    int CantidadCaracteres1;
    int CantidadCaracteres2;

    public void Punto1A (View vista)
    {
        //En las siguientes líneas se instancia el string a mostrar con la cantidad de caracteres que tiene el texto 1
        EditText Texto1;
        Texto1 = (EditText) findViewById(R.id.Punto1Texto1);
        CantidadCaracteres1 = Texto1.getText().length();
        String TextoAMostrar1;
        TextoAMostrar1 = "La cantidad de caracteres del texto 1 es " + CantidadCaracteres1;

        //En las siguientes líneas se instancia el string a mostrar con la cantidad de caracteres que tiene el texto 2
        EditText Texto2;
        Texto2 = (EditText) findViewById(R.id.Punto1Texto2);
        CantidadCaracteres2 = Texto2.getText().length();
        String TextoAMostrar2;
        TextoAMostrar2 = "La cantidad de caracteres del texto 2 es " + CantidadCaracteres2;

        //En las siguientes líneas se instancian los toasts para mostrar los resultados
        Toast MostrarResultado1;
        MostrarResultado1 = Toast.makeText(this, TextoAMostrar1, Toast.LENGTH_SHORT);
        Toast MostrarResultado2;
        MostrarResultado2 = Toast.makeText(this, TextoAMostrar2, Toast.LENGTH_SHORT);

        //Se muestran los toasts
        MostrarResultado1.show();
        MostrarResultado2.show();
    }
    public void Punto1B (View vista)
    {
        boolean Ayuda = false;
        //Se instancian las variables de la cantidad de caracteres en el texto 1 y 2
        EditText Texto1;
        Texto1 = (EditText)findViewById(R.id.Punto1Texto1);
        CantidadCaracteres1 = Texto1.getText().length();
        EditText Texto2;
        Texto2 = (EditText)findViewById(R.id.Punto1Texto2);
        CantidadCaracteres2 = Texto2.getText().length();

        //Se declaran los strings de acuerdo a los caracteres excedentes entre el texto 1 y 2
        int CaracteresExcedentes = 0;
        String TextoAMostrar1B = "La cantidad de caracteres excedentes es ";
        if (CantidadCaracteres1 == CantidadCaracteres2)//Si los dos textos son iguales muestra ese mensaje
        {
           TextoAMostrar1B = "No hay caractéres excedentes";
            Ayuda = true;
        }
        else
        {
            //En las siguientes lineas se calculan los caracteres excedentes y se alojan en la variable
            if(CantidadCaracteres1 > CantidadCaracteres2)
            {
                CaracteresExcedentes = CantidadCaracteres1 - CantidadCaracteres2;
            }
            else
            {
                CaracteresExcedentes = CantidadCaracteres2 - CantidadCaracteres1;
            }
        }
        if (Ayuda != true)
        {
            TextoAMostrar1B = TextoAMostrar1B + CaracteresExcedentes; //Se une el texto junto con el número, si cumple la condición de que no sean iguales los dos textos
        }
        //En las siguientes líneas se declara y se muestra el toast del resultado
        Toast MostrarCaracteresExcedentes;
        MostrarCaracteresExcedentes = Toast.makeText(this, TextoAMostrar1B, Toast.LENGTH_SHORT);
        MostrarCaracteresExcedentes.show();
    }
    public void Punto1C (View Vista)
    {
        //En las siguientes líneas se crea una variable que contiene los primeros tres caracteres del primer texto
        EditText Txt1;
        Txt1 = (EditText)findViewById(R.id.Punto1Texto1);
        String Texto1 = Txt1.getText().toString();
        Texto1 = Texto1.substring(0,3);

        //En las siguientes líneas se crea una variable que contiene los primeros tres caracteres del segundo texto
        EditText Txt2;
        Txt2 = (EditText)findViewById(R.id.Punto1Texto2);
        String Texto2 = Txt2.getText().toString();
        Texto2 = Texto2.substring(0,3);
        String TextoFinal;

        //Acá se concatenan las dos variables previamente creadas. Después se crea un toast y se muestra el texto concatenado
        TextoFinal = Texto1 + Texto2;
        Toast MostrarConcatenados;
        MostrarConcatenados = Toast.makeText(this, TextoFinal, Toast.LENGTH_SHORT);
        MostrarConcatenados.show();
    }
}

