
public class TesteReferencias {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setNome("João Tadeu");
		g.setSalario(5000);
		
		System.out.println("o Nome do Funcionario é: " + g.getNome() + " e o Salario é: " + g.getSalario());
		System.out.println();

		Funcionario f = new Funcionario();
		f.setSalario(2500.0);
		f.setNome("Daniele Nascimento");
			
		EditorVideo ev = new EditorVideo();
		f.setSalario(2000.0);
		
		Designer d = new Designer();
		f.setSalario(2500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(f);
		controle.registra(g);
		controle.registra(ev);
		controle.registra(d);
	
		System.out.println("a Soma é: " + controle.getSoma());

	}

}
