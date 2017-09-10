package br.com.fiap.natura.naturaapp.simulacao;


import java.util.ArrayList;
import java.util.List;

import br.com.fiap.natura.naturaapp.bean.Produto;
import br.com.fiap.natura.naturaapp.bean.Projeto;

/**
 * Created by daniel on 08/09/17.
 */

public class ListaProjetos {

    private static List<Projeto> projetos;

    public ListaProjetos() {
        criaProjetos(); // cria uma lista fictícia de projetos ao chamar o contrutor
    }

    public static List<Projeto> getProjetos() {
        return projetos;
    }

    public static void setProjetos(List<Projeto> projetos) {
        ListaProjetos.projetos = projetos;
    }

    public static Projeto buscaPorId(long id){

        if(projetos == null){
            criaProjetos();
        }

        Projeto p = new Projeto();
        for (Projeto projeto : projetos) {
            if(projeto.getId() == id){
                return projeto;
            }
            p = projeto;
        }
        return p;
    }

    private static void criaProjetos(){
        projetos = new ArrayList<Projeto>();

        //projetos.add(new Projeto(0, "Crianças da Música", "descricao", "@drawable/projeto_criancas_musica.jpg" ));

        for (int i = 0; i < 15; i++){
            projetos.add(new Projeto(i, "projeto " + i, "descricao", "@drawable/projeto_criancas_musica.jpg"));
        }
    }
}
