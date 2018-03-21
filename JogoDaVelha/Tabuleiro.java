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

	public void desenharTabuleiro(int primeiraVez) {
		if (primeiraVez == 0) {
			System.out.printf("| %s | %s | %s |\n", this.q_1.getTipo(), this.q_2.getTipo(), this.q_3.getTipo());
			System.out.println("-------------");
			System.out.printf("| %s | %s | %s |\n", this.q_4.getTipo(), this.q_5.getTipo(), this.q_6.getTipo());
			System.out.println("-------------");
			System.out.printf("| %s | %s | %s |\n", this.q_7.getTipo(), this.q_8.getTipo(), this.q_9.getTipo());
		} else {
			System.out.printf("| 1 | 2 | 3 |\n", this.q_1.getTipo(), this.q_2.getTipo(), this.q_3.getTipo());
			System.out.println("-------------");
			System.out.printf("| 4 | 5 | 6 |\n", this.q_4.getTipo(), this.q_5.getTipo(), this.q_6.getTipo());
			System.out.println("-------------");
			System.out.printf("| 7 | 8 | 9 |\n", this.q_7.getTipo(), this.q_8.getTipo(), this.q_9.getTipo());			
		}
	}

	public int getNJogada() {
		return this.nJogada;
	}

	public boolean jogar(int quadrante) {
		boolean pass = true;
		
		if (quadrante == 1) {
			if (this.q_1.isPreenchido()) {
				pass = false;
			} else {
				this.q_1.preencher(jogador.getTipo());
			}
		} else if (quadrante == 2) {
			if (this.q_2.isPreenchido()) {
				pass = false;
			} else {
				this.q_2.preencher(jogador.getTipo());
			}
		} else if (quadrante == 3) {
			if (this.q_3.isPreenchido()) {
				pass = false;
			} else {
				this.q_3.preencher(jogador.getTipo());
			}
		} else if (quadrante == 4) {
			if (this.q_4.isPreenchido()) {
				pass = false;
			} else {
				this.q_4.preencher(jogador.getTipo());
			}
		} else if (quadrante == 5) {
			if (this.q_5.isPreenchido()) {
				pass = false;
			} else {
				this.q_5.preencher(jogador.getTipo());
			}
		} else if (quadrante == 6) {
			if (this.q_6.isPreenchido()) {
				pass = false;
			} else {
				this.q_6.preencher(jogador.getTipo());
			}
		} else if (quadrante == 7) {
			if (this.q_7.isPreenchido()) {
				pass = false;
			} else {
				this.q_7.preencher(jogador.getTipo());
			}
		} else if (quadrante == 8) {
			if (this.q_8.isPreenchido()) {
				pass = false;
			} else {
				this.q_8.preencher(jogador.getTipo());
			}
		} else if (quadrante == 9) {
			if (this.q_9.isPreenchido()) {
				pass = false;
			} else {
				this.q_9.preencher(jogador.getTipo());
			}
		}

		if (pass == true) {
			this.nJogada += 1;
		}

		return pass;
				
	}

	public Jogador getJogadorAtual() {
		return this.jogador;
	}
	public void setJogadorAtual(Jogador jogadorAtual){
		this.jogador = jogadorAtual;
	}
	public boolean ganhou() {
		boolean win = false;
		if (this.q_1.getTipo() == this.q_2.getTipo() && this.q_2.getTipo() == this.q_3.getTipo() && this.q_2.isPreenchido()) {
			System.out.println ("Você Ganhou! 1");
			win = true;
		} else if ( this.q_4.getTipo() == this.q_5.getTipo() && this.q_5.getTipo() == this.q_6.getTipo() && this.q_5.isPreenchido() ) {
			System.out.println ("Você Ganhou! 2");
			win = true;
		} else if (this.q_7.getTipo() == this.q_8.getTipo() && this.q_8.getTipo() == this.q_9.getTipo() && this.q_8.isPreenchido()) {
			System.out.println ("Você Ganhou! 3");
			win = true;
		} else if (this.q_1.getTipo() == this.q_5.getTipo() && this.q_5.getTipo() == this.q_9.getTipo() && this.q_5.isPreenchido()) {
			System.out.println ("Você Ganhou! 4");
			win = true;
		} else if (this.q_3.getTipo() == this.q_5.getTipo() && this.q_5.getTipo() == this.q_7.getTipo() && this.q_5.isPreenchido()) {
			System.out.println ("Você Ganhou! 5");
			win = true;
		} else if (this.q_1.getTipo() == this.q_4.getTipo() && this.q_4.getTipo() == this.q_7.getTipo() && this.q_4.isPreenchido()) {
			System.out.println ("Você Ganhou! 6");
			win = true;
		} else if (this.q_2.getTipo() == this.q_5.getTipo() && this.q_5.getTipo() == this.q_8.getTipo() && this.q_5.isPreenchido()) {
			System.out.println ("Você Ganhou! 7");
			win = true;
		} else if (this.q_3.getTipo() == this.q_6.getTipo() && this.q_6.getTipo() == this.q_9.getTipo() && this.q_6.isPreenchido()) {
			System.out.println ("Você Ganhou! 8");
			win = true;
		} else if (getNJogada() == 9) {
			System.out.println ("Empate");
			win = true;
		}
		//Está Feito :)

		return win;
	}


}