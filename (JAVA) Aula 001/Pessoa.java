public class Pessoa {
	
	public String nome;
	private int idade;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String whatIsYourName() {
		return this.nome + " tem " + idade;
	}
	
	public void setIdade(int idade) {
		if (idade < 100) {
			this.idade = idade;
		}
	}
	
}