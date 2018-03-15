import java.util.Scanner;

public class Aula {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int idade;
		String nome;
		System.out.println("Escreve sua idade ai p@R#!");
		idade = scan.nextInt();
		System.out.println("Escreve seu NOME ai p@R#!");
		nome = scan.next();
		System.out.println( nome +", sua idade é " + idade );
		
	}
	
}