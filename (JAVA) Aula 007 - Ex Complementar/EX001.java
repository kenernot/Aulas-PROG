import java.util.Scanner;

public class EX001 {
	
	public EX001 () {
		System.out.println("");
		Scanner scan = new Scanner(System.in);
		Pessoa[] MinhasPessoas;
		MinhasPessoas = new Pessoa[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("*--- CADASTRANDO ["+(i+1)+"] ---*");
			System.out.println("[" + (i+1) + "] Digite o nome da pessoa: ");
			String nome = scan.next();
			System.out.println("[" + (i+1) + "] Digite a idade da pessoa: ");
			int idade = scan.nextInt();
			MinhasPessoas[i] = new Pessoa(nome, idade);
			System.out.println("*--- CADASTRADO ---*");
		}
		
		System.out.println("");
		
		int maior = 0;
		int menor = 0;
		
		for (int i = 0; i < 3; i++) {
			if (MinhasPessoas[menor].getIdade() > MinhasPessoas[i].getIdade()) {
				menor = i;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			if (MinhasPessoas[maior].getIdade() < MinhasPessoas[i].getIdade()) {
				maior = i;
			}
		}
		
		System.out.println("O mais velho é: "+ MinhasPessoas[maior].getNome()+ " com "+ MinhasPessoas[maior].getIdade()+" anos.");
		System.out.println("O mais novo é: "+ MinhasPessoas[menor].getNome()+ " com "+ MinhasPessoas[menor].getIdade()+" anos.");
		
		System.out.println("*--- ENCERRANDO ---*");
	}
	
}