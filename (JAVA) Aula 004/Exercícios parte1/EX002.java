import java.util.Scanner;

public class EX002 {
	
	public EX002() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Este software soma quatro números e exibe a média!");
		
		System.out.println("Digite o valor do primeiro número:");
		int v1 = scan.nextInt();
		System.out.println("Digite o valor do segundo número:");
		int v2 = scan.nextInt();
		System.out.println("Digite o valor do terceiro número:");
		int v3 = scan.nextInt();
		System.out.println("Digite o valor do quarto número:");
		int v4 = scan.nextInt();
		
		double r = (v1+v2+v3+v4)/4;
		System.out.printf("O resultado é %f", r);
		
	}
	
}