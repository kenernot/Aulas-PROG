import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Qual operação você deseja fazer?");
		String entrada = input.next();
		Operacao op = null;
		
		System.out.println("Informe o primeiro termo:");
		int t1 = input.nextInt();
		System.out.println("Informe o segundo termo:");
		int t2 = input.nextInt();
		
		if (entrada.equals("+")) {
			op = new Soma(t1,t2);
		} else if (entrada.equals("-")) {
			op = new Subtracao(t1,t2);
		} else if (entrada.equals("*")) {
			op = new Multiplicacao(t1,t2);
		} else if (entrada.equals("/")) {
			op = new Divisao(t1,t2);
		}
		
		Resultado res = op.getResultado();
		res.mostrarResultado();
	}
}