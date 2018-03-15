import java.util.Scanner;

public class EX005 {
	public EX005() {
		System.out.println("");
		System.out.println("*--- Iniciando exercício 005 ---*");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo número");
		int num2 = scan.nextInt();
		
		doAll(num1, num2);
		
		System.out.println("*--- ENCERRANDO ---*");
	}
	
	private void doAll(int n1, int n2) {
		
		if (n1 == n2) {
			System.out.println("Os números são iguais.");
		} else {
			System.out.println("Os números não são iguais.");
			int maior = 0;
			int menor = 0;
			if (n1 > n2) {
				maior = n1;
				menor = n2;
			} else {
				maior = n2;
				menor = n1;
			}
			System.out.println("O maior é: " + maior);
			System.out.println("O menor é: " + menor);
		}
		

	}
}