package zion.costa.trabajopractico1;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Punto4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.punto_4);
    }

    public void Punto4(View view)
    {
        TextView TextoIngresado;
        TextoIngresado = (EditText)findViewById(R.id.Punto4Texto1);
        String TextoString;
        TextoString = TextoIngresado.getText().toString();
        TextoString.trim(); //Elimina los bordes exteriores
        String[] PalabrasDelTexto;
        PalabrasDelTexto = TextoString.split(" "); //Divide las palabras del texto buscando por espacios
        if (PalabrasDelTexto.length != 0) //Valida que se haya escrito algo
        {
            if (PalabrasDelTexto.length >= 2) //Valida que haya dos o más palabras
            {
                String UltimaPalabra;
                UltimaPalabra = TextoString.substring(TextoString.lastIndexOf(" ") + 1); //Declara cuál es la última palabra del texto
                Toast MensajeAMostrar;
                MensajeAMostrar = Toast.makeText(this, "La última palabra del texto es '" + UltimaPalabra + "'", Toast.LENGTH_SHORT);
                MensajeAMostrar.show(); //La muestra
            }
            else
            {
                Toast MensajeAMostrar;
                MensajeAMostrar = Toast.makeText(this, "La frase debe tener dos palabras o más.", Toast.LENGTH_SHORT);
                MensajeAMostrar.show();
            }
        }
        else
        {
            Toast MensajeError;
            MensajeError = Toast.makeText(this, "Señor LeoLob esto no funciona si no ingresa texto", Toast.LENGTH_SHORT);
            MensajeError.show();

        }

    }
}
