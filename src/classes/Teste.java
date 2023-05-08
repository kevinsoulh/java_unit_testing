package classes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

/*
 * Este  é um arquivo de teste e nao deve ser alterado.
 * Estes testes nao garantem  que a implementacao esteja 100% correta.
 * Alem dos resultados dos testes, tambem sera considerada na avaliacao
 * a aplicacao correta dos conceitos de POO..
 */

public class Teste {

	// Declaracao dos objetos
	static Escola hogwarts;

	static Casa grifinoria;
	static Casa sonserina;
	static Casa corvinal;
	static Casa lufalufa;

	static Disciplina herbologia;
	static Disciplina transfiguracao;
	static Disciplina pocoes;
	static Disciplina defesa;

	static Professor minerva;
	static Professor filio;
	static Professor pomona;
	static Professor severo;

	static Aluno draco;
	static Aluno ernesto;
	static Aluno hermione;
	static Aluno harry;
	static Aluno luna;

	static Torneio torneio;

	
	@Test
	void testeA() {
		// Criacao do objeto Escola
		hogwarts = new Escola("Escola de Magia e Bruxaria de Hogwarts");

		assertEquals(hogwarts.getNome(), "Escola de Magia e Bruxaria de Hogwarts");
		assertEquals(hogwarts.getCasas().size(), 0);
	}

	@Test
	void testeB() {
		// Criacao dos objetos Casa
		grifinoria = new Casa("Grifinoria", "Leao");
		sonserina = new Casa("Sonserina", "Serpente");
		corvinal = new Casa("Corvinal", "Corvo");
		lufalufa = new Casa("Lufa-Lufa", "Texugo");

		assertEquals(grifinoria.getNome(), "Grifinoria");
		assertEquals(grifinoria.getAnimal(), "Leao");
		assertEquals(grifinoria.getDiretor(), null);
		assertEquals(grifinoria.getMonitor(), null);
	}

	@Test
	void testeC() {
		// Criacao dos objetos Disciplina
		herbologia = new Disciplina("Herbologia", "Ervas e Fungos Magicos, Arvores que se Alimentam de Carne");
		transfiguracao = new Disciplina("Transfiguracao", "Transfiguracao Entre Especies, Transfiguracao Humana");
		pocoes = new Disciplina("Pocoes", "Pocoes Simples, Pocoes Avancadas");
		defesa = new Disciplina("Defesa", "Maldicao Cruciatus, Dementadores, Feiticos nao-verbais");

		assertEquals(herbologia.getNome(), "Herbologia");
		assertEquals(herbologia.getEmenta(), "Ervas e Fungos Magicos, Arvores que se Alimentam de Carne");
		assertEquals(herbologia.getAlunos().size(), 0);
	}

	@Test
	void testeD() throws ParseException {
		// Criacao dos objetos Professor
		minerva = new Professor("Minerva McGonagall", "19351004");
		filio = new Professor("Filio Flitwick", "19301017");
		pomona = new Professor("Pomona Sprout", "19410515");
		severo = new Professor("Severo Snape", "19600109");

		assertEquals(minerva.getNome(), "Minerva McGonagall");
		assertEquals(minerva.getNascimento(), "19351004");
		assertEquals(minerva.getDisciplinas().size(), 0);
	}

	@Test
	void testeE() {
		// Criacao dos objetos Aluno
		draco = new Aluno("Draco Malfoy", "19800605", "puro-sangue");
		ernesto = new Aluno("Ernesto Macmillan", "19800901", "puro-sangue");
		hermione = new Aluno("Hermione Granger", "19790919", "trouxa");
		harry = new Aluno("Harry Potter", "19800731", "mestico");
		luna = new Aluno("Luna Lovegood", "19810213", "puro-sangue");

		assertEquals(hermione.getNome(), "Hermione Granger");
		assertEquals(hermione.getNascimento(), "19790919");
		assertEquals(hermione.getTipo(), "trouxa");
		assertEquals(hermione.getCasa(), null);
	}

	@Test
	void testeF() {
		// Criacaoo do objeto Torneio
		torneio = new Torneio(sonserina, grifinoria);		
		assertEquals(torneio.getCasa1().getNome(), "Sonserina");
		assertEquals(torneio.getCasa2().getNome(), "Grifinoria");
	}

	@Test
	void testeG() {
		// Incluir as casas na escola
		hogwarts.incluirCasa(grifinoria);
		hogwarts.incluirCasa(sonserina);
		hogwarts.incluirCasa(corvinal);
		hogwarts.incluirCasa(lufalufa);

		assertEquals(hogwarts.getCasas().get(0).getNome(), "Grifinoria");
		assertEquals(hogwarts.getCasas().get(1).getNome(), "Sonserina");
		assertEquals(hogwarts.getCasas().get(2).getNome(), "Corvinal");
		assertEquals(hogwarts.getCasas().get(3).getNome(), "Lufa-Lufa");
	}

	@Test
	void testeH() {
		// Definicao dos diretores das casas
		grifinoria.setDiretor(minerva);
		sonserina.setDiretor(severo);
		corvinal.setDiretor(filio);
		lufalufa.setDiretor(pomona);

		assertEquals(grifinoria.getDiretor().getNome(), "Minerva McGonagall");
		assertEquals(sonserina.getDiretor().getNome(), "Severo Snape");
		assertEquals(corvinal.getDiretor().getNome(), "Filio Flitwick");
		assertEquals(lufalufa.getDiretor().getNome(), "Pomona Sprout");
	}

