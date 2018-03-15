public class Hello {
	public static void main(String[] args) {
		Pessoa p = new Pessoa(args[0]);
		p.setIdade(65);
		System.out.println("Hello! " + p.whatIsYourName());
	}
}