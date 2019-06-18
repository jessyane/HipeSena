package models;

import java.util.List;

import senac.hipesena.Jogadas;

public class Sorte {
    private int jogadas;
    private int casas;
    private List<Aposta> apostas;

    public Sorte(int jogadas, int casas) {

        this.jogadas = jogadas;
        this.casas = casas;

    }
    public void gerarApostas() throws Exception {
        if (!validarjogadas()) {
            throw new Exception("Escolha de 1 a 100 jogadas");

        } else if (!validarcasas()) {
            throw new Exception("Escolha entre 6 a 15");

        }


    }
    private boolean validarcasas() {
        if (jogadas < 1 || jogadas > 100 );
        return false;
    }

    private boolean validarjogadas() {

        return false;
    }


}
