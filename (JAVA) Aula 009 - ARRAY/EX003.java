import java.util.Scanner;

public class EX003 {

	private int[] meusCodigos = {10,20,30,40,50};
	private String[] minhasDescricoes = {"Celular", "Tablet", "TV", "Notebook", "Computador de mesa"};
	private float[] meusValores = {1250F, 1789F, 4250F, 3750F, 3500F};
	private Integer[] minhasCompras = new Integer[10];

	public EX003() {

		boolean finalizado = false;
		imprimeLista();
		Scanner scan = new Scanner(System.in);
		while (finalizado == false) {
			int nDigitado = 0;
			imprimeMinhasCompras();
			
			while (		!(nDigitado >0 && nDigitado<4)) {
				imprimeOpcoes();
				nDigitado = scan.nextInt();
				//Caso seleciona para adicionar
				if (nDigitado == 1) {
					boolean pass = false;
					boolean pass2 = false;
					if (isFull()) {
						System.out.println("Lista cheia, remova algum item!");
					} else {
						while (!pass) {
							System.out.print("Digite o codigo do produto que deseja adicionar: ");
							nDigitado = scan.nextInt();
							for (int i = 0; i < 5; i++) {
								if (nDigitado == meusCodigos[i]) {
									pass = true;
									break;
								} else {
									if (i == 4) {
										System.out.println("Código inválido!");
									}
								}
							}
						}

						while (!pass2) {
							imprimeMinhasCompras();
							System.out.print("Digite em qual posição deseja colocar: ");
							int nDigitado2 = scan.nextInt();
							if (nDigitado2 > -1 && nDigitado2 < 10) {
								if (minhasCompras[nDigitado2] == null) {
									minhasCompras[nDigitado2] = nDigitado;
									pass2 = true;
								} else {
									System.out.println("Posição inválida!");
								}
							} else {
								System.out.println("Posição inválida!");
							}
						}

					}			

				} else if (nDigitado == 2) {
					if (isEmpty()) {
						System.out.println("Carrinho vazio, não há o que remover!");
					} else {
						boolean pass = false;
						while (!pass) {
							imprimeMinhasCompras();
							System.out.println("Digite a compra que deseja remover: ");
							nDigitado = scan.nextInt();
							if (nDigitado > -1 && nDigitado < 10) {
								if (minhasCompras[nDigitado] != null) {
									minhasCompras[nDigitado] = null;
									pass = true;
								} else {
									System.out.println("Posição inválida!");
								}
							} else {
								System.out.println("Posição inválida!");
							}
						}
					}
				} else if (nDigitado == 3) {
					if (isEmpty()) {
						System.out.println("Você não comprou nada, até mais o/");
						finalizado = true;
					} else {
						imprimeMinhasCompras();
						float soma = 0;
						for (int i=0; i < 10; i++) {

							if (minhasCompras[i] != null) {

								int indiceCodigo = -1;
								for (int indiceCodigos = 0; indiceCodigos < 5; indiceCodigos++) {
									if (meusCodigos[indiceCodigos] == minhasCompras[i]) {
										indiceCodigo = indiceCodigos;
										break;
									}
								} 

								soma += meusValores[indiceCodigo];
								
							}

						}
						System.out.printf("Suas compras resultaram em um total de R$%.2f \n",soma);
						finalizado = true;
					}
				} else {
					System.out.println("Número inválido!");
				}
				
			}
		}

	}

	private void imprimeLista() {
		System.out.println("|COD 	|DESCRICAO				|VALOR|");
		for (int i = 0; i < 5; i++) {
			System.out.println("|"+this.meusCodigos[i]+" 	|"+this.minhasDescricoes[i]+"				|"+this.meusValores[i]+"|");
		}
		System.out.println("*	*	*	*	*	*	*	*	*	*	*");
	}

	private void imprimeOpcoes() {
		System.out.println("\nEscolha uma das opções abaixo: \n"+
			"1- Adicionar produto\n"+
			"2- Remover produto\n"+
			"3- Finalizar pedido");
	}

	private void imprimeMinhasCompras() {
		System.out.println("\nSuas compras no momento são: ");
		for (int i = 0; i < 10; i++) {
			if (minhasCompras[i] == null) {
				System.out.println("Espaço ["+i+"] do carrinho possui: Nada");
			} else {
				int indiceCodigo = -1;
				for (int indiceCodigos = 0; indiceCodigos < 5; indiceCodigos++) {
					if (meusCodigos[indiceCodigos] == minhasCompras[i]) {
						indiceCodigo = indiceCodigos;
						break;
					}
				}
				System.out.println("Espaço ["+i+"] do carrinho possui: ("+minhasCompras[i]+") "+ minhasDescricoes[indiceCodigo]);
			}
		}
	}

	private boolean isEmpty() {
		boolean itIs = true;
		for (int i =0; i < 10; i++) {
			if (minhasCompras[i] != null) {
				itIs = false;
			}
		}

		return itIs;
	}

	private boolean isFull() {
		boolean itIs = true;
		for (int i =0; i < 10; i++) {
			if (minhasCompras[i] == null) {
				itIs = false;
			}
		}

		return itIs;
	}


}