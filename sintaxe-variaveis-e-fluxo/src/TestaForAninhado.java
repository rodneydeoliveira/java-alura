
public class TestaForAninhado {
	
	public static void main(String[] args) {
		
		for(int multiplicador = 1; multiplicador <=10; multiplicador++) {
			for  (int contador = 0; contador <=10; contador++) {
				int total = multiplicador * contador;
				System.out.println(multiplicador + " x " + contador + " = " + total);
				System.out.print("");
			}
			System.out.println("");
		}
	}
}
