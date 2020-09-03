public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	public Conta(int agencia, int numero) {
//		Conta.total++;
		
//		System.out.println("o Total de Contas é: " + Conta.total);
		
		this.agencia = agencia;
		this.numero = numero;
		
		if(this.agencia <= 0) {
			System.out.println("Não pode numero de agencia negativo");
		} else if (this.numero <= 0) {
			System.out.println("Não pode Numero de conta negativo");
		}
		
	}

	void deposita(double valor) {
		this.saldo += valor;
		
		System.out.println("O valor depositado foi " + valor);
	}

	public void saca(double valor) throws SaldoInsuficienteException {
		
		if (this.saldo < valor){
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
			
		}
			System.out.println("O Valor sacado foi: " + valor);

	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
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
