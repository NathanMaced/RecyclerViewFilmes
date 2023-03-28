package br.com.etecia.recyclerviewfilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.appbar.MaterialToolbar;

public class ApresentaFIlmeActivity extends AppCompatActivity {

    TextView mTitulo, mCategoria, mDescricao;

    ImageView mImagem;

    MaterialToolbar toolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apresenta_filme_layout);

        mTitulo = findViewById(R.id.mTituloFilme);
        mCategoria = findViewById(R.id.mCategoria);
        mDescricao = findViewById(R.id.mDescricaoFilme);
        mImagem = findViewById(R.id.mImagemFilme);
        toolBar = findViewById(R.id.toolBar);

        //clique do botão toolbar

        toolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        Intent intent = getIntent();
        String titulo, descricao, categoria;
        int imagemFilme;

        titulo = intent.getExtras().getString("Titulo");
        descricao = intent.getExtras().getString("Descricao");
        categoria = intent.getExtras().getString("Categoria");

        imagemFilme = intent.getExtras().getInt("ImagemFilme");
    }
}