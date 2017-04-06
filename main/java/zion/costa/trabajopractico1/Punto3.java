package zion.costa.trabajopractico1;
import android.content.Intent;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Punto3 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.punto_3);
    }
    public boolean ChequeoDeCapicua(String TextoIngresado) //Chequea que el texto sea capicúa
    {
        TextoIngresado = TextoIngresado.trim(); //Quita los bordes del string
        TextoIngresado = TextoIngresado.replace(" ", ""); //Reemplaza los espacios por nada
        int Todo = TextoIngresado.length();
        for (int i = 0; i < Todo/2; i++)
        {
            char PrimeraLetra = TextoIngresado.charAt(i); //Se instancia la primera letra del texto ingresado
            char UltimaLetra = TextoIngresado.charAt(Todo-i-1); //Se instancia la última letra del texto ingresado
            if (PrimeraLetra != UltimaLetra) //Si son distintas, significa que la palabra no es capicúa y devuelve false
            {
                return false;
            }
        }
        return true;
    }
    public void Punto3(View view)
    {
        EditText Textoingresado;
        Textoingresado = (EditText)findViewById(R.id.Punto3Texto1);
        String StringTextoIngresado = Textoingresado.getText().toString();
        if(StringTextoIngresado.length() != 0)
        {
            if (StringTextoIngresado.length() > 10) //Verifica que el texto no tenga menos de 10 caracteres
            {
                String TextoAMostrar;
                TextoAMostrar = new StringBuilder(StringTextoIngresado).reverse().toString();
                Toast CartelMostrar;
                CartelMostrar = Toast.makeText(this, TextoAMostrar, Toast.LENGTH_SHORT);
                CartelMostrar.show();
                boolean EsCapicua;
                EsCapicua = ChequeoDeCapicua(StringTextoIngresado); //Llama a la función ChequeoDeCapicua
                if(EsCapicua == true) //Si devuelve true es porque es capicúa, y muestra un toast diciendo que es efectivamente capicúa
                {
                    Toast CartelCapicua;
                    CartelCapicua = Toast.makeText(this, "Sí es capicúa. Nice.", Toast.LENGTH_SHORT);
                    CartelCapicua.show();
                }
                else //Si devuelve false es porque es capicúa, y muestra un toast diciendo que efectivamente no es capicúa
                {
                    Toast CartelCapicua;
                    CartelCapicua = Toast.makeText(this, "No es capicúa. Meh.", Toast.LENGTH_SHORT);
                    CartelCapicua.show();
                }
            }
            else //Acá se muestra un mensaje de error si el texto ingresado tiene menos de 10 caracteres
            {
                Toast MensajeError;
                MensajeError = Toast.makeText(this, "El texto tiene 10 caracteres o menos, Leo. Ingresá un texto más largo!", Toast.LENGTH_SHORT);
                MensajeError.show();
            }
        }
        else //Esto es por si no se escribe nada
        {
            Toast MensajeError;
            MensajeError = Toast.makeText(this, "Señor tiene que ingresar algo no comprometa al personal por favor", Toast.LENGTH_SHORT);
            MensajeError.show();
        }
    }
}
