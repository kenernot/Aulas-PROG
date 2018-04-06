public class Mamifero extends Animal {

	public Mamifero(String nome) {
		super(nome);
	}

	public void mamar() {
		System.out.print("Eu sou " + this.getNome());
		System.out.println(" Estou mamando!");
	}

}