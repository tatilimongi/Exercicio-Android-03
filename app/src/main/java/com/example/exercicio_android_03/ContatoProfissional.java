package com.example.exercicio_android_03;

import android.util.Log;

public class ContatoProfissional extends ContatoBase {
    private String empresa;

    public ContatoProfissional(String nome, String telefone, String empresa) {
        super(nome, telefone);
        this.empresa = empresa;
    }

    @Override
    public void exibirInformacoes() {
        Log.i(TAG, "Contato Profissional: " + nome + ", Tel: " + telefone + ", Empresa: " + empresa);
    }
}

