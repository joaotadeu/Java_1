
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario joao = new Funcionario();
		joao.setNome("João Tadeu");
		joao.setCpf("903.997.050-58");
		joao.setSalario(4500.00);
		
		System.out.println("O Nome do funcionario é: " + joao.getNome());
		System.out.println("o CPF do funcionario é: " + joao.getCpf());
		System.out.println("a Bonificação do funcionario é: " + joao.getBonificacao());

		
	}
	
}
