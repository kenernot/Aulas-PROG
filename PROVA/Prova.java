import java.util.Scanner;

public class Prova {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Float[] valores = new Float[4];
		String[] supp = {"primeiro","segundo","terceiro","quarto"};
		Float media = 0.00F;
		for (int i = 0; i < 4; i++) {
			System.out.print("Digite o "+supp[i]+" valor: ");
			valores[i] = scan.nextFloat();
			media += valores[i];
		}
		System.out.println("Media: "+media/4);
	}
}