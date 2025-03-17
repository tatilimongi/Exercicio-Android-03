package com.example.exercicio_android_03;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorContatos {
    private List<Contato> listaContatos;

    public GerenciadorContatos() {
        this.listaContatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        listaContatos.add(contato);
    }

    public void listarContatos() {
        for (Contato contato : listaContatos) {
            contato.exibirInformacoes();
        }
    }
}
