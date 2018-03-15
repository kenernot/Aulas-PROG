import java.util.Scanner;

public class EX003 {
	
	public EX003() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Este software exibe o produto de três números!");
		
		System.out.println("Digite o valor do primeiro número:");
		int v1 = scan.nextInt();
		System.out.println("Digite o valor do segundo número:");
		int v2 = scan.nextInt();
		System.out.println("Digite o valor do terceiro número:");
		int v3 = scan.nextInt();
		
		int r = (v1*v2)*v3;
		
		System.out.printf("O resultado é %d", r);
		
	}
	
}