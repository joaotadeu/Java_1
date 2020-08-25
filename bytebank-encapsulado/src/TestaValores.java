
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(2098, 1043816);
		System.out.println("a Sua Agencia é: " + conta.getAgencia() + " e Sua conta é: " + conta.getNumero());
		System.out.println();
		
		Conta conta2 = new Conta(2099, 1043817);
		System.out.println("a Sua Agencia é: " + conta.getAgencia() + " e Sua conta é: " + conta.getNumero());
		System.out.println();
		
		Conta conta3 = new Conta(2100, 1043818);
		System.out.println("a Sua Agencia é: " + conta.getAgencia() + " e Sua conta é: " + conta.getNumero());
		System.out.println();
		
		System.out.println("O Numero de contas criadas é: " + Conta.getTotal());
		
//		conta.setAgencia (-50);
//		conta.setNumero (-330);
	
	}
}
