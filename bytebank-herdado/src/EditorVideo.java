// a Classe EditorVideo herda da classe Funcionario
public class EditorVideo extends Funcionario {
 
	public double getBonificacao() {
		System.out.println("Bonifica��o Editor de Video");
		return super.getBonificacao() + 100;
		
		
	}
	
	
}

