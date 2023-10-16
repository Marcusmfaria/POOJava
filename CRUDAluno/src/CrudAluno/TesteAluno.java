package CrudAluno;

import java.util.ArrayList;

public class TesteAluno {

	public static void main(String[] args) {
		
		CadastroAluno turma1 = new CadastroAluno();
		Aluno aluno1 = new Aluno("marcus", "marcus@email.com", 16);		
		turma1.inserirAluno(aluno1);		
		Aluno aluno2 = new Aluno("gabriel mentirinha", "gabriel@email.com", 36);		
		turma1.inserirAluno(aluno2);		
		Aluno aluno3 = new Aluno("João do Java", "joão@email.com", 26);		
		turma1.inserirAluno(aluno3);		
		
		turma1.imprimirLista(turma1);
		System.out.println("mudando...");
		
		turma1.alterarAluno(aluno1, "marcus", "marcus@email.com", 20);
		
		turma1.imprimirLista(turma1);
	}

}
