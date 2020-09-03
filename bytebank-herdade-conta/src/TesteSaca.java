
public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200.0);
		try {
			conta.saca(300.0);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Ex: "+ ex.getMessage());
		}

		System.out.println("o Saldo apos o saque foi: " + conta.getSaldo());
	}

}
