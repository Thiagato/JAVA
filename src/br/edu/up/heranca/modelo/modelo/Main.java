package br.edu.up.heranca.modelo.modelo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Dodge", "Ram");
        System.out.println(veiculo);


        Carro meuCarro = new Carro("Dogde", "Ram", "porta");
        System.out.println(meuCarro);

        Veiculo carro = new Carro("fiat", "uno","23");
        System.out.println(carro);

        List<Veiculo> lista = new ArrayList<>();
        lista.add(new Carro("fiat1","uno1", "3"));
        lista.add(new Carro("fiat2","uno2", "31"));
        lista.add(new Carro("fiat3","uno3", "32"));
        lista.add(new Carro("fiat4","uno4", "33"));
        lista.add(new Carro("fiat5","uno5", "34"));
        lista.add(new Carro("fiat6","uno6", "35"));

        for (Veiculo v : lista) {
            System.out.println(v);
        }





    }
}
