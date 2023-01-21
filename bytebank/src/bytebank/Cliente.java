package bytebank;

public class Cliente {
	public static void main(String[] args) {
		Maquininha maquininha = new Maquininha();
		String cor = maquininha.cor = "vermelho";
		String tamanho = maquininha.tamanho = "grande";
		int valor = maquininha.Transacao(14);
		System.out.println("A cor desta maquininha é: " + cor +
				"\nO tamanho dessa maquininha é: " + tamanho +
				"\nO valor restante na conta é de: " + valor);
	}

}
