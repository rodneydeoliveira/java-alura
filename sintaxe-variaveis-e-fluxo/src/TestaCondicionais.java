import java.util.Scanner;

public class TestaCondicionais {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();

		System.out.println("Digite o número de pessoas: ");
		int quantidadePessoas = entrada.nextInt();

		if (idade >= 18) {
			System.out.println("Você pode entrar!");
		} else if (quantidadePessoas > 2) {
			System.out.println("Pode entrar porque está acompanhado!");
		} else {
			System.out.println("Pode não entrar!");
		}
		entrada.close();

	}
}
