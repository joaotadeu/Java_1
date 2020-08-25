public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		
		System.out.println("o Total de Contas é: " + Conta.total);
		
		this.agencia = agencia;
		this.numero = numero;
		
		if(this.agencia <= 0) {
			System.out.println("Não pode numero de agencia negativo");
		} else if (this.numero <= 0) {
			System.out.println("Não pode Numero de conta negativo");
		}
		
//		System.out.println("O numero da agencia é: " + this.agencia + " e o Numero da Conta é: " + this.numero);
	}

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
	
	public int getNumero() {
		return this.numero;
		
	}
	
	public void setNumero(int NumeroNovo) {
		
		if(NumeroNovo <=0) {
			System.out.println("Não pode Valor Negativo");
			return;
		}
		
		this.numero = NumeroNovo;
		
	}
	
	public int getAgencia() {
		return this.agencia;
		
	}
	
	public void setAgencia(int agencia) {
		
		if (agencia <=0) {
			System.out.println("Não pode valor negativo");
			return;
		}
		
		this.agencia = agencia;
		
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
		
	}
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}	
}
