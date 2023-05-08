package classes;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String ementa;
    private ArrayList<Aluno> alunos;

    public Disciplina(String nome, String ementa) {
        this.nome = nome;
        this.ementa = ementa;
        this.alunos = new ArrayList<Aluno>();
    }

    public void incluirAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
}
