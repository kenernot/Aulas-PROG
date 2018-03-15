import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o exercício que quer abrir:");
		System.out.println("01 - Este software soma dois números e exibe seu valor!");
		System.out.println("02 - Este software soma quatro números e exibe a média!");
		System.out.println("03 - Este software exibe o produto de três números!");
		System.out.println("04 - Este software exibe o IMC!");
		System.out.println("05 - Este software exibe se está reprovado ou não baseado na sua média!");
		System.out.println("06 - Este software exibe se um número é impar ou par!");
		System.out.println("11 - Este software exibe os números de 0 a 100!");
		System.out.println("12 - Este software exibe os números no intervalo dentre os números passados");
		System.out.println("13 - Este software exibe a tabuada do número informado!");
		System.out.println("20 - Este software é um jogo de tentar acertar o número aleatório :D");
		
		
		int exerciseNumber = scan.nextInt();
		System.out.println("");
		switch (exerciseNumber) {
			case 1: EX001 exercicio1 = new EX001();
				break;
		
			case 2: EX002 exercicio2 = new EX002();
				break;

			case 3: EX003 exercicio3 = new EX003();
				break;

			case 4: EX004 exercicio4 = new EX004();
				break;
				
			case 5: EX005 exercicio5 = new EX005();
				break;

			case 6: EX006 exercicio6 = new EX006();
				break;				
				
			case 11: EX011 exercicio11 = new EX011();
				break;

			case 12: EX012 exercicio12 = new EX012();
				break;
				
			case 13: EX013 exercicio13 = new EX013();
				break;

			case 20: EX020 exercicio20 = new EX020();
				break;					
				
		
			default: System.out.println("Exercício inválido!");
				break;
			
		}
		
	}
	
}