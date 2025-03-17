package com.example.exercicio_android_03;

import android.util.Log;

public class ContatoPessoal extends ContatoBase {
    private String aniversario;

    public ContatoPessoal(String nome, String telefone, String aniversario) {
        super(nome, telefone);
        this.aniversario = aniversario;
    }

    @Override
    public void exibirInformacoes() {
        Log.i(TAG, "Contato Pessoal: " + nome + ", Tel: " + telefone + ", Aniversário: " + aniversario);
    }
}


