import java.util.Scanner;

public class EX003 {
	public EX003() {
		System.out.println("");
		System.out.println("*--- Iniciando exercício 003 ---*");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número");
		int nDigitado = scan.nextInt();
		doDecrescente(nDigitado);
		System.out.println("*--- ENCERRANDO ---*");
	}
	
	private void doDecrescente(int nInicial) {
		for (int i = nInicial; i > -1; i--) {
			System.out.println("N: "+ i);
		}
	}
}