public class Chassis {
	
	private int reqPotencia;
	
	public Chassis(int numeroEixos) {
		this.reqPotencia = numeroEixos * 2;
	}
	
	public int getRequisitoPotencia() {
		return this.reqPotencia;
	}
	
}