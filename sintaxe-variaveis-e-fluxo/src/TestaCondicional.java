import java.util.Scanner;

public class TestaCondicional {

	public static void main(String[] args) {
		int idade = 17;
		int quantidadePessoas = 3;
		Scanner idadeDoUsuario = new Scanner(System.in);
		Scanner quantidaPessoas = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade = idadeDoUsuario.nextInt();
		
		System.out.printf("Sua idade é " + idade + "\n");

		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja Bem Vindo!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Digite a Quantidade de pessoas: ");
				quantidadePessoas = quantidaPessoas.nextInt();
				System.out.println("Você não tem 18, mas pode entrar pois está acompanhado");
			} else {
				System.out.println("Infelizmente você não é maior de idade");
			}
			
		}
	}
}
