public class EX004 {
	public EX004() {
		System.out.println("");
		System.out.println("*--- Iniciando exercício 004 ---*");
		
		doSoma();
		doMult();
		
		System.out.println("*--- ENCERRANDO ---*");
	}
	
	private void doSoma() {
		int soma = 0;
		for (int i = 0; i < 31; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.println("Soma = " + soma);
	}
	
	private void doMult() {
		double mult = 1;
		for (int i = 1; i < 31; i++) {
			if (i % 2 == 0) {
				mult = mult * i;
			}
		}
		
		System.out.println("Multiplicação = " + mult);		
	}
}