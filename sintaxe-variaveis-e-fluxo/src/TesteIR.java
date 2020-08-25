import java.util.Scanner;

public class TesteIR {
	public static void main(String[] args) {

		double salarioBase = 1903.98;
		// De 1900.0 até 2800.0 o IR é de 7.5% e pode deduzir R$ 142
		// De 2800.01 até 3751.0 o IR é de 15% e pode deduzir R$ 350
		// De 3751.01 até 4664.00 o IR é de 22.5% e pode deduzir R$ 636

		Scanner seuSalario = new Scanner(System.in);

		System.out.println("Digite seu salario: ");
		salarioBase = seuSalario.nextInt();

		if (salarioBase <= 1903.98) {
			System.out.println("Você está isento do Importo de Renda");
		} else if (salarioBase >= 1903.98 && salarioBase <= 2800.0) {
			System.out.println("A sua aliquota é de 7% e Você pode deduzir até R$ 142");
		} else if (salarioBase >= 2800.01 && salarioBase <= 3751.0) {
			System.out.println("A sua aliquota é de 15% e Você podede duzir até R$ 350");
		} else if (salarioBase >= 3751.01 && salarioBase <= 4664.00) {
			System.out.println("A sua aliquota é de 22.5% e Você podededuzir até R$ 636");
		}

	}
}