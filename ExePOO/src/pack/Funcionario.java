package pack;

public class Funcionario {

String cpf;

String nome;

double salario;

public Funcionario() {
	
}

public String getCpf() {

return cpf;

}

public void setCpf(String cpf) {

this.cpf = cpf;

}

public String getNome() {

	return nome;

}

public void setNome(String nome) {

	this.nome = nome;

}

public double getSalario() {

	return salario;

}

public void setSalario(double salario) {

	this.salario = salario;

}

public int obterQuantidadeDeLetrasNome(Funcionario funcionario) {

	funcionario.nome = nome.replaceAll(" ", "");

	return nome.length();

}

public String obterNomeAbreviado(Funcionario funcionario) {

	String [] nomeAbreviado = funcionario.nome.trim().split(" ");

	int n = nomeAbreviado.length;

	return nomeAbreviado[0] + " " + nomeAbreviado[n-1];

}

public String obterIniciais(Funcionario funcionario) {

	String iniciais = "";

	for (char letra : funcionario.nome.toCharArray()) {

		if(Character.isUpperCase(letra)) {

			iniciais = iniciais + letra;

		}

	}

	return iniciais;

}

public boolean verificarCPF(Funcionario funcionario) {

	boolean valida = funcionario.cpf.matches("\\d\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d\\d");

	return valida;

}

public String formatarCPF(Funcionario funcionario) {

	if (funcionario.cpf.length() != 11) {

		return "CPF inválido";

	} else {

		return funcionario.cpf.substring(0, 3)+"."+funcionario.cpf.substring(3, 6)+"."+funcionario.cpf.substring(6, 9)+"-"+funcionario.cpf.substring(9, 11);

	}

}

public int obterNumeroSalariosMinimos(Funcionario funcionario) {
	// obter número de salários mínimos arredondando para cima
	double nsm = funcionario.salario/1320;

	double numArredondado = Math.ceil(nsm);

	return (int)numArredondado;

}

public double aumentarSalario(Funcionario funcionario, double percentual) {

	setSalario(funcionario.salario + (funcionario.salario*percentual));

	return funcionario.salario;

}

}
