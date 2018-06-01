public class Hello {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Josicleison");
		p.setIdade(65);
		System.out.println("Hello! " + p.whatIsYourName());
	}
}