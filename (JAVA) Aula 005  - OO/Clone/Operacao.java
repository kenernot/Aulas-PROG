public abstract class Operacao {
	
	protected int termo1;
	protected int termo2;
	/**
	* private int termo1,termo2;
	*/
	public Operacao(int t1, int t2) {
		this.termo1 = t1;
		this.termo2 = t2;
	}
	
	public abstract Resultado getResultado();
	
}