public class Jogador {

	// este cara precisa ter ao menos nome e tipo (X ou O)
	// é necessário encapsular os atributos para garantir a integridade dos dados
	// você deve obrigar nome e tipo quando o objeto for criado
	// fazer métodos para pegar o nome e o tipo

	private String nome;
	private String tipo;

	public Jogador(String nome, String tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}
}