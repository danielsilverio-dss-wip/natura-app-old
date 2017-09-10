package br.com.fiap.natura.naturaapp.simulacao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.natura.naturaapp.bean.Parceiro;

/**
 * Created by daniel on 09/09/17.
 */

public class ListaParceiros {

    private static List<Parceiro> parceiros;

    public ListaParceiros() {
        criaParceiros();
    }

    private void criaParceiros() {
        parceiros = new ArrayList<Parceiro>();

        for (int i = 0; i < 15; i++){
            parceiros.add(new Parceiro(i, "parceiro " + i));
        }
    }

    public static List<Parceiro> getParceiros() {
        return parceiros;
    }

    public static void setParceiros(List<Parceiro> parceiros) {
        ListaParceiros.parceiros = parceiros;
    }

    public static Parceiro buscaPorId(long id){
        for (Parceiro parceiro : parceiros) {
            if(parceiro.getId() == id){
                return parceiro;
            }
        }
        return null;
    }

}
