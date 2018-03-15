import java.util.Scanner;

public class EX005 {
	
	public EX005() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Este software exibe se está reprovado ou não baseado na sua média!");
		
		System.out.println("Digite o valor da primeiro nota:");
		double v1 = scan.nextFloat();
		System.out.println("Digite o valor da segunda nota:");
		double v2 = scan.nextFloat();
		System.out.println("Digite o valor da terceira nota:");
		double v3 = scan.nextFloat();
		System.out.println("Digite o valor da quarta nota:");
		double v4 = scan.nextFloat();
		System.out.println("Digite o valor de corte:");
		double v5 = scan.nextFloat();
		
		double r = (v1+v2+v3+v4)/4;
		
		String status;
		
		if (r >= v5) {
			status = "APROVADO";
		} else {
			status = "REPROVADO";
		}
		
		System.out.printf("O resultado é %.3f, logo está %s", r, status);
		
	}
	
}