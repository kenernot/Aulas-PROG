public class Morcego extends Mamifero implements Voador {

	public void voar() {
		System.out.println("Voando...");
	}

	public Morcego(String nome) {
		super(nome);
	}

}