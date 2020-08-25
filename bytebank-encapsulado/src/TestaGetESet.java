
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 2098);

		System.out.println("O novo numero é: " + conta.getNumero() + " A agencia é: " + conta.getAgencia());
		
		Cliente Joao = new Cliente();
		conta.deposita(500);
		
		Joao.setNome("João Tadeu");
		conta.setTitular(Joao);
		
		System.out.println("O Cliente se Chama: " + conta.getTitular().getNome());
		conta.getTitular().setProfissao("Analista de Sistemas");
		
		System.out.println("a Profissão do cliente é: " + conta.getTitular().getProfissao());
		
		System.out.println("Seu saldo é: " + conta.getSaldo());
		
		System.out.println();
		
		
		System.out.println(Joao);
		System.out.println(conta.getTitular());
		
	}

}
