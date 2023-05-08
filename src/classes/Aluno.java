package classes;

import java.text.ParseException;
import java.util.Date;
public class Aluno extends Pessoa {
    private String tipo;
    private Casa casa = null;
    private int triunfos = 0;
    private int mauFeitos = 0;

    public Aluno(String nome, String nascimento, String tipo) {
        super(nome, nascimento);
        this.tipo = tipo;
    }

    public void incluirTriunfos(int pontos) {
        this.triunfos += pontos;
    }

    public void incluirMauFeitos(int pontos) {
        this.mauFeitos += pontos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public int getTriunfos() {
        return triunfos;
    }

    public void setTriunfos(int triunfos) {
        this.triunfos = triunfos;
    }

    public int getMauFeitos() {
        return mauFeitos;
    }

    public void setMauFeitos(int mauFeitos) {
        this.mauFeitos = mauFeitos;
    }
}

