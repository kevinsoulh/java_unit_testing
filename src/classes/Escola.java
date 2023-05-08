package classes;

import java.util.ArrayList;

public class Escola {
    private String nome;
    private ArrayList<Casa> casas;

    public Escola(String nome) {
        this.nome = nome;
        this.casas = new ArrayList<Casa>();
    }

    public void incluirCasa(Casa casa) {
        this.casas.add(casa);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Casa> getCasas() {
        return casas;
    }
    public void setCasas(ArrayList<Casa> casas) {
        this.casas = casas;
    }
}
