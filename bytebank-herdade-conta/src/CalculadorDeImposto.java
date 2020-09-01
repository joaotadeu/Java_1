
public class CalculadorDeImposto {
	
	private double TotalImposto;

	public void registra (Tributavel t) {
		double valor = t.gerValorImposto();
		this.TotalImposto += valor;
	}
	
	public double getTotalImposto() {
		return TotalImposto;
	}
}
