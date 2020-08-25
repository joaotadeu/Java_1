public class Conta {

	private double saldo;
	int agencia = 1;
	int numero;
	Cliente titular;

	void deposita(double valor) {
		this.saldo += valor;
		
		System.out.println("O valor depositado foi " + valor);
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;

			System.out.println("O Valor sacado foi: " + valor);

			return true;
		} else {
			System.out.println("Você não tem valor disponivel para saque!");
			return false;
		}

	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);

			System.out.println("o Valor tranferido foi: " + valor);
			return true;
		} else {

			System.out.println("Valor não tranferido");
			return false;
		}
	}
	public double getSaldo() {
		return this.saldo;
	}
}
