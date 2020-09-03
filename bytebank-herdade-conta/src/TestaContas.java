
public class TestaContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaCorrente cc = new ContaCorrente(2091, 2142765-1);
		cc.deposita(100.0);
		System.out.println("o Saldo da Conta corrente é: " + cc.getSaldo());
		System.out.println();
		
		ContaPoupanca cp = new ContaPoupanca(2091,2142722-1);
		cp.deposita(200.0);
		System.out.println("o Saldo da Conta poupança é: " + cp.getSaldo());
		System.out.println();
		
		cc.transfere(10.0, cp);
		System.out.println("o Saldo da Conta corrente é: " + cc.getSaldo() + " e o saldo da Conta poupança é: " + cp.getSaldo());
		System.out.println();
		
		cc.saca(50);
		System.out.println("O novo saldo da Conta corrente apos o Saque é: " + cc.getSaldo() + " e o saldo da Conta poupança é: " + cp.getSaldo());

	}

}
