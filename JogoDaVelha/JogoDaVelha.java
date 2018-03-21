import java.util.Scanner; //utilize o scanner para interagir com o usuário

public class JogoDaVelha {
	
	public static void main(String[] args) {
		//o jogo inicia aqui
		// você deve instanciar um objeto do tipo Partida 
		// depois disso, se o usuário desejar, de o play no objeto partida para começar a brincadeira.
		Scanner scan = new Scanner(System.in);

		System.out.println("Tu tu ru :)");

		String play = "";

		Partida Game = new Partida();
		while (!play.equals("P")) {
			System.out.println("Digite 'P' para iniciar a partida!");
			play = scan.next().toUpperCase();
		}
		Game.play();
	}

}