	@Test
	void testeI() {
		// Definicao dos monitores das casas
		grifinoria.setMonitor(hermione);
		sonserina.setMonitor(draco);
		corvinal.setMonitor(ernesto);
		lufalufa.setMonitor(luna);

		assertEquals(grifinoria.getMonitor().getNome(), "Hermione Granger");
		assertEquals(sonserina.getMonitor().getNome(), "Draco Malfoy");
		assertEquals(corvinal.getMonitor().getNome(), "Ernesto Macmillan");
		assertEquals(lufalufa.getMonitor().getNome(), "Luna Lovegood");
	}

	@Test
	void testeJ() {
		// Definicao das casas dos alunos
		draco.setCasa(sonserina);
		ernesto.setCasa(corvinal);
		hermione.setCasa(grifinoria);
		harry.setCasa(grifinoria);
		luna.setCasa(lufalufa);

		assertEquals(draco.getCasa().getNome(), "Sonserina");
		assertEquals(ernesto.getCasa().getNome(), "Corvinal");
		assertEquals(hermione.getCasa().getNome(), "Grifinoria");
		assertEquals(harry.getCasa().getNome(), "Grifinoria");
		assertEquals(luna.getCasa().getNome(), "Lufa-Lufa");
	}

	@Test
	void testeK() {
		// Definicao dos professores das disciplinas
		severo.incluirDisciplina(defesa);
		severo.incluirDisciplina(transfiguracao);
		minerva.incluirDisciplina(herbologia);
		filio.incluirDisciplina(transfiguracao);
		pomona.incluirDisciplina(pocoes);

		assertEquals(severo.getDisciplinas().get(0).getNome(), "Defesa");
		assertEquals(severo.getDisciplinas().get(1).getNome(), "Transfiguracao");
		assertEquals(minerva.getDisciplinas().get(0).getNome(), "Herbologia");
		assertEquals(filio.getDisciplinas().get(0).getNome(), "Transfiguracao");
		assertEquals(pomona.getDisciplinas().get(0).getNome(), "Pocoes");
	}

	@Test
	void testeL() {
		// Definicao dos alunos que cursam as disciplinas
		herbologia.incluirAluno(harry);
		herbologia.incluirAluno(hermione);
		transfiguracao.incluirAluno(draco);
		transfiguracao.incluirAluno(hermione);
		pocoes.incluirAluno(ernesto);
		defesa.incluirAluno(harry);
		defesa.incluirAluno(draco);
		defesa.incluirAluno(ernesto);
		defesa.incluirAluno(hermione);
		defesa.incluirAluno(luna);

		assertEquals(herbologia.getAlunos().get(0).getNome(), "Harry Potter");
		assertEquals(herbologia.getAlunos().get(1).getNome(), "Hermione Granger");

		assertEquals(transfiguracao.getAlunos().get(0).getNome(), "Draco Malfoy");
		assertEquals(transfiguracao.getAlunos().get(1).getNome(), "Hermione Granger");

		assertEquals(pocoes.getAlunos().get(0).getNome(), "Ernesto Macmillan");

		assertEquals(defesa.getAlunos().get(0).getNome(), "Harry Potter");
		assertEquals(defesa.getAlunos().get(1).getNome(), "Draco Malfoy");
		assertEquals(defesa.getAlunos().get(2).getNome(), "Ernesto Macmillan");
		assertEquals(defesa.getAlunos().get(3).getNome(), "Hermione Granger");
		assertEquals(defesa.getAlunos().get(4).getNome(), "Luna Lovegood");
	}

	@Test
	void testeM() {
		// Incluir triunfos e mau_feitos
		harry.incluirTriunfos(3);
		harry.incluirMauFeitos(1);
		draco.incluirMauFeitos(2);
		draco.incluirTriunfos(1);
		hermione.incluirTriunfos(4);
		harry.incluirTriunfos(2);
		hermione.incluirTriunfos(1);
		hermione.incluirTriunfos(2);

		assertEquals(harry.getTriunfos(), 5);
		assertEquals(harry.getMauFeitos(), 1);
		assertEquals(draco.getTriunfos(), 1);
		assertEquals(draco.getMauFeitos(), 2);
		assertEquals(hermione.getTriunfos(), 7);
		assertEquals(hermione.getMauFeitos(), 0);
	}

	@Test
	void testeN() {
		// Marcar pontos do torneio de Quadribol
		torneio.marcarPonto(sonserina, 2);
		torneio.marcarPonto(grifinoria, 1);
		torneio.marcarPonto(sonserina, 1);
		torneio.marcarPonto(grifinoria, 3);

		assertEquals(torneio.getPontosCasa1(), 3);
		assertEquals(torneio.getPontosCasa2(), 4);

		torneio.marcarPonto(sonserina, 0);
		torneio.marcarPonto(grifinoria, 2);

		assertEquals(torneio.getPontosCasa1(), 3);
		assertEquals(torneio.getPontosCasa2(), 6);
	}
}
