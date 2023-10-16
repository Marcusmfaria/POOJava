package CrudAluno;


public class Aluno {
	private String nome;
	private String email;
	private int idade;
	
	public Aluno(String nome, String email, int idade) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Aluno nome=" + nome + ", email=" + email + ", idade=" + idade;
	}
		
}
