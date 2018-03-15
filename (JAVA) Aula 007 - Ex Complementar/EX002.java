import java.util.Scanner;

public class EX002 {
	public EX002() {
		System.out.println("*--- Iniciando exercício 002 ---*");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int n1 = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		int n2 = scan.nextInt();
		System.out.println("O maior número é: "+ getMaior(n1,n2));
		
		System.out.println("*--- ENCERRANDO ---*");
	}
	
	private int getMaior(int num1, int num2) {
		int maior;
		if (num1 > num2) {
			maior = num1;
		} else {
			maior = num2;
		}
		return maior;
	}
}