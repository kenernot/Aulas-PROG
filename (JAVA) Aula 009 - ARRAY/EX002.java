import java.util.Scanner;

public class EX002 {

	public EX002() {
		Scanner scan = new Scanner(System.in);
		int[] minhasNotas = new int [4];
		String[] whatIs = {"primeira", "segunda", "terceira", "quarta"};
		//
		float media = 0;

		for (int i =0; i < 4; i++) {
			System.out.print("\nDigite a "+whatIs[i]+" nota: ");
			minhasNotas[i] = scan.nextInt();
			media += minhasNotas[i];
		}

		media /= 4;

		System.out.println("Resultado: "+media);

	}

}