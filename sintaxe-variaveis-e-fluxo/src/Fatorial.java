
public class Fatorial {

	public static void main(String[] args) {
		
		//Nesse exerc�cio opcional, o seu desafio � imprimir os fatoriais de 1 a 10!
		
		int fatorial = 1;
		for(int i = 1; i < 11; i++) {
			fatorial *= i;
			System.out.println("Fatorial de: " + i + fatorial);
		}
	}
}
