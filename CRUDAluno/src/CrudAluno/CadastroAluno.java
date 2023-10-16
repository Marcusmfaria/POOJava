package CrudAluno;

import java.util.ArrayList;

public class CadastroAluno {
	private ArrayList<Aluno> alunos;
	
	public CadastroAluno() {
		this.alunos = new ArrayList<>();
	}	

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public void inserirAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public void imprimirLista(CadastroAluno alunos){
		for (Aluno aluno : alunos.getAlunos()) {
			System.out.println(aluno.toString());
		}
		
	}
	
	public Aluno pesquisarAluno(CadastroAluno alunos, String nome) {
		for (Aluno aluno : alunos.getAlunos()) {
			if (aluno.getNome().equals(nome)) {
				return aluno;
			}
		}
		return null;
	}
	
	public void removerAluno(Aluno aluno) {
		this.alunos.remove(aluno);
	}
	
	public void alterarAluno(Aluno aluno, String nome, String email, int idade) {
		if (alunos.contains(aluno)) {
			aluno.setNome(nome);
			aluno.setEmail(email);
			aluno.setIdade(idade);
		}
	}
	
}
