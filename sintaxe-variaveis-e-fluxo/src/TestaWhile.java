
public class TestaWhile {
	
	public static void main(String[] args) {
		int contador = 0;
		int acumulador = 0;
		
		while (contador <= 10) {
			System.out.println("Contador = " + contador);
			System.out.println("Acumulador = " + acumulador);
			acumulador += contador;
			contador ++;
			
		}
		System.out.println();
		System.out.println("O valor total do acumulador é " + acumulador);
	}
	
}
