// a Classe Gerente herda da classe Funcionario
public class Gerente extends Funcionario {

	private int senha;

	public boolean autentica (int senha) {
		if (this.senha == senha) {
			System.out.println("Login efetuado com sucesso!");
			return true;
		} else {
			System.out.println("Login n�o efetuado, verificar a senha");
			return false;
		}
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
 
	public double getBonificacao() {
		System.out.println("Bonifica��o Gerente");
		return super.getBonificacao() + super.getSalario();
		
	}
	
	
}

