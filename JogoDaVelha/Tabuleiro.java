public class Tabuleiro {
	
	private int nJogada;
	private Jogador jogador;
	private Quadrante q_1;
	private Quadrante q_2;
	private Quadrante q_3;
	private Quadrante q_4;
	private Quadrante q_5;
	private Quadrante q_6;
	private Quadrante q_7;
	private Quadrante q_8;
	private Quadrante q_9;

	public Tabuleiro() {
		this.q_1 = new Quadrante();
		this.q_2 = new Quadrante();
		this.q_3 = new Quadrante();
		this.q_4 = new Quadrante();
		this.q_5 = new Quadrante();
		this.q_6 = new Quadrante();
		this.q_7 = new Quadrante();
		this.q_8 = new Quadrante();
		this.q_9 = new Quadrante();
	}

	public void desenharTabuleiro() {
		System.out.printf("| %s | %s | %s |\n", q_1.getTipo(), q_2.getTipo(), q_3.getTipo());
		System.out.println("-------------");
		System.out.printf("| %s | %s | %s |\n", q_4.getTipo(), q_5.getTipo(), q_6.getTipo());
		System.out.println("-------------");
		System.out.printf("| %s | %s | %s |\n", q_7.getTipo(), q_8.getTipo(), q_9.getTipo());
	}

	public int getNJogada() {
		return this.nJogada;
	}

	public void jogar(int quadrante) {
		switch (quadrante) {
			case 1: q_1.preencher(jogador.getTipo());
				break;
			case 2: q_2.preencher(jogador.getTipo());
				break;
			case 3: q_3.preencher(jogador.getTipo());
				break;
			case 4: q_4.preencher(jogador.getTipo());
				break;
			case 5: q_5.preencher(jogador.getTipo());
				break;
			case 6: q_6.preencher(jogador.getTipo());
				break;
			case 7: q_7.preencher(jogador.getTipo());
				break;
			case 8: q_8.preencher(jogador.getTipo());
				break;
			case 9: q_9.preencher(jogador.getTipo());
				break;
			default: System.out.println("Quadrante inexistente!");	
				break;
			this.nJogada += 1;		
		}		
	}
	public Jogador getJogadorAtual() {
		return this.jogador;
	}
	public void setJogadorAtual(Jogador jogadorAtual){
		this.jogador = jogadorAtual;
	}
	public boolean ganhou() {
		// este método precisa de bastante cariho e atenção
		// aqui deve fazer uma grande comparação das possíveis jogadas vencedoras e retornar verdadeiro se alguém ganhou
		//por padrão está retornando false.	

		//Aqui o alisson faz :D

		return false;
	}


}