
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());
		
		System.out.println(contaDaMarcela.titular);
		
		
		contaDaMarcela.titular.nome = "Marcelinha danadinha";
		
		System.out.println(contaDaMarcela.titular.nome);
	}
}
