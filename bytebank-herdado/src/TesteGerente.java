
public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Daniele Nascimento");
		g1.setCpf("929.413.673-65");
		g1.setSalario(9000.00);
		
		System.out.println("o Nome do funcionario �: " + g1.getNome() + " e seu CPF �: " + g1.getCpf() + " e o Salario �: " + g1.getSalario());
		System.out.println();
		
		g1.setSenha(171819);
		boolean autenticou = g1.autentica(171819);
		System.out.println(autenticou);
		System.out.println();
		
		System.out.println("o Nome do Funcionario �: " + g1.getNome() + " e a Bonifica��o �: " + g1.getBonificacao());
		
	}

}
