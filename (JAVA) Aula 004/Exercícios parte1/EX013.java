import java.util.Scanner;

public class EX013 {
	
	public EX013() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Este software exibe a tabuada do número informado!");
		
		System.out.println("Digite o número:");
		int v1 = scan.nextInt();

		for (int i = 0; i < 11; i++) {
			int conta = v1 * i;
			System.out.printf("%d x %d = %d \n", v1, i, conta);
		}
	}
	
}