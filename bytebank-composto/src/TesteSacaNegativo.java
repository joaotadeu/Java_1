
public class TesteSacaNegativo {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.deposita(200);
		conta.saca(10);
		
		System.out.println("O saldo da conta é: " + conta.getSaldo() + " Reais");
		
		
	}
}
