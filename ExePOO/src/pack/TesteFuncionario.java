package pack;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario = new Funcionario();
		funcionario.nome = "Marcus Vinicius Martins de Faria";
		funcionario.cpf = "12345678900";
		funcionario.salario = 13200.00;
		
		System.out.println(funcionario.aumentarSalario(funcionario, 0.1));
	}

}
