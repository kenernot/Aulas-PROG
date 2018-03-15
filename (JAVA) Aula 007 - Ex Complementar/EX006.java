import java.util.Scanner;

public class EX006 {
	public EX006() {
		System.out.println("");
		
		System.out.println("*--- Iniciando exercicio 006 ---*");
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite o custo do produto (R$) : ");
		float pCusto = scan.nextFloat();
		System.out.println("Digite o ICMS da venda (%) : ");
		float pICMS = scan.nextFloat();		
		System.out.println("Digite o PIS (%) : ");
		float pPIS = scan.nextFloat();	
		System.out.println("Digite os Cofins (%) : ");
		float pCofins = scan.nextFloat();
		System.out.println("Digite o percentual de comissões (%) : ");
		float pComissao = scan.nextFloat();
		System.out.println("Digite as despesas administrativas (%) : ");
		float pDespesas = scan.nextFloat();
		System.out.println("Digite o lucro esperado (%) : ");
		float pLucro = scan.nextFloat();

		float CustoTotal = pCofins + pComissao + pDespesas + pICMS + pLucro + pPIS;
		float MKD = (100 - (CustoTotal) ) / 100;
		float PrecoVenda = pCusto / MKD;
		
		System.out.println("Preço de venda: " + PrecoVenda);
		
		System.out.println("*--- ENCERRANDO ---*");
	}
}