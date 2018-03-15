import java.util.Scanner;

public class EX006 {
	
	public EX006() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Este software exibe se um número é impar ou par!");
		
		System.out.println("Digite o valor do número:");
		int v1 = scan.nextInt();
		
		String status;
		
		if (v1 % 2 == 0) {
			status = "PAR";
		} else {
			status = "IMPAR";
		}	
		
		System.out.printf("O resultado é %s", status);
		
	}
	
}