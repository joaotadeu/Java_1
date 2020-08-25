
public class TestaBanco {

	public static void main(String[] args) {
		Cliente Tadeu = new Cliente();
		
		Tadeu.nome = "João Tadeu";
		Tadeu.cpf = "474.020.871-74";
		Tadeu.profissao = "Analista de Sistemas";
		
		Conta contaDoTadeu = new Conta();
		contaDoTadeu.deposita(600);
		
		contaDoTadeu.titular = Tadeu;
		
		System.out.println(contaDoTadeu.titular.nome);
		
		//System.out.println("o Saldo do " + Tadeu.nome + " é " + contaDoTadeu.saldo);
	}
}
	