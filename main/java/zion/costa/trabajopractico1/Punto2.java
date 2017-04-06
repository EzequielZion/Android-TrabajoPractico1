package zion.costa.trabajopractico1;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Punto2 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.punto_2);

    }
    char LetraAContar = 'a';
    public void Punto2(View view)
    {
        //Las siguientes líneas de código se encargan de contar cuántas letras hay de una letra en específico (la variable "LetraAContar")
        EditText TextoPunto2;
        TextoPunto2 = (EditText)findViewById(R.id.Punto2Texto1);
        String TextoAuxiliar;
        TextoAuxiliar = TextoPunto2.getText().toString();
        int Cantidad = 0;
        int LargoDeTexto = TextoAuxiliar.length();
        for(int i = 0; i < LargoDeTexto; i++ )
        {
            if(TextoAuxiliar.charAt(i) == LetraAContar ) //Compara un caracter del texto con la variable LetraAContar
            {
                Cantidad++; //Si resultan ser, se suma una letra encontrada al total
            }
        }
        //Abajo se muestra el toast que muestra el resultado
        Toast MostrarResultado2;
        MostrarResultado2 = Toast.makeText(this, "La cantidad de " + LetraAContar + " en el texto es de " + Cantidad, Toast.LENGTH_SHORT);
        MostrarResultado2.show();
    }
    public void CheckboxChequeado(View view)
    {
        EditText Punto2Texto1;
        Punto2Texto1 = (EditText) findViewById(R.id.Punto2Texto1);
        String StringPunto2Texto1 = Punto2Texto1.getText().toString();
        CheckBox Checky = (CheckBox)findViewById(R.id.Punto2CheckBox);
        if (StringPunto2Texto1.length() < 10) //Verifica que sean menos de diez carateres los ingresados en el EditText
        {
            if(Checky.isChecked() == true) //Si son menos de diez, y el checkbox está chequeado, manda el toast de advertencia
            {
                Toast Advertencia;
                Advertencia = Toast.makeText(this, "GUARDA LEO HAY MENOS DE 10 CARACTERES!", Toast.LENGTH_SHORT);
                Advertencia.show();
            }
        }
    }
    public void Punto2Extra(View view) //Este es el botón de ingreso de la letra específica para buscar
    {
        EditText Punto2Texto2;
        Punto2Texto2 = (EditText)findViewById(R.id.Punto2Texto2);
        if (Punto2Texto2.length() != 0) //Verifica que el EditText no esté vacío
        {
            String Aux = Punto2Texto2.getText().toString();
            LetraAContar = Aux.charAt(0); //Declara la variable LetraAContar como un solo caracter de un string
            //Se crea y se muestra el toast que indica cuántas letras hay
            Toast Mensaje;
            Mensaje = Toast.makeText(this, "Se contará la letra " + LetraAContar, Toast.LENGTH_SHORT);
            Mensaje.show();
        }
        else //Si no hay texto ingresado en el EditText se muestra un cartel diciendo que el default será la "a"
        {
            Toast Advertencia;
            Advertencia = Toast.makeText(this, "Si no ingresa nada, la letra por default será la 'a'", Toast.LENGTH_SHORT);
            Advertencia.show();
        }
    }
}

