package br.usjt.sin.progmulti.clientessi18;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText editText;

    public static final String BUSCA = "br.usjt.sin.progmulti.clientessi18.busca"; //criou a variavel

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.txt_busca); //estanciou
    }

    public void buscarClientes(View view) {

        String texto = editText.getText().toString();
        Intent intent = new Intent(this, ListaClientesActivity.class); //Reflexão
        intent.putExtra(BUSCA, texto);//passar parametros para a proxima Activity
        startActivity(intent);


    }
}
