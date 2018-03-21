public class Quadrante {

	private boolean estado;
	private String tipo;
	
	public Quadrante() {
		this.estado = false;
		this.tipo = " ";
	}
	
	public void preencher(String tipo) {
		this.estado = true;
		this.tipo = tipo;
	}

	public boolean isPreenchido() {
		return this.estado;
	}

	public String getTipo() {
		return this.tipo;
	}
	

}