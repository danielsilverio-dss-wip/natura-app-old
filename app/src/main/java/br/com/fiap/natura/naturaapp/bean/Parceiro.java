package br.com.fiap.natura.naturaapp.bean;

/**
 * Created by daniel on 09/09/17.
 */

public class Parceiro {

    private long id;
    private String nome;

    public Parceiro() {}

    public Parceiro(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
