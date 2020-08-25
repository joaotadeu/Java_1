// a Classe EditorVideo herda da classe Funcionario
public class EditorVideo extends Funcionario {
 
	public double getBonificacao() {
		System.out.println("Bonificação Editor de Video");
		return super.getBonificacao() + 100;
		
		
	}
	
	
}

