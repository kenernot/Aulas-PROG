public class Soma extends Operacao {
	
	public Soma(int t1, int t2){
		super(t1,t2);
	}
	
	public Resultado getResultado(){
		int res = this.termo1 + this.termo2;
		Resultado r = 
		new Resultado("O resultado é "+res);
		return r;
	}
	
}