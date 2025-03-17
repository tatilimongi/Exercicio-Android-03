package com.example.exercicio_android_03;

import android.util.Log;

public abstract class ContatoBase implements Contato {
    protected String nome;
    protected String telefone;
    protected static final String TAG = "Contato";

    public ContatoBase(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public abstract void exibirInformacoes();
}

