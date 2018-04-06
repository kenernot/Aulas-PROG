public class Exemplo {

	public static void main(String[] args) {
		//Cachorro dog = new Cachorro("Rodolfo");
		Animal pitoco = new Cachorro("Pitoco");
		Animal batman = new Morcego("Bruce");

		System.out.println(pitoco.getNome());
		System.out.println(batman.getNome());


		Mamifero pit = (Mamifero) pitoco;
		pit.mamar();

		Morcego bat = (Morcego) batman;
		bat.voar();

		Cachorro c = (Cachorro) pitoco;
		c.latir();
	}

}