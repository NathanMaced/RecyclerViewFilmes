package br.com.etecia.recyclerviewfilmes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Filmes> listaFilmes;
    //declarar o RecyclerView
    RecyclerView idRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //apresentando o xml para o java
        idRecyclerView = findViewById(R.id.idListaFilmes);

        //criando a base de dados para carregamento da lista de filmes

        listaFilmes = new ArrayList<>();

        listaFilmes.add(
                new Filmes("Coringa", "O longa-metragem de drama e suspense narra as origens do famoso vilão, em 122 minutos arrepiantes, repletos de reflexões psicológicas e sociais. Passado em Gotham, no começo da década de 80, o enredo conta a história de Arthur Fleck, um homem pobre e com problemas mentais que trabalha como palhaço.", "Suspense", R.drawable.coringa)
        );
        listaFilmes.add(
                new Filmes("Carros", "Filme do carros", "Comedia", R.drawable.carros)
        );
        listaFilmes.add(
                new Filmes("Dragon Ball Z", "Anime do Goku", "Ação", R.drawable.dragonball)
        );
        listaFilmes.add(
                new Filmes("Doutor Estranho", "Filme do Doutor estranho", "Ação", R.drawable.doutorestranho)
        );
        listaFilmes.add(
                new Filmes("Super Onze", "Anime de futebol", "Ação", R.drawable.superonze)
        );
        listaFilmes.add(
                new Filmes("Pokemon", "Anime sobre pokemon", "Ação", R.drawable.pokemon)
        );

        //instanciando a classe adaptadora e passando os parâmetros
        MyAdapter adapter = new MyAdapter(getApplicationContext(), listaFilmes);

        //tipo de layout

        idRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        //fixador do tamanho da lista / deixar a lista mais rapida
        idRecyclerView.setHasFixedSize(true);

        //ligar o recyclerView ao adaptador
        idRecyclerView.setAdapter(adapter);
    }
}