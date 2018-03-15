public class ArCondicionado {
	
	public String status;
	public int temperatura;
	
	public ArCondicionado() {
		this.status = "desligado";
		this.temperatura = 26;
	}
	
	public void power() {
		if (status.equals("desligado")) {
			this.status = "ligado";
			System.out.println("Ar ligado");
			System.out.println("Temperatura "+ this.temperatura);
		} else {
			this.status = "desligado";
			System.out.println("Ar desligado");
		}
	}
	
}