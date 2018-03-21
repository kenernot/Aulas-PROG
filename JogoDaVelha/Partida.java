import java.util.Scanner; 
import java.util.Random; 

public class Partida {

	private int quemJogando;
	private Tabuleiro tabuleiro;
	private Jogador jogador_1;
	private Jogador jogador_2;
	private int whoStarts;
	
	public Partida() {

		String nome = "";
		String tipo = "";

		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		

		whoStarts = random.nextInt(99);
		if (whoStarts % 2 == 0) {
			whoStarts = 2;
		} else {
			whoStarts = 1;
		}
	
		

		System.out.println("*--- Jogo da velha ---*");
		System.out.println("Digite o nome do primeiro jogador: ");
		nome = scan.next();

		while (!tipo.equals("X") && !tipo.equals("0")) {
			System.out.println("Digite o tipo do primeiro jogador (X ou 0 (zero)): ");
			tipo = scan.next().toUpperCase();

		}
		this.jogador_1 = new Jogador(nome, tipo);

		System.out.println("Digite o nome do segundo jogador: ");
		nome = scan.next();
		if (this.jogador_1.getTipo() == "X") {
			tipo = "0";
		} else {
			tipo = "X";
		}

		this.jogador_2 = new Jogador(nome, tipo);

	}

	public void play() {
		boolean exit = false;
		while (!exit) {
			this.tabuleiro = new Tabuleiro();
			if (whoStarts == 1) {
				System.out.printf("Por acaso, quem começa jogando é: %s\n", this.jogador_1.getNome());
			} else {
				System.out.printf("Por acaso, quem começa jogando é: %s\n", this.jogador_2.getNome());
			}
			
			boolean primeiraVez = true;
			int movimento;
			Scanner scan = new Scanner(System.in);
			
			String playAgain = "";

			while (this.tabuleiro.ganhou() != true && this.tabuleiro.getNJogada() < 10) {
				System.out.println("");
				if (primeiraVez) {
					this.tabuleiro.desenharTabuleiro(1);
					primeiraVez = false;
				} else {
					this.tabuleiro.desenharTabuleiro(0);
				}

				boolean pass = false;

				
				if (whoStarts == 1) {
					this.tabuleiro.setJogadorAtual(this.jogador_1);
					System.out.printf("Jogador %s faça seu movimento!\n", this.jogador_1.getNome());
				} else {
					this.tabuleiro.setJogadorAtual(this.jogador_2);
					System.out.printf("Jogador %s faça seu movimento!\n", this.jogador_2.getNome());
				}

				while (pass == false) {
					movimento = scan.nextInt();
					if (movimento > 0 && movimento < 10) {
						if (!this.tabuleiro.jogar(movimento)) {
							System.out.println("Quadrante já preenchido, informe um novo quadrante!");
							this.tabuleiro.desenharTabuleiro(0);
							pass = false;
						} else {
							pass = true;
						}
					} else {
						System.out.println("Digite um valor de 1 a 9!");
						pass = false;
					}
				}

				if (whoStarts == 1) {
					whoStarts = 2;
				} else {
					whoStarts = 1;
				}

			}

			this.tabuleiro.desenharTabuleiro(0);

			System.out.println("Deseja jogar novamente?");
			System.out.println("(Digite 'S' para sim e qualquer outra coisa para não.)");
			playAgain = scan.next().toUpperCase();
			if (!playAgain.equals("S")) {
				exit = true;
			}
		}
	}

}