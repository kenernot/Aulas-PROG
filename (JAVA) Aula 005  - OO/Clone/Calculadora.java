import java.util.Scanner;


public class Calculadora {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual operação você "+
		" deseja fazer ?");
		
		String entrada = scan.next();
		
		Operacao op;
		op = null;
		
		if ( entrada.equals("+") ) {
			System.out.println("informe o primeiro termo!");
			int c1 = scan.nextInt();
			System.out.println("informe o segundo termo!");
			int c2 = scan.nextInt();
			
			op = new Soma(c1,c2);
		} else if ( entrada.equals("-") ) {
			
			System.out.println("informe o primeiro termo!");
			int c1 = scan.nextInt();
			System.out.println("informe o segundo termo!");
			int c2 = scan.nextInt();
			
			op = new Subtracao(c1,c2);
		}
		
		Resultado res = op.getResultado();
		res.mostrarResultado();
	}
	
}