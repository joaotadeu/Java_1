package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoJoao = new Conta();
		contaDoJoao.saldo = 600;
		contaDoJoao.deposita(50);

		System.out.println("Seu saldo apos o deposito é: " + contaDoJoao.saldo);
		
		System.out.println();

		contaDoJoao.saca(50);

		System.out.println("O novo valor apos o saque é: " + contaDoJoao.saldo);

		Conta contaDaDani = new Conta();
		contaDaDani.deposita(1000);
		System.out.println();
		boolean sucessoTransferencia = contaDaDani.transfere(300, contaDoJoao);

		if (sucessoTransferencia) {
			System.out.println("Tranferencia realizada");
		} else {
			System.out.println("Tranferencia não realizda");
		}
		System.out.println();
		System.out.println("o Saldo da conta agora é: " + contaDaDani.saldo);
		System.out.println("o Saldo da conta do João é: " + contaDoJoao.saldo);
		
		System.out.println();
		
		contaDoJoao.titular = "João Tadeu";
		System.out.println("Nome do titular da conta: " + contaDoJoao.titular);

	}
}
