package br.com.etecia.listafilmes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listafilmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listafilmes = findViewById(R.id.idlistafilmes);
        //preparar para instanciar o adaptador
        listafilmes.setAdapter(Adaptador);


    }
}