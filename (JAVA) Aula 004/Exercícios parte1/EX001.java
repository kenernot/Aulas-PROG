import java.util.Scanner;

public class EX001 {
	
	public EX001() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Este software soma dois números e exibe seu valor!");
		
		System.out.println("Digite o valor do primeiro número:");
		int v1 = scan.nextInt();
		System.out.println("Digite o valor do segundo número:");
		int v2 = scan.nextInt();
		
		int r = v1+v2;
		System.out.printf("O resultado é %d", r);
		
	}
	
}