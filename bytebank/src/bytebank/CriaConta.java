package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		primeiraConta.saldo += 100;	
		
		System.out.println("a Primeira conta est� na agencia: " + primeiraConta.agencia );
		System.out.println("a Primeira conta tem: " + primeiraConta.saldo + " Reais");
		
		System.out.println("");
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		segundaConta.agencia += 1;
		
		System.out.println("a Segunda conta tem: " + segundaConta.saldo + " Reais");
		System.out.println("a Segunda conta est� na agencia: " + segundaConta.agencia );
		
		System.out.println("");
		
		Conta terceiraConta = new Conta();
		terceiraConta.saldo = 250;
		terceiraConta.agencia +=1;
				
		System.out.println("a terceira conta tem: " + terceiraConta.saldo + " Reais");
		System.out.println("a terceira conta est� na agencia " + terceiraConta.agencia);
		
	}

}
