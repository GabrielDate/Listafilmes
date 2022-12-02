package br.com.etecia.listafilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView listafilmes;

    //criar a base de dados para os filmes

    String titulo[] = {"Jurassic Park - Parque dos Dinossauros", "Hellraiser - Renascido do Inferno", "Alien vs. Predador", "Prometheus", "Tubarão", "Idiana Jones"};
    String descricao[] = {getString(R.string.jussaric),
            getString(R.string.hellraiser),
            getString(R.string.alienvspredador),
            getString(R.string.prometheus),
            getString(R.string.tubarao),
            getString(R.string.indiana)};
    String acesso[] = {"4.5", "2.5", "4.0", "4.0", "5.0", "4.5"};
    int filmes[] = {R.drawable.Jurassic_Park_poster, R.drawable.Hellraiser_1987, R.drawable.Alien_Vs_Predator, R.drawable.prometheus, R.drawable.tubarao, R.drawable.indiana_jones)
};

@Override
protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listafilmes=findViewById(R.id.idlistafilmes);

        MyAdapter adapter=new MyAdapter();

        //preparar para instanciar o adaptador

        listafilmes.setAdapter(adapter);

        }

//criando uma inner class MyAdapter
public class MyAdapter extends BaseAdapter {

    @Override
    public int getCount() {

        return filmes.length;
    }


    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageFilme;
        TextView titulofilme, descricaoFilme, acessoFilme;

        //Adaptador ligando ao modelo
        View v = getLayoutInflater().inflate(R.layout.modelo_filmes, null);

        //Aprensentar as variaveis do java para o modelo xml
        imageFilme = v.findViewById(R.id.idimgfilme);
        titulofilme = v.findViewById(R.id.idtxttitulo);
        descricaoFilme = v.findViewById(R.id.idtxtDescricao);
        acessoFilme = v.findViewById(R.id.idAcessoFilme);

        //Inserindo os valores nas variaveis do java
        titulofilme.setText(titulo[i]);
        descricaoFilme.setText(descricao[i]);
        acessoFilme.setText(acesso[i]);
        imageFilme.setImageResource(filmes[i]);

        return v;
    }
}
}