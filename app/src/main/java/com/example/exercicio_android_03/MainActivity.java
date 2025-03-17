package com.example.exercicio_android_03;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        GerenciadorContatos gerenciador = new GerenciadorContatos();

        Contato contato1 = new ContatoPessoal("Ana", "99999-1111", "10/02/1995");
        Contato contato2 = new ContatoProfissional("João", "88888-2222", "UNIT-PE");

        gerenciador.adicionarContato(contato1);
        gerenciador.adicionarContato(contato2);

        Log.i(TAG, "Lista de contatos:");
        gerenciador.listarContatos();
    }
}