import java.util.Random;

public class Principal {
	
	public static void main(String[] args) {
		Random random = new Random();
		Pessoa[] MinhasPessoas;
		MinhasPessoas = new Pessoa[100];
		for (int i = 0; i < 100; i++) {
			MinhasPessoas[i] = new Pessoa("JOAO", random.nextInt(100));
			System.out.printf("[%d] %s tem %d anos", i, MinhasPessoas[i].getNome(), MinhasPessoas[i].getIdade());
			System.out.println("");
		}
	}
	
}