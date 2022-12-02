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
    String descricao[] =
            {"Os paleontólogos Alan Grant, Ellie Sattler e o matemático Ian Malcolm fazem parte de um seleto grupo escolhido para visitar uma ilha habitada por dinossauros criados a partir de DNA pré-histórico.",
                    "Frank, um pervertido sexual, compra um cubo mágico e abre a porta de uma dimensão cheia de dor e tortura. Quando uma antiga amante se muda para sua casa, ele tenta convencê-la a ajudá-lo a voltar ao mundo dos vivos.",
                    "Os satélites do bilionário Charles Bishop Weyland detectam uma pirâmide enterrada sob o gelo antártico e ele monta uma equipe de cientistas, arqueólogos e engenheiros para explorá-la.",
                    "Este prelúdio do filme Alien conta a história de uma equipe de cientistas que embarca em uma jornada espacial para descobrir a verdade sobre a origem da raça humana.",
                    "Um terrível ataque a banhistas é o sinal de que a praia da pequena cidade de Amity, na Nova Inglaterra, virou refeitório de um gigantesco tubarão branco.",
                    "Indiana Jones tem como missão resgatar uma pedra roubada por um cruel feiticeiro na Índia. Ele descobre uma mina onde crianças são escravizadas e se depara com cultos de sacrifício humano nas catacumbas de um antigo palácio."};
    String acesso[] = {"4.5", "2.5", "4.0", "4.0", "5.0", "4.5"};
    int filmes[] = {R.drawable.Jurassic_Park_poster, R.drawable.Hellraiser_1987, R.drawable.Alien_Vs_Predator, R.drawable.prometheus, R.drawable.tubarao, R.drawable.indiana_jones};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listafilmes = findViewById(R.id.idlistafilmes);

        MyAdapter adapter = new MyAdapter();

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