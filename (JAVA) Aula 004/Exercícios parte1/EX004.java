import java.util.Scanner;

public class EX004 {
	
	public EX004() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Este software exibe o IMC!");
		
		System.out.println("Digite o Peso:");
		double v1 = scan.nextFloat();
		System.out.println("Digite a altura:");
		double v2 = scan.nextFloat();
		
		double r = v1/(v2*v2);
		
		System.out.printf("O resultado é %.3f", r);
		
	}
	
}