import java.util.Scanner;
import java.util.Random;

public class EX020 {
	
	public EX020() {
		Scanner scan = new Scanner(System.in);
		
		Random ran = new Random();
		int aleatorio = ran.nextInt(100);
		
		int tentativasMax = 7;
		int tentativasAtuais = tentativasMax;
		boolean venceu = false;
		String dificuldade = "";
		
		System.out.println("Este software é um jogo de tentar acertar o número aleatório (0-100) :D");
		
		//System.out.println(aleatorio);
		
		System.out.println("Escolha uma dificuldade:");
		System.out.println("0 - FACIL");
		System.out.println("1 - DIFICIL");
		System.out.println("************");
		while (!dificuldade.equals("0") && !dificuldade.equals("1")) {
			dificuldade = scan.next();
			if (dificuldade.equals("GOD")) { System.out.println(aleatorio + " :)"); }
			if (!dificuldade.equals("0") && !dificuldade.equals("1")) { System.out.println("Inválido!"); }
			System.out.println("************");
		}
		
		boolean space = false;
		while (tentativasAtuais != 0 && venceu == false) {
			
			if (space == false) {
				space = true;
				System.out.println("");
			}
			System.out.println("Digite um número: (" + tentativasAtuais + ")");
			String nDigitado = scan.next();
			
			if (nDigitado.equals("q")) {
				System.out.println("");
				System.out.println("---ENCERRANDO JOGO---");
				System.out.println("");
			} else if (Integer.parseInt(nDigitado) == aleatorio) {
				System.out.println("");
				System.out.println("Parabéns! Você acertou :)");
				venceu = true;
			} else {
				System.out.println("");
				System.out.println("Que pena, você errou :c");
				if (dificuldade.equals("0")) {
					if (Integer.parseInt(nDigitado) < aleatorio) {
						System.out.println(" ** É maior :) **");
					} else {
						System.out.println(" ** É menor :) **");
					}
				} 
				tentativasAtuais -= 1;
				if (tentativasAtuais == 0) { 
					System.out.println("");
					System.out.println("Opa! Suas tentativas acabaram :c (" + aleatorio +")");
				}
			}
		}
	}
	
}