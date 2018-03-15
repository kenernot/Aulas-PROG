public class MinhaClasse extends ClassePai {
	
	private int numero; //atributo do objeto no escopo da classe
	private static int contador = 0;//atributo estático da classe 
	
	public MinhaClasse(int algumParametro, int outroParametro) { //Construtor
		super(algumParametro);
		System.out.println("Construtor da minha classe executado!");
		this.numero = outroParametro;
		String s = "variável no escopo do método";
		MinhaClasse.contador++;
		System.out.printf("O valor de s é %s \r\n",s);
	}
	public static void main(String[] args) {
		//método principal
		MinhaClasse meuObjeto = new MinhaClasse(1,2);
		String retorno = meuObjeto.facaAlgumaCoisa();
		System.out.printf("O retorno é %s \r\n",retorno);
		MinhaClasse meuObjeto1 = new MinhaClasse(2,3);
		meuObjeto1.umMetodoSemRetorno();
		MinhaClasse.mostraContador();
		ClassePai outroObjeto = new MinhaClasse(4,5);
		//ClassePai maisUmObjeto = new ClassePai(4); //gera um erro, pois classe pai é estática e não pode ser construída!
		MinhaClasse.mostraContador();
	}
	
	public String facaAlgumaCoisa() {
		this.umMetodoSemRetorno();
		System.out.printf("O valor do atributo do pai é %d \r\n",this.valorPai);
		return "eu chamei um outro método desta classe e estou retornando este texto!!!";
	}
	
	public void umMetodoSemRetorno() {
		//System.out.printf("O valor de s é %s \r\n",s); //gera erro, pois neste escopo não tem s
		System.out.println("Método sobrescrito do Pai!");
	}
	
	public static void mostraContador(){
		System.out.printf("o contador está em %d \r\n",MinhaClasse.contador);
	}
	
}