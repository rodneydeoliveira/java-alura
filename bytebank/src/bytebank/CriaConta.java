package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.saldo = 200;
		System.out.println(conta1.saldo);
		
		Conta conta2 = new Conta();
		conta2.saldo = 50;
		System.out.println(conta2.saldo);
	}
}
