
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 2098);

		System.out.println("O novo numero �: " + conta.getNumero() + " A agencia �: " + conta.getAgencia());
		
		Cliente Joao = new Cliente();
		conta.deposita(500);
		
		Joao.setNome("Jo�o Tadeu");
		conta.setTitular(Joao);
		
		System.out.println("O Cliente se Chama: " + conta.getTitular().getNome());
		conta.getTitular().setProfissao("Analista de Sistemas");
		
		System.out.println("a Profiss�o do cliente �: " + conta.getTitular().getProfissao());
		
		System.out.println("Seu saldo �: " + conta.getSaldo());
		
		System.out.println();
		
		
		System.out.println(Joao);
		System.out.println(conta.getTitular());
		
	}

}
