
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario joao = new Funcionario();
		joao.setNome("Jo�o Tadeu");
		joao.setCpf("903.997.050-58");
		joao.setSalario(4500.00);
		
		System.out.println("O Nome do funcionario �: " + joao.getNome());
		System.out.println("o CPF do funcionario �: " + joao.getCpf());
		System.out.println("a Bonifica��o do funcionario �: " + joao.getBonificacao());

		
	}
	
}
