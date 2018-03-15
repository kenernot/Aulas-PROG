import java.util.Scanner;

public class EX012 {
	
	public EX012() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Este software exibe os números no intervalo dentre os números passados");
		
		System.out.println("Digite o valor do início:");
		int v1 = scan.nextInt();
		
		System.out.println("");
		
		System.out.println("Digite o valor do fim:");
		int v2 = scan.nextInt();
		
		System.out.println("");		

	
		for (int i = v1+1; i < v2; i++) {
			System.out.println(i);
		}
	}
	
}