import java.util.Scanner;

public class TestaCondicional2 {

	public static void main(String[] args) {
		int idade;
		int quantidadeDePessoas = 3;
		
		Scanner idadeDoUsuario = new Scanner(System.in);
		boolean acompanhado = quantidadeDePessoas >= 2;
		
		System.out.println("Digite sua idade: ");
		idade = idadeDoUsuario.nextInt();
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja Bem Vindo!");
		} else {
				System.out.println("Infelizmente voc� n�o � maior de idade e n�o pode entrar");
			}
			
		}
	}