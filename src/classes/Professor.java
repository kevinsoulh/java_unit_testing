package classes;

import java.text.ParseException;
import java.util.ArrayList;

import java.util.Date;

public class Professor extends Pessoa {
    private ArrayList<Disciplina> disciplinas;

    public Professor(String nome, String nascimento) {
        super(nome, nascimento);
        this.disciplinas = new ArrayList<Disciplina>();
    }

    public void incluirDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
