import java.util.Scanner; 
import java.util.Random; 

public class Partida {

	private int quemJogando;
	private Tabuleiro tabuleiro;
	private Jogador jogador_1;
	private Jogador jogador_2;
	private int whoStarts;
	
	public Partida() {
		// Aqui é o construtor, quando a partida for construida, você precisa definir quem está jogando
		// além de fazer o necessário para rodar o jogo.

		String nome;
		String tipo;

		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		whoStarts = random.nextInt(99);
		if (whoStarts % 2 == 0) {
			whoStarts = 2;
		} else {
			whoStarts = 1;
		}

		this.jogador_1 = new Jogador(nome, tipo);
		this.jogador_2 = new Jogador(nome, tipo);

		
		System.out.println("*--- Jogo da velha ---*");
		System.out.println("Digite o nome do primeiro jogador: ");
		nome = scan.next();

		while () {
			System.out.println("Digite o tipo do primeiro jogador: ");
		}	
	}

	public void play() {
		// aqui você faz o laço para que ambos joguem até que alguém acerte
	}

}