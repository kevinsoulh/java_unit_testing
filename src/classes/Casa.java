package classes;

public class Casa {
    private String nome;
    private String animal;
    private Professor diretor = null;
    private Aluno monitor = null;

    public Casa(String nome, String animal){
        this.nome = nome;
        this.animal = animal;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnimal() {
        return animal;
    }
    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public Professor getDiretor() {
        return diretor;
    }
    public void setDiretor(Professor diretor) {
        this.diretor = diretor;
    }

    public Aluno getMonitor() {
        return monitor;
    }
    public void setMonitor(Aluno monitor) {
        this.monitor = monitor;
    }
}
