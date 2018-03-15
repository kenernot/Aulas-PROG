public abstract class ClassePai {
	
	protected int valorPai;
	
	public ClassePai(int umParametro) {
		System.out.println("Construtor do pai executado!");
		this.valorPai = umParametro;
	}
	
	public abstract void umMetodoSemRetorno();
	
}