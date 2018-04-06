import java.util.Random;

public class EX001 {

	

	public EX001() {
		int[] array= new int[100];
		Random ran = new Random();
		int soma = 0;
		for (int i=0; i < 100; i++) {
			array[i] = ran.nextInt(1000);
			soma += array[i];
		}
		System.out.println("O total da soma é "+ soma);
	}


}