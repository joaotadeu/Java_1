import java.util.Scanner;

public class TestaEscopo {

	public static void main(String[] args) {
		
		int idade = 20;
		int quantidadeDePessoas = 3;
		Scanner idadeDoUsuario = new Scanner(System.in);
//		boolean acompanhado = quantidadeDePessoas >= 2;
		boolean acompanhado;
		
		if(quantidadeDePessoas >=2) {
			 acompanhado = true;
		} else {
			 acompanhado = false;
		}
		
//		System.out.println("Digite sua idade: ");
//		idade = idadeDoUsuario.nextInt();
		
		System.out.println("Valor Acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja Bem Vindo!");
		} else {
				System.out.println("Infelizmente você não é maior de idade e não pode entrar");
			}
			
		}
	}