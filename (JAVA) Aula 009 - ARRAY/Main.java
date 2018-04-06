import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nDigitado = 0;
		while (nDigitado != 4) {
			imprimeLista();
			nDigitado = scan.nextInt();
			if (nDigitado == 1) {
				EX001 ex1 = new EX001();
			} else if (nDigitado == 2) {
				EX002 ex2 = new EX002();
			} else if (nDigitado == 3) {
				EX003 ex3 = new EX003();
			} else if (nDigitado == 4) {
				System.out.println("Finalizando :D");
			} else {
				System.out.println("Código inválido!");
			}
		}
	}

	private static void imprimeLista() {
		System.out.println("***------------------------***");
		System.out.println("Digite o número para iniciar o exercício: \n"+
			"1- 100 números aleatórios de 0 à 1000.\n"+
			"2- Vetor de 4 notas e calcular média.\n"+
			"3- Sistema de compras.\n"+
			"4- Finaliza o este software.");
		System.out.println("***------------------------***");

	}

